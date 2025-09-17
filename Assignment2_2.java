/*Create a class called Employee that includes three instance variables—a 
first name (type String), a last name (type String) and a monthly salary 
(double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly 
salary is not positive, do not set its value. Write a test application named 
EmployeeTest that demonstrates class Employee’s capabilities. Create two 
Employee objects and display each object’s yearly salary. Then give each 
Employee a 10% raise and display each Employee’s yearly salary again. */
class Employee{
    private String firstname, lastname;
    private double salary;
    Employee(String firstname, String lastname, double salary){
        this.firstname = firstname;
        this.lastname = lastname;
        if(salary<0){
            this.salary = 0.0;
        }
        else
            this.salary = salary;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public double getSalary() {
        return salary;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setSalary(double salary) {
        if(salary<0){
            this.salary = 0.0;
        }
        else
        this.salary = salary;
    }
}
class  EmployeeTest{
    public static void testApplication() {
        Employee emp1 = new Employee("Bhagat", "Singh", 5000);
        Employee emp2 = new Employee("Mangal", "Pandey", 6000);
        System.out.println(emp1.getFirstname()+" "+emp1.getLastname()+"'s yearly salary: "+(emp1.getSalary()*12));
        System.out.println(emp2.getFirstname()+" "+emp2.getLastname()+"'s yearly salary: "+(emp2.getSalary()*12));
        emp1.setSalary(emp1.getSalary() * 1.1);
        emp2.setSalary(emp2.getSalary() * 1.1);
        System.out.println("After 10% raise:");
        System.out.println(emp1.getFirstname()+" "+emp1.getLastname()+"'s yearly salary: "+(emp1.getSalary()*12));
        System.out.println(emp2.getFirstname()+" "+emp2.getLastname()+"'s yearly salary: "+(emp2.getSalary()*12));
    }
}

public class Assignment2_2 {
    public static void main(String[] args) {
        EmployeeTest.testApplication();
    }
}
