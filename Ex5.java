import javax.swing.JOptionPane;
public class Ex5 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o numero:");
         
         int numero = Integer.parseInt(sNumero);
         
         if(numero >= 20 && numero <= 90)
         {
            JOptionPane.showMessageDialog
            (null, "O numero esta compreendido " + numero);
         }
         
         else 
         {
            JOptionPane.showMessageDialog
            (null, "O numero nao foi compreendido");
         }
          
      }
   }