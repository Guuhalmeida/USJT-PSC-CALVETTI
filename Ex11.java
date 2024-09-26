import javax.swing.JOptionPane;
public class Ex11 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite um numero:");
         
        int numero = Integer.parseInt(sNumero);
         
         if(numero % 3 ==0 && numero % 7 ==0) 
         {
            JOptionPane.showMessageDialog
            (null, "Os Numeros sao divisiveis: " + numero);
         }
         
         else 
         {
            JOptionPane.showMessageDialog
            (null, "Os Numeros nao sao divisiveis: ");
         }
      }
   }

