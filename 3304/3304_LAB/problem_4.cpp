#include <iostream>
#include <iomanip>
#include <cstdlib>
#include <cassert>
using namespace std;

double miles_to_kilometers (double m) 
{
    return 1.6093 * m;
}


void setup_cout_fractions(int fraction_digits)
{
    assert(fraction_digits > 0);
    cout.precision(fraction_digits);
    cout.setf(ios::fixed, ios::floatfield);
    if (fraction_digits == 0)
        cout.unsetf(ios::showpoint);
    else
        cout.setf(ios::showpoint); 
}


int main()
{
    const char HEADING1[] = "    Miles";
    const char HEADING2[] = "  Kilometers";
    const double TABLE_BEGIN =         0.0;
    const double TABLE_END   =         90.0;
    const double TABLE_STEP  =         10.0;
    const int  WIDTH = 9;
    const int  DIGITS = 1;
    
    double value1;
    double value2;
    
    setup_cout_fractions(DIGITS);
    cout << HEADING1 << "  " << HEADING2 << endl;
    
     for (value1 = TABLE_BEGIN; value1 <= TABLE_END; value1 += TABLE_STEP) 
    {      
        value2 = miles_to_kilometers(value1);
        cout << setw(WIDTH) << value1 << "  "; 
        cout << setw(WIDTH) << value2 << endl;
    }
    return EXIT_SUCCESS;
}
