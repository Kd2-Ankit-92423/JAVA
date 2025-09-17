/*Create a class called Invoice that a hardware store might use to represent 
an invoice for an item sold at the store. An Invoice should include four 
pieces of information as instance variables—a part number (type String), a 
part description (type String), a quantity of the item being purchased (type 
int) and a price per item (double). Your class should have a constructor 
that initializes the four instance variables. Provide a set and a get method 
for each instance variable. calculates the invoice amount (i.e. multiplies the 
quantity by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. 
If the price per item is not positive, it should be set to 0.0. 
Write a test application named InvoiceTest that demonstrate class Invoice’s 
capabilities. */
//import java.util.Scanner;

class Invoice {
    private String partNumber, partDesc;
    private int quantity;
    private double price;
    
      public Invoice(String partNumber, String partDesc, int quantity, double price){
            this.partNumber  = partNumber;
            this.partDesc = partDesc;
            this.quantity = quantity;
            this.price = price;
        }

        public String getPartNumber() {
            return this.partNumber;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }

        public String getPartDesc() {
            return partDesc;
        }

        public void setPartDesc(String partDesc) {
            this.partDesc = partDesc;
        }

        public int getQuantity() {
            if (this.quantity < 0) {
                return 0;
            }
            return quantity;
        }

        public void setQuantity(int quantity) {
            if (quantity < 0) {
                this.quantity = 0;
            } else
            this.quantity = quantity;
        }

        public double getPrice() {
            if (this.price < 0) {
                return 0.0;
            }
            return price;
        }

        public void setPrice(double price) {
            if (price < 0) {
                this.price = 0.0;
            } else
            this.price = price;
        }
        public void calcAmount(){
            System.out.println("the total amount is: "+this.quantity*this.price);
        }

    }
class InvoiceTest{
    public static void invoiceTest() {
        Invoice invoice = new Invoice("108", "Bricks", 10000, 15.0);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDesc());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item(in Rs):" + invoice.getPrice());
        invoice.calcAmount();
    }

}
public class Assignment2_1 {
    public static void main(String[] args) {
        InvoiceTest.invoiceTest();
    }
}