import static java.lang.System.out; //Got tired of writing the entire "Println" or "Print" statements out.
import java.util.Scanner; //Importing for userInput.

class Main {
    
    public static void main(String[] args) {
        double userLength; //Fields for User inputted length, width, radius, and the final area depending on the control statement executed.
        double userWidth;
        double userRadius;
        double finalArea;
        Rectangle zeroArgRect =  new Rectangle(); //Call first 0 arg constructor for class Rectangle and initialize all values to "0." 
        Circle zeroArgCircle = new Circle();  //Call first 0 arg constructor for class Circle and initialize all values to "0."
        out.println("The current length of a Rectangle stored in memory is: " + zeroArgRect.getLength() + ".");  //Show all values are, indeed, initialized to 0 per the first constructor. 
        out.println("The current width of a Rectangle stored in memory is: " + zeroArgRect.getWidth() + ".");
        out.println("The current radius of a Circle stored in memory is: " + zeroArgCircle.getRadius() + "."); 
        Scanner userInput = new Scanner(System.in); //New scanner object for user input.
        out.println("Please type a number to select an option:\n1. Compute the area of a Rectangle\n2. Compute the area of a Circle");  //Menu for the user's menu choice.
        int userChoice = userInput.nextInt();  //Variable to store the user's menu selection.

        if(userChoice == 1) {  //Logic for if the user wants to compute the area of a rectangle. 
            out.print("Please enter the length of the rectangle: ");
            userLength = userInput.nextDouble();  //Variable for storing the Inputted length of the rectangle to allow for passing into a new constructor after the user makes all inputs. 
            Rectangle.setLength(userLength);  //Setting length per requirements. 
            out.print("Please enter the width of the rectangle: ");
            userWidth = userInput.nextDouble();  //Variable for storing the Inputted width of the rectangle to allow for passing into a new constructor after the user makes all inputs.
            Rectangle.setWidth(userWidth);  //Setting width per requirements.
            Rectangle twoArgRect = new Rectangle(userLength, userWidth);  //Pass the two variables storing the user's input into the overloaded constructor.
            finalArea = twoArgRect.computeArea();
            out.println("The area of a Rectangle with length " + twoArgRect.getLength() + " and width " + twoArgRect.getWidth() + " is: " + finalArea + "." );
        }

        else if(userChoice == 2) {
            out.print("Please enter the radius of the Circle: ");
            userRadius = userInput.nextDouble();
            Circle oneArgCircle = new Circle(userRadius);
            finalArea = oneArgCircle.computeArea();
            out.println("The area of a Circle with radius " + oneArgCircle.getRadius() + " is: " + finalArea + ".");
        }

        else {
            out.println("You did not enter a valid option. Please try again.");
        }
        
    } 
}

class Rectangle {
    private static double length;
    private static double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double userLength, double userWidth) {
        length = userLength;
        width = userWidth;
    }

    public static void setLength(double userLength) {
        length = userLength;
    }

    public double getLength() {
        return length;
    }

    public static void setWidth(double userWidth) {
         width = userWidth;
    }

    public double getWidth() {
        return width;
    }

    public double computeArea() {
        return length * width;
    }

}

class Circle {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public Circle(double userRadius) {
        radius = userRadius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);

    } 

    
}
