[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ss3Rv_1d)
# CS230X-lab0-F24
# Inheritance and polymorphism

In this lab, you will continue expanding on collections of objects using inheritance.

Goals:
- [ ] Working with a hierarchy of classes
- [ ] Using polymorphism

# TASK: Shapes Hierarchies

In this task, you will work with a hierarchy of classes. Here, we have provided you with the abstract Shape class. This class is the base for a hierarchy of classes that define the properties of various geometric figures.

We have also provided the class Circle that inherits from the Shape class and includes the radius property and the area calculation definition. The same is true of the provided Rectangle and Square classes. 

Examine the code and documentation of these classes now. 
Next you will be defining a couple classes of your own.

1. **Start by creating the Triangle class:**

Here you will create a new class `Triangle` that provides functionality for a triangle. Recall from Geometry that a triangle is defined by its three sides, let's call them a, b, and c. 
Its perimeter is simply the sum of its three sides, `a+b+c`. 

Its area can be computed using Heron's formula: `area = sqrt(s(s-a)(s-b)(s-c))` where s is the semi-perimeter (that is, half of the perimeter).

First, determine where the `Triangle` class should be placed in the `Shapes` hierarchy. In the hierarchy, a class B extends another class A if B is-a special kind of A. For example, a Rectangle is-a special kind of Shape; a Square is-a special kind of a Rectangle. A Shape is NOT a special kind of any of the others, that’s why it is at the top of the hierarchy.

Once you know where to place it in the hierarchy, you can define the `Triangle` class. Make sure to update the header of the class. Look at the code of a sibling class of `Triangle` to help write the code for `Triangle`.
Add a `main()` method so you are ready to test as you add methods. 

2. **Instance variables and constructor for Shape:**

Determine what instance variables the `Triangle` class contains. These would be attributes that characterize a Triangle.
Then, create the constructor that assigns values to these instance variables. Your constructor should call the constructor in the super class (Shape).

At this point, in the `main()` create a few Triangle objects to test your constructor. 

There may be some methods that you have to overwrite. If so, have those methods return some values that assuage the compiler for now, and return to them after testing your constructor. 

How can you test that your constructor works? Could you print a Triangle object? What method do you need to define in order to be able to print a Triangle?

3. **Other methods in Shape:**

Now you can go ahead and implement the methods the compiler first directed your attention to. 

Of course, test your implementation. In addition to the tests you will perform, add a `new Triangle(2, 5.8, 1.0)`. What do you observe? (NaN means Not a Number. It means that a calculation could not be mathematically completed.) How should you fix the problem? Go ahead and define a method that will fix the problem any way you prefer.

4. **A collection of Shapes:**
   
Let’s create another class that will contain many shapes (Triangles, Squares, Rectangles, etc., but it cannot contain abstract Shapes). This `ShapesCollection` class will use an array to maintain a collection of Shape objects (Rectangles, Circles, Triangles). You will write this class from scratch. The code for Tunes, that we looked at in class, is very related. 

5. **Instance variables and constructor for ShapesCollection:**
   
Start by setting up the necessary instance variables, and constructor `ShapesCollection()`. When you initialize the constructor, start with a small array size, e.g., 3, so that you can test the helper method easily. A getter or setter method may (or may not) be needed.

5. **Other methods in ShapesCollection:**

Provide code for the following methods:

- a method `getCounter()` that returns the number of Shapes in the collection
- a method to `add(Shape s)` an Object of type Shape to the collection. Here you will need a helper (private) method doubleArray() that doubles the size of the collection of Shapes when it is full.
- a method `findLargest()` that returns the index of the Shape with the largest area in the collection of shapes. Test comparing a couple of Shapes that you have added in the collection. Note that you will need to use a method to compare two shapes by comparing their areas. Do you need to write a compareTo() method, or is the method already available to you because it is defined in the appropriate class in the hierarchy?
- a `main()` method and 
- the `toString()` to start your testing right away. Below is some starting sample testing output. You will need to add more testing!

```
This collection contains 2 shapes:
rectangle of area 12 (length: 2.0 width: 6.0)  
triangle of area 6 (sides: 3.0, 4.0, 5.0)
```

Hint: the only way to print out the contents of an array is to traverse the array.

## SAVING YOUR WORK ON GITHUB
As we have discussed in class, it is important to work on labs and assignments regularly and save frequently. You should test your work incrementally, which will require you to save your file before compiling/running it. In addition to saving your work on your local machine, you should also frequently push your work to this Github repository. You can refer to Lab0 and the [Git and Github tutorial](https://github.com/CS230X-F24/github-starter-course) for a refresher on using these tools. 

## SUBMITTING TO GRADESCOPE
Turn in your work submitting files Triangle.java and ShapesCollection.java to your Gradescope account for Lab4. You will receive full credit for this lab if you submit a reasonable attempt at completing the lab by the deadline. [Click here for Gradescope instructions.](https://docs.google.com/document/d/1zGAJrbdAhfPZVlyDP9N3MmdKXWvNo7rQqehKNM5Q0_M/edit) 

## AUTOGRADER
When you submit your lab to Gradecope, you will immediately see some feedback through the autograder. You are welcome to resubmit as many times as you wish until the deadline. The autograder will check for accuracy, style, and documentation. Make sure there are no remaining `TODO` comments in your submission code. Click here for 230X instructions on: [testing your code](https://docs.google.com/document/d/19cKOyolT8UtSfMNrVw8MGgVWS-lYgHpBs8g2Cf_8Vvc/edit#heading=h.rt39ohf1jp6s), [styling your code](https://docs.google.com/document/d/14uwj9HAjNKfFBm0ZjUpWR7jdqKSj13rudIEJaG74mPk/edit), and [documenting your code](https://docs.google.com/document/d/15uqs_NH8y2sAuLLpiZuSxlI0UsL6a8CHuWY_qcvF4B4/edit). 

## LAB SOLUTIONS
Lab solutions will be added to this repository after the lab deadline. 
