/**
//  Apply inheritance n polymorphism 
// a)  Arrange Fruit, Apple, Orange, Mango in inheritance hierarchy 
// b)  Properties (instance variables) : color: String, weight : double , name: String, isFresh:   
// boolean 
// c)  Add suitable constructors. 
//d) Override toString correctly to return state of all fruits (including: name ,color , weight )

//e)  Add a taste() method : public String taste() which will be an abstract method 
Apple: should return "sweet and sour” 
Mango: should return "sweet"  
Orange: should return "sour" 
//f) Add all of above classes under the package "com.app.fruits" 



g) Create a Class FruitBasket , with main method inside it. Use it for testing 
h) Prompt user for the basket size n create suitable data structure and give options 
0. Exit 
1. Add Mango 
boundary checking      
basket [counter++]=new 
Mango(nm, weight, color); break; 
2. Add Orange 
3. Add Apple 
NOTE: You will be adding a fresh fruit in the basket, in all of above options. 
4. Display names of all fruits in the basket. eg : for-each --- null checking --getName() 
5. Display name, color, weight, taste of all fresh fruits, in the basket. eg : for-each , null 
checking --toString , taste, isFresh: getter 
6. Display tastes of all stale (not fresh) fruits in the basket. 
7. Mark a fruit as stale i/p : index 
Eg: setter : isFresh : false 
O/P: error message (in case of invalid index) or mark it stale. 
8. Mark all sour fruits stale (optional) eg : for-each , taste --equals(String)
 */

 
//package com.app.fruits;
import java.util.Scanner;


abstract class Fruit{
    
    private String name;
    private String color;
    private double weight;
    private boolean isFresh;
    public Fruit(){

    }
    public Fruit(String name,String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = true;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isFresh() {
        return isFresh;
    }
    public void setFresh(boolean isFresh) {
        this.isFresh = isFresh;
    }
    @Override
    public String toString() {
        return "Fruit [name: "+ this.name +" color=" + this.color + ", weight=" + this.weight + "]";
    }
    public abstract String taste();

}
class Mango extends Fruit{
    public Mango(String name, String color, double weight){
        super(name, color, weight);
    }
    @Override
    public String taste() {
        return "sweet";
    }
}
class Apple extends Fruit{
    public Apple(String name, String color, double weight){
        super(name, color, weight);
    }
    @Override
    public String taste() {
        return "sweet and sour";
    }
}
class Orange extends Fruit{
    public Orange(String name, String color, double weight){
        super(name, color, weight);
    }
    @Override
    public String taste() {
        return "sour";
    }
}
class FruitBasket{

    public static void test() {

        int n;
        int choice;
        int counter = 0;
        System.out.println("........Fruit Basket.......");
        System.out.print("Enter the size of the basket: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("0. Exit");
        System.out.println("1. Add Mango");
        System.out.println("2. Add Orange");
        System.out.println("3. Add Apple");
        System.out.println("4. Display names of all fruits in the basket");
        System.out.println("5. Display name, color, weight, taste of all fresh fruits in the basket");
        System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket");
        System.out.println("7. Mark a fruit as stale i/p : index");
        System.out.println("8. Mark all sour fruits stale");
        Fruit arr[] = new Fruit[n];
        while(true){
            System.out.print("\nEnter the choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 0:{
                    System.out.println(".............Exiting..................");
                    return;
                }
                case 1:{
                    if (counter >= n) {
                        System.out.println("Basket is full!");
                        break;
                    }
                        sc.nextLine();
                        System.out.print("Enter the name of the fruit: ");
                        String name = sc.nextLine();
                        System.out.print("Enter the weight: ");
                        double weight = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the color: ");
                        String color = sc.nextLine();
                        //arr[counter] = new Mango();
                        arr[counter++] = new Mango(name, color, weight);
                        break;
                }
                case 2:{
                    if (counter >= n) {
                        System.out.println("Basket is full!");
                        break;
                    }
                        sc.nextLine();
                        System.out.print("Enter the name of the fruit: ");
                        String name = sc.nextLine();
                        System.out.print("Enter the weight: ");
                        double weight = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the color: ");
                        String color = sc.nextLine();
                        arr[counter++] = new Orange(name, color, weight);
                        break;

                }
                case 3:{
                    if (counter >= n) {
                        System.out.println("Basket is full!");
                        break;
                    }
                    sc.nextLine();
                        System.out.print("Enter the name of the fruit: ");
                        String name = sc.nextLine();
                        System.out.print("Enter the weight: ");
                        double weight = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter the color: ");
                        String color = sc.nextLine();
                        arr[counter++] = new Apple(name, color, weight);
                        break;
                }
                case 4:{
                    for(Fruit f: arr){
                        if(f != null)
                            System.out.println("Name: "+f.getName());
                    }
                    break;
                }
                case 5:{
                    System.out.println("Fresh fruits: ");
                    for(Fruit f: arr){
                        
                        if (f != null && f.isFresh()){
                       System.out.println(f.toString()+","+"Taste: "+f.taste()); 
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Stale fruits(not fresh): ");
                    for (Fruit f: arr){

                        if (f!=null && !f.isFresh()){
                            System.out.println("Name: "+f.getName()+" taste: "+f.taste());
                        }
                        else{
                            System.out.println("no stale fruit");
                        }
                    } 
                    break;            
                }
                case 7: {
                    System.out.print("Enter the index to mark stale fruit: ");
                    int index = sc.nextInt();
                    if (index<0 || index>=counter || arr[index]==null){
                        System.out.println("Invalid index");
                    }
                    else{
                        arr[index].setFresh(false);
                        System.out.println(arr[index].getName()+" is marked as stale.");
                    }
                    break;
                }
                case 8: {
                    for(Fruit f: arr){
                        if (f!=null && f.taste().equals("sour")){
                            f.setFresh(false);
                        }
                    }
                    System.out.println("All the sour fruits are marked as stale.");
                }
                default:
                System.out.println("Invalid option!, Please enter the valid option.");
            }
        }
    }
}
public class Assignment4 {
        public static void main(String[] args) {
            System.out.println("...................Welcome to the fruit Market.......................");
            FruitBasket.test();
        }
}
