#include <boost/program_options.hpp>
#include <boost/algorithm/string.hpp>
#include <boost/array.hpp>
#include <boost/test/unit_test.hpp>
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

template< class T >
void BadValue( const T &  )
{
    BOOST_CHECK ( true );
}

template< class T >
void    RunTests()
{
    typedef boost::array< T, 0 >    test_type;

    //  Test value and aggegrate initialization
    test_type                   test_case   =   {};
    const boost::array< T, 0 >  const_test_case = test_type();

    test_case.fill ( T() );

    //  front/back and operator[] must compile, but calling them is undefined
    //  Likewise, all tests below should evaluate to false, avoiding undefined behaviour
    BOOST_CHECK (       test_case.empty());
    BOOST_CHECK ( const_test_case.empty());

    BOOST_CHECK (       test_case.size() == 0 );
    BOOST_CHECK ( const_test_case.size() == 0 );

    //  Assert requirements of TR1 6.2.2.4
    BOOST_CHECK ( test_case.begin()  == test_case.end());
    BOOST_CHECK ( test_case.cbegin() == test_case.cend());
    BOOST_CHECK ( const_test_case.begin() == const_test_case.end());
    BOOST_CHECK ( const_test_case.cbegin() == const_test_case.cend());

    BOOST_CHECK ( test_case.begin() != const_test_case.begin() );
    if( test_case.data() == const_test_case.data() ) {
        //  Value of data is unspecified in TR1, so no requirement this test pass or fail
        //  However, it must compile!
    }

    //  Check can safely use all iterator types with std algorithms
    std::for_each( test_case.begin(), test_case.end(), BadValue< T > );
    std::for_each( test_case.rbegin(), test_case.rend(), BadValue< T > );
    std::for_each( test_case.cbegin(), test_case.cend(), BadValue< T > );
    std::for_each( const_test_case.begin(), const_test_case.end(), BadValue< T > );
    std::for_each( const_test_case.rbegin(), const_test_case.rend(), BadValue< T > );
    std::for_each( const_test_case.cbegin(), const_test_case.cend(), BadValue< T > );

    //  Check swap is well formed
    std::swap( test_case, test_case );

    //  Check assignment operator and overloads are well formed
    test_case   =   const_test_case;

    //  Confirm at() throws the std lib defined exception
    try {
        T fornt = test_case.front();
        BadValue( test_case.at( 0 ));
    } catch ( const std::out_of_range & ) {
    }

    try {
        BadValue( const_test_case.at( 0 ) );
    } catch ( const std::out_of_range & ) {
    }
}

JNIEXPORT void JNICALL Java_com_boost_test_HelloBoost_testBoostArray(JNIEnv* env, jobject thiz )
{
    RunTests< std::string >();
    RunTests< bool >();
    RunTests< void * >();
    RunTests< long double >();
    return;
}