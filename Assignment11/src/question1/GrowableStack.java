package question1;

import java.util.Arrays;

public class GrowableStack implements Stack {

	private int top;
	Employee[] emp;
	public GrowableStack() {
		top=-1;
		emp= new Employee[STACK_SIZE];
	}
	
	@Override
	public void push(Employee e) {
       if(top!=emp.length-1) {
		emp[++top]=e;
		System.out.println("Employee inserted"+e);
       }
       if(top==emp.length-1) {
    	   emp=Arrays.copyOf(emp, 2*emp.length);
    	   emp[++top]=e;
    	   System.out.println("Employee inserted"+e);
       }
		
	}

	@Override
	public Employee pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			System.out.println("Popped element :"+emp[top--]);
			return emp[top--];
		}
		
	}

}
