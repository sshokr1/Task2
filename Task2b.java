import java.util.Scanner;

public class Task2b {

      public static void main(String[] args) {
    	  Scanner numbers = new Scanner(System.in);
    	   System.out.println("Enter Two Numbers (Press Enter after each):");
   int num1,num2; 
   
   num1 = numbers.nextInt();
   num2 = numbers.nextInt();
   
            boolean result;
   result = num1 == num2 ;        
    System.out.println("(num1 == num2: " + result);

    result = num1 < num2 ;        
    System.out.println("(num1 < num2: " + result);
    
    result = num1 > num2 ;        
    System.out.println("(num1 > num2: " + result);
    
    result = num1 >= num2 ;        
    System.out.println("(num1 >= num2: " + result);
    
    result = num1 <= num2 ;        
    System.out.println("(num1 <= num2: " + result);
    
    result = num1 != num2 ;        
    System.out.println("(num1 != num2: " + result);
            
      }

}