
/**
 * Triangle.java
 *
 * @author Kailyn Lau
 * @version v1.0
 */
public class Triangle extends Shape
{
    //instance variables
    protected double a; // side 1
    protected double b; // side 2
    protected double c; // side 3
    
    /**
     * Constructs a triangle of sides a, b, and c.
     * 
     * @param a length of side 1
     * @param b length of side 2
     * @param c length of side 3
     */
    public Triangle(double a, double b, double c) {
        super("triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * calculateArea method implemented for Triangle class
     * 
     * @return the area of the triangle, found by Heron's Formula where s = 1/2(perimeter)
     */
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        if (Double.isNaN(Math.sqrt(s*(s - a)*(s - b)*(s - c)))) {
            return -1;
        } else {
            return Math.sqrt(s*(s - a)*(s - b)*(s - c));
        }
    }
    
    /**
     * calculatePerimeter method implemented for Triangle class
     * 
     * @return the perimeter of the triangle, found by adding the length of the 3 sides together
     */
    public double calculatePerimeter() {
        return a + b + c;
    }
    
    /**
     * @return a String representation of this class
     */
    public String toString() {
        return super.toString() + " (sides: " + this.a + ", " + this.b + ", " + this.c + ")";
    }
    
    /**
     * Driver, used to test this class
     */
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        
        System.out.println("Expected area: 6 | Computed area: " + triangle.calculateArea());
        System.out.println("Expected perimeter: 12 | Computed perimeter: " + triangle.calculatePerimeter());
        
        Triangle triangle2 = new Triangle(2, 5.8, 1.0);
        
        System.out.println(triangle2.calculateArea());
        System.out.println(triangle2.calculatePerimeter());
    }
}
