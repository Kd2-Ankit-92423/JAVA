package question1;

public class FixedStack implements Stack{
	      private int top;
	      private Employee[] emp;
	    public FixedStack() {
	    	emp= new Employee[STACK_SIZE];
	    	top=-1;
	    	
	    }
	    
		@Override
		public void push(Employee e) {
			if(top<emp.length-1) {
				emp[++top]=e;
				System.out.println("Employee pushed :"+e);
			}
			else {
				System.out.println("Stack full :");
			}
		}
		

		@Override
		public Employee pop() {
			if(top==-1) {
				System.out.println("Stack is empty!!");
				return null;
			}
			else {
				return emp[top--];
			}
			
		}
		
	}


