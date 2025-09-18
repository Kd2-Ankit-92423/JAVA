/*(Credit Limit Calculator) 
Develop a Java application that determines whether any of several 
department-store customers has exceeded the credit limit on a 
charge account. 
For each customer,the following facts are available: 
a) account number 
b) balance at the beginning of the month 
c) total of all items charged by the customer this month 
d) total of all credits applied to the customer’s account this 
month 
e) allowed credit limit. 
The program should input all these facts as integers, calculate 
the new balance (= beginning balance+ charges – credits), 
display the new balance and determine whether the new balance 
exceeds the customer’s credit limit. For those customers whose 
credit limit is exceeded, the program should display 
the message "Credit limit exceeded". */
class Customer{
    int account;
    int balance;
    int chargedamount;
    int totalcredit;
    int creditlimit;
    Customer(int account, int balance, int chargedamount, int totalcredit, int creditlimit){
        this.account=account;
        this.balance = balance;
        this.chargedamount = chargedamount;
        this.totalcredit = totalcredit;
        this.creditlimit = creditlimit;
    }
    public int calculateNewBalance(){
        int new_balance = balance + chargedamount-totalcredit;
        return new_balance;
    }
    public String display(){
        int new_balance = balance + chargedamount-totalcredit;
        if (new_balance > creditlimit){
            return "Credit limit exceeded";
        }
        else {
            return "Credit limit did not exceeded.";
        }
    }
}
public class Assignment3_2 {
    public static void main(String[] args){
    Customer c = new Customer(31035311, 10000, 1000, 5000, 15000);
    System.out.println("New Balance: "+c.calculateNewBalance());
    System.out.println("Limit exceeded? \n"+c.display());   
}
}
