import javax.swing.JOptionPane;
public class Solucaoi 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o numero:");
            
         int numero = Integer.parseInt(sNumero);
         
         double expoente = Math.pow(numero,2);
         
         
        JOptionPane.showMessageDialog(null, "A resolução da conta é   =  " + expoente);
        
      }
   }