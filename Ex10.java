
import javax.swing.JOptionPane;
public class Ex10 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o numero:");
         
         double numero = Double.parseDouble(sNumero);
         
         if (numero % 5==0)
         {
            JOptionPane.showMessageDialog
            (null,"È divisivel " + numero);
         }
          else
         {
           JOptionPane.showMessageDialog
           (null,"Não é divisivel " + numero);

         }


      }
   }