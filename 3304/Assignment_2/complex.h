#ifndef COMPLEX_H
#define COMPLEX_H
using namespace std;

class complex
{
private:
        double A;
        double B;
public:
    complex();
    complex(double real, double imaginary){A = real; B = imaginary;}
    double calculate() const;
    void setA(double real);
    void setB(double imaginary);
};

#endif // COMPLEX_H
