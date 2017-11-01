#include <boost/program_options.hpp>
#include <boost/algorithm/string.hpp>
#include <iostream>
#include <sstream>
#include "first.h"

using namespace std;
using namespace boost::program_options;

string hello_boost(int ac, char* av[])
{
    stringstream out;
    try {
        options_description desc("Allowed options");
        desc.add_options()("help", "produce help message")("change-world", "print args, but replace 'world' with 'boost'");

        variables_map vm;
        store(parse_command_line(ac, av, desc), vm);
        notify(vm);

        if (vm.count("help")) {
            out << desc << "\n";
        }

        if (vm.count("change-world"))
        {
            for (int i=1;i<ac;i++) {
                string arg(av[i]);
                boost::replace_all( arg, "--change-world", "" );
                boost::replace_all( arg, "world", "boost" );
                out << arg << " ";
            }
        }
    }
    catch(exception& e) {
        out << "error: " << e.what() << "\n";
    }
    catch(...) {
        out << "Exception of unknown type!\n";
    }

    return out.str();
}

JNIEXPORT jstring JNICALL Java_com_boost_test_HelloBoost_stringFromJNI( JNIEnv* env, jobject thiz )
{
    const char *args[]={"jni","--change-world","hello","world"};
    std::string result = hello_boost(4,(char **)args);
    const char *c_result = result.c_str();
    return env->NewStringUTF(c_result);
}
