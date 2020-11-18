import java.util.Scanner;
public class Task2c {
  public static void main(String[] args) {
   Scanner numbers = new Scanner(System.in);
   System.out.println("Enter Two Numbers (Press Enter after each):");
   
   int n1, n2 ;
   
   n1 = numbers.nextInt();
   n2 = numbers.nextInt();
    n1 += n2;   
   System.out.println( n1 );
   
   n1 = numbers.nextInt();
   n2 = numbers.nextInt();
    n1 -= n2;   
   System.out.println( n1 );
   
   n1 = numbers.nextInt();
   n2 = numbers.nextInt();
    n1 *= n2;   
   System.out.println( n1 );
   
   n1 = numbers.nextInt();
   n2 = numbers.nextInt();
    n1 /= n2;   
   System.out.println( n1 );
   
   n1 = numbers.nextInt();
   n2 = numbers.nextInt();
    n1 %= n2;   
   System.out.println( n1 );
  }
}

