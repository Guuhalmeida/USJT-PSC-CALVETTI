import javax.swing.JOptionPane;
public class Ex9 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o numero");
         int numero = Integer.parseInt(sNumero);
         
         if (numero %  3==0)
         {
            JOptionPane.showMessageDialog
            (null,"È multiplo " + numero);
         }
         else
         {
           JOptionPane.showMessageDialog
           (null,"Não é" + numero);

         }
      }
   }

