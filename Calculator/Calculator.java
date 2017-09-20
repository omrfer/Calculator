import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{		                
		{
     Scanner input = new Scanner( System.in );
     
      	  double number1; 
				
		 double number2; 
		 
		 String operator;
		 
		 System.out.println("Enter the first number"); 

		 number1 = input.nextDouble();  

		 System.out.println("Enter the operator(+,-,*,/)");
		 
		 operator = input.next();
		 
		 System.out.println("Enter the second number"); 

		 number2 = input.nextDouble();
		 
		 if (operator.equals("+") )
			 System.out.println(number1 + number2);
		 else if (operator.equals ("-"))
			 System.out.println(number1 - number2);
		 else if (operator.equals ("*"))
			 System.out.println(number1 * number2);
		 else if (operator.equals("/"))
			 System.out.println(number1 / number2);
		 else 
			 System.out.println("Error, Please Check Your Syntax");
		}
		}
	}
}
		
			
			 
			 
		
			 

