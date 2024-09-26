import javax.swing.JOptionPane;
public class Ex1 
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
         
         if (resultado > 10) 
         {
            JOptionPane.showMessageDialog
            (null, "O numero é maior:" + resultado);
         } 
          else 
          {
            JOptionPane.showMessageDialog
            (null, "Numero nao apresentado");
           
          }
         
       }
       
     }
   