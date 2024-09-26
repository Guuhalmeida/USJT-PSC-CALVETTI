import javax.swing.JOptionPane;
public class Ex2
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o primeiro numero:");
         
         String sNumero2 = JOptionPane.showInputDialog
         ("Digite o segundo numero:");
         
         int numero = Integer.parseInt(sNumero);
         int numero2 = Integer.parseInt(sNumero2);
         
         int resultado = numero + numero2;
         
         if (resultado <= 20)  
         {
            JOptionPane.showMessageDialog
            (null, "O numero é = " + (resultado - 5));
         }    
      
      }
   }