import javax.swing.JOptionPane;   

/**
 * @author sshokr1
 *
 */
public class Task2d
{
   public static void main(String[] args)
   {
      String name,age,email,faculty;

           name = JOptionPane.showInputDialog("What is your name? ");

            JOptionPane.showMessageDialog(null, "Hello " + name);
           
            age = JOptionPane.showInputDialog("What is your age ? ");

            JOptionPane.showMessageDialog(null, age);
            
            email = JOptionPane.showInputDialog("What is your email ? ");

            JOptionPane.showMessageDialog(null, email);
            
            faculty = JOptionPane.showInputDialog("What is your faculty? ");

            JOptionPane.showMessageDialog(null,"Wow " + faculty + " is a beautiful faculty");
   }
}
