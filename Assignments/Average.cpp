#include <iostream>
#include <iomanip>

using namespace std;

    double triangle(double l)
    {
       double tri = 0.433*l*l;
        return tri;
    }
    
    double square(double l)
    {
       double sq = l*l;
        return sq;
    }
    
    double pentagon(double l)
    {
       double pent = 1.72*l*l;
        return pent;
    }
        
    double hexagon(double l)
    {
       double hex = 2.59808*l*l;
        return hex;
    }
    
    double heptagon(double l)
    {
       double hept = 3.63*l*l;
        return hept;
    }
    
    double octagon(double l)
    {
       double oct = 4.82843*l*l;
        return oct;
    }

int main()
{
    cout << setw(12) << left << "Side Length |" << setw(10) << left << "Triangle |" << setw(10) << left << "Square |" << setw(10) << left << "Pentagon |" 
    << setw(10) << left << "Hexagon |" << setw(10) << left << "Heptagon |" << setw(10) << left << "Octagon" << endl; 
    
    cout << setprecision (2) << fixed << setw(15) << left << "1" << setw(10) << left << triangle(1) << setw(10) << left << square (1) << setw(10) << left << pentagon(1) 
    << setw(10) << left << hexagon(1) << setw(10) << left << heptagon (1) << setw(10) << left << octagon(1) << endl;
    
    cout << setprecision (2) << fixed << setw(15) << left << "2" << setw(10) << left << triangle(2) << setw(10) << left << square (2) << setw(10) << left << pentagon(2) 
    << setw(10) << left << hexagon(2) << setw(10) << left << heptagon (2) << setw(10) << left << octagon(2) << endl;
    
    cout << setprecision (2) << fixed << setw(15) << left << "3" << setw(10) << left << triangle(3) << setw(10) << left << square (3) << setw(10) << left << pentagon(3) 
    << setw(10) << left << hexagon(3) << setw(10) << left << heptagon (3) << setw(10) << left << octagon(3) << endl;
    
    cout << setprecision (2) << fixed << setw(15) << left << "4" << setw(10) << left << triangle(4) << setw(10) << left << square (4) << setw(10) << left << pentagon(4) 
    << setw(10) << left << hexagon(4) << setw(10) << left << heptagon (4) << setw(10) << left << octagon(4) << endl;
    
    cout << setprecision (2) << fixed << setw(15) << left << "5" << setw(10) << left << triangle(5) << setw(10) << left << square (5) << setw(10) << left << pentagon(5) 
    << setw(10) << left << hexagon(5) << setw(10) << left << heptagon (5) << setw(10) << left << octagon(5) << endl;
    
    cout << setprecision (2) << fixed << setw(15) << left << "6" << setw(10) << left << triangle(6) << setw(10) << left << square (6) << setw(10) << left << pentagon(6) 
    << setw(10) << left << hexagon(6) << setw(10) << left << heptagon (6) << setw(10) << left << octagon(6) << endl;

            
        return 0;
}      