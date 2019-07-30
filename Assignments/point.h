#ifndef POINT_H 
#define POINT_H         

using namespace std;
namespace rotation
{
    class point
    {
    public:
        // CONSTRUCTOR
        point(double initial_x = 0.0, double initial_y = 0.0, double initial_z = 0.0);
        // MODIFICATION MEMBER FUNCTIONS
        void shift(double x_amount, double y_amount, double z_amount);
        void rotate90( );
        void rotate_x_axis(double initial_x, double initial_y, double initial_z);
        void rotate_y_axis(double initial_x, double initial_y, double initial_z);
        void rotate_z_axis(double initial_x, double initial_y, double initial_z);
        // CONSTANT MEMBER FUNCTIONS
        double get_x( ) const { return x; } 
        double get_y( ) const { return y; }
        double get_z( ) const { return z; }
    private:
        double x; // x coordinate of this point
        double y; // y coordinate of this point
        double z; 
    };
}
#endif //POINT_H 