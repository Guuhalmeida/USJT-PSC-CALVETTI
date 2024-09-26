import javax.swing.JOptionPane;
public class Ex6 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o numero:");
         
         int numero = Integer.parseInt(sNumero);
         
        if(numero > 20) 
         {
            JOptionPane.showMessageDialog
            (null, "O numero é maior");
         } 
         else if(numero == 20) 
         {
            JOptionPane.showMessageDialog
            (null, "O numero é igual");
         } 
         else
         {
           JOptionPane.showMessageDialog
           (null, "O numero é menor:"); 
         }
         
      }
   }