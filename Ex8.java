import javax.swing.JOptionPane;
public class Ex8 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o primeiro numero");
         String sNumero2 = JOptionPane.showInputDialog
         ("Digite o segundo nome:");
         
         int numero = Integer.parseInt(sNumero);
         int numero2 = Integer.parseInt(sNumero2);
         
         
         if(numero >  numero2)
         {
             JOptionPane.showMessageDialog
             (null, "O numero maior é: " + numero);
         }
         else
         {
             JOptionPane.showMessageDialog
               (null, "O numero maior é: " + numero2);
         }
      }
   }
