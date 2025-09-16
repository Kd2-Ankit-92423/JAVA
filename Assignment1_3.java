/*Display food menu to user. User will select items from menu along with the 
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed 
prices to food items(hard code the prices)  When user enters 'Generate Bill' 
option , display total bill & exit.  */
import java.util.Scanner;
public class Assignment1_3 {
    public static void main(String[] args){
        int choice, quantity;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(("----Enter the menu----"));
        System.out.println("1. idli -30Rs");
        System.out.println("2. dosa -50Rs");
        System.out.println("3. Vada paav -15Rs");
        System.out.println("4. Tea -20Rs");
        System.out.println("5. Coffee -25Rs");
        System.out.println("6. Paav bhaaji -60Rs");
        System.out.println("7. Upma -30Rs");
        System.out.println("8. Poha -30Rs");
        System.out.println("9. Aloo Poori -40Rs");
        System.out.println("10. Misal -30Rs");
        System.out.println("11. Generate Bill & Exit");
        while(true){
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                case 1:
                    System.out.print("\nEnter the quantity: ");
                    quantity = sc.nextInt();
                    total += quantity * 30;
                    System.out.print("\nPrice of " + quantity + " idli is: " + (quantity * 30));
                    continue;
                case 2:
                    System.out.print("\nEnter the quantity: "); 
                    quantity = sc.nextInt();
                    total+= quantity * 50;
                    System.out.print("\nPrice of " + quantity + " dosa is: " + (quantity * 50));
                    break;
                case 3:
                    System.out.print("\nEnter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity * 15;
                    System.out.print("\nPrice of " + quantity + " vada paav is: " + (quantity * 15));
                    break;
                case 4:
                    System.out.print("\nEnter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity * 20;
                    System.out.print("\nPrice of " + quantity + " tea is: " + (quantity * 20));
                    break;
                case 5:
                    System.out.print("\nEnter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity * 25;
                    System.out.print("\nPrice of " + quantity + " coffee is: " + (quantity * 25));
                    break;  
                case 6:
                    System.out.print("\nEnter the quantity: "); 
                    quantity = sc.nextInt();
                    total+= quantity * 60;
                    System.out.print("\nPrice of " + quantity + " paav bhaaji is: " + (quantity * 60));
                    break;
                case 7:
                    System.out.print("\nEnter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity * 30;
                    System.out.print("\nPrice of " + quantity + " upma is: " + (quantity * 30));
                    break;
                case 8:
                    System.out.print("\nEnter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity * 30;
                    System.out.print("\nPrice of " + quantity + " poha is: " + (quantity * 30));
                    break;
                case 9:
                    System.out.print("\nEnter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity * 40;
                    System.out.print("\nPrice of " + quantity + " aloo poori is: " + (quantity * 40));
                    break;
                case 10:
                    System.out.print("\nEnter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity * 30;
                    System.out.print("\nPrice of " + quantity + " misal is: " + (quantity * 30));
                    break;
                case 11:
                    System.out.print("\nTotal bill is: " + total + "\nExiting...");
                    return;
                default:
                    System.out.print("\nInvalid choice! \n Please select a valid option from the menu.");
                    break;
            }
        }
    }
}
