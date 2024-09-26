import javax.swing.JOptionPane;
public class Atividade8
   {
      public static void main(String[] args)
      {
         double  produto = 1;      
         for (int i = 120; i <= 350; i++)
         {
            produto *= i;
         }
         
         JOptionPane.showMessageDialog(null, "Os numeros são: " + produto);
      }
   }