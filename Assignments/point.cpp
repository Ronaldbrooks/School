#include "point.h"
#include <cmath>

using namespace std;
namespace rotation
{  
    point::point(double initial_x, double initial_y, double initial_z)
    {
        x = initial_x= 0.0;   // Constructor sets the point to a given position.
        y = initial_y= 0.0;
        z = initial_z= 0.0;
    }

    
    void point::shift(double x_amount, double y_amount, double z_amount)
    {
        x += x_amount;
        y += y_amount;
        z += z_amount;
    }

    
    void point::rotate90( )
    {
        double new_x;
        double new_y;
        double new_z;

        new_x = y;  // For a 90 degree clockwise rotation, the new x is the original y,
        new_y = -x; // and the new y is -1 times the original x.
        new_z = -y;
        x = new_x;
        y = new_y;
        z = new_z;
    }
    
    void point::rotate_x_axis(double initial_x, double initial_y, double initial_z)
    {
        initial_x = initial_x;
        initial_y = initial_y*cos - z*sin*;
        initial_z = initial_y*sin + z cos;
        return <<"X Axis rotation: X - " << x << " Y - " << y << " Z - " << z;
    }
    void point::rotate_y_axis(double initial_x, double initial_y, double initial_z)
    {
        initial_x = initial_x*cos + initial_z*sin;
        initial_y = initial_y;
        initial_z = -sin + initial_z*cos;
        return <<"Y Axis rotation: X - " << x << " Y - " << y << " Z - " << z;
    }
    void point::rotate_z_axis(double initial_x, double initial_y, double initial_z)
    {
        initial_x = initial_x*cos - initial_y*sin;
        initial_y = initial_x*sin + initial_y*cos;
        initial_z = initial_z;
        return <<"Z Axis rotation: X - " << x << " Y - " << y << " Z - " << z;
    }
    
int main()
{
    int x, y, z;
    point call;
    
    cout <<"Enter X: ";
    cin>> x;
    call.rotate_x_axis(x);
    call.rotate_y_axis(x);
    call.rotate_z_axis(x);
    cout <<"Enter Y: ";
    cin>> y;
    call.rotate_x_axis(y);
    call.rotate_y_axis(y);
    call.rotate_z_axis(y);
    cout <<"Enter Z: ";
    cin>> z;
    call.rotate_x_axis(z);
    call.rotate_y_axis(z);
    call.rotate_z_axis(z);
    
    
}
}