#include <boost/program_options.hpp>
#include <boost/algorithm/string.hpp>
namespace po = boost::program_options;

#include <iostream>
#include <sstream>
using namespace std;

string hello_boost(int ac, char* av[])
{
    stringstream out;

    try {

        po::options_description desc("Allowed options");
        desc.add_options()
            ("help", "produce help message")
            ("change-world", "print args, but replace 'world' with 'boost'")
        ;

        po::variables_map vm;
        po::store(po::parse_command_line(ac, av, desc), vm);
        po::notify(vm);

        if (vm.count("help")) {
            out << desc << "\n";
        }

        if (vm.count("change-world")) {
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
