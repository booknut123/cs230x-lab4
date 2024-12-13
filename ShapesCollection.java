
/**
 * Collection of Shapes
 *
 * @author Kailyn Lau
 * @version v1.1
 */
public class ShapesCollection
{
    // instance variables
    private Shape[] collection;
    private int count;

    /**
     * Constructor for objects of class ShapesCollection
     */
    public ShapesCollection()
    {
        collection = new Shape[1];
        count = 0;
    }

    /**
     * @return the number of Shapes in the collection
     */
    public int getCounter() {
        return count;
    }

    /**
     * Adds Shape to the collection
     * 
     * @param s the Shape to add
     */
    public void add(Shape s) {
        try {
            collection[count] = s;
        } catch (Exception e) {
            doubleArray();
            collection[count] = s;
        }
        count++;
    }

    /**
     * Doubles the capacity of the collection (increases size of array and therefore increases number of Shapes the collection contains).
     */
    private void doubleArray() {
        Shape[] collection2 = new Shape[collection.length * 2];
        for (int i = 0; i < collection.length; i++) {
            collection2[i] = collection[i];
        }
        collection = new Shape[collection2.length];
        collection = collection2;
    }

    /**
     * @return the index of the Shape with the largest area in the collection
     */
    public int findLargest() {
        if (count == 0) {
            return -1;
        } else {
            int largest = 0;
            for (int i = 0; i < count; i++) {
                if (collection[largest].compareTo(collection[i]) == -1) {
                    largest = i;
                }
            }
            return largest;
        }
    }

    /**
     * @return a String representation of this class
     */
    public String toString() {
        String s = "There is/are " + count + " shape(s) in this collection: ";
        for (int i = 0; i < count; i++) {
            s += "\n" + collection[i];
        }
        return s;
    }

    /**
     * Main method to test this class
     */
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 6);
        Rectangle rect2 = new Rectangle(3.2, 1);
        Circle circ = new Circle(4.5);
        Triangle tri = new Triangle(3, 4, 5);

        ShapesCollection shapes = new ShapesCollection();
        shapes.add(rect);
        shapes.add(rect2);
        shapes.add(circ);
        shapes.add(tri);

        System.out.println(shapes);
        System.out.println(shapes.findLargest());
    }
}
