#include <iostream>
#include "complex.h"
#include <cmath>

using namespace std;
 
complex::complex()
{
    A = 0;
    B = 0;
}

int main()
{
    double first;
    double second;
    complex call;
    
    cout << "The Equation is A + Bi" << endl;
    cout << "A is a real number" << endl;
    cout << "B is an imaginary number" << endl;
    cout << "i is the square root of -1" << endl;
    cout << "Enter A: " << endl;
    cin >> first;
    call.setA(first);
    cout << "Enter B: " << endl;
    cin >> second;
    call.setB(second);
    double RESULT = call.calculate();
    cout << "The result is : " << RESULT << endl;
}

double complex::calculate() const 
{
    double result =  A + (B*sqrt(-1)); 
}
void complex::setA(double real)
    {
            A = real;
    }
 void complex::setB(double imaginary)
    {
            B = imaginary;
    }   