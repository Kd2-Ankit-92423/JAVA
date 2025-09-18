/*Create a class Point2D , in package - "com.app.geometry"   : for representing 
a point in x-y co-ordinate system. Create a parameterized constructor to init 
x & y co-ords. Add a method to return string form of  point's x & y co-ords  
Hint :  public String getDetails())  
Add isEqual method to Point2D class :a boolean returning method : must 
return true if n only if both points are having same x,y co-ords or false 
otherwise. 
Add calculateDistance method to calculate distance between current point 
and specified point & return the distance to the caller. 
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow 
etc. 
Write TestPoint class , in package "tester" , with a main method, Accept co 
ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2) 
Use getDetails method to display point details.(p1's details & p2's details) 
Invoke isEqual & display if points are same or different (i.e p1 & p2 are located 
at the same position) 
If they are not located at the same position , display distance between p1 & 
p2  */
package com.app.geometry;
class Point2D{
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String getDetails(){
        return "Point("+x+","+y+")";
    }
    public boolean isEqual(Point2D obj){
        return this.x == obj.x && this.y == obj.y;
    }

    public double calculateDistance(Point2D obj){
        return Math.sqrt(Math.pow(this.x - obj.x,2)+ Math.pow(this.y-obj.y,2));
    }
}
class TestPoint{
    public static void testPoint(){
    Point2D p1 = new Point2D(1, 2);
    Point2D p2 = new Point2D(4, 8);
    System.out.println("p1: "+p1.getDetails());
    System.out.println("p2: "+p2.getDetails());
    System.out.println("If both coordinates are same(true/false): "+p1.isEqual(p2));
    if(!p1.isEqual(p2)){
        System.out.println("Distance between points: "+p1.calculateDistance(p2));
    }
}
}
public class Assignment3_1 {
    public static void main(String[] args) {
        TestPoint.testPoint();
    }
}
