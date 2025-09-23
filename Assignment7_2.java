/*
Q2) Build a new Circle class with the followingbasic features:
>>> Attributes:
Centerpoint-Buildinstancevariablesfor the circle’s centerpoint (myXandmyYrepresentedasdoublevalues).
Diameter-Buildaninstancevariableforthecircle’sdiameter(myDiameteralso represented as a doublevalue).
>>> Behaviors
Default constructor- Build a default constructor that initializes the circle’s center point to (0, 0) and its 
diameter to 100.
Accessor methods-Build accessor methods for the two center coordinates and the diameter.
>>> Invariant
The circle’s diameter should always be non-negative. maintain the integrity of each circle object by ensuring that the class
invariant (that the diameter should be non negative) is true at all times.
If the diameteris negative then throw user defined exception.
 */

class InvalidException extends RuntimeException {
    public String getMessage() {
        return "Diameter cannot be negative";
    }
}

class Circle{
    private double myX;
    private double myY;
    private double myDiameter;
    public Circle(){
        this.myX = 0;
        this.myY = 0;
        this.myDiameter = 100;
    }
    public Circle(double myX, double myY, double myDiameter) {
        this.myX = myX;
        this.myY = myY;
        this.myDiameter = myDiameter;
    }


    public double getMyX() {
        return myX;
    }
    public double getMyY() {
        return myY;
    }
    public double getMyDiameter() {
        return myDiameter;
    }

    public void setMyDiameter(double myDiameter) throws InvalidException {
        if (myDiameter < 0) {
            throw new InvalidException();
        }
        this.myDiameter = myDiameter;
    }

    @Override
    public String toString() {
        return "Circle [myX=" + myX + ", myY=" + myY + ", myDiameter=" + myDiameter + "]";
    }
    
}

public class Assignment7_2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        try{
        System.out.println("Default value of  Circle:");
        System.out.println("Center: (" + circle.getMyX() + ", " + circle.getMyY() + ")");
        System.out.println("Diameter: " + circle.getMyDiameter());
        circle.setMyDiameter(-10);
        System.out.println(circle.toString());
        } 
        catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}
