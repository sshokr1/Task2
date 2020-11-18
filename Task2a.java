
import java.util.Scanner;
public class Task2a {
  public static void main(String[] args) {
   Scanner numbers = new Scanner(System.in);
   System.out.println("Enter Two Numbers (Press Enter after each):");
   
   int n1, n2, addition,substract,multiplication,devision,moduls;
   n1 = numbers.nextInt();
   n2 = numbers.nextInt();
   addition = n1 + n2;
   substract = n1 - n2;
   multiplication = n1 * n2;
   devision = n1 / n2;
   moduls = n1 % n2;
		   
   System.out.println("addition result = " + addition );
   System.out.println("substract result = " + substract );
   System.out.println("multiplication result = " + multiplication );
   System.out.println("devision result = " + devision );
   System.out.println("moduls result = " + moduls );
   
  }
}
