import javax.swing.JOptionPane;
public class Ex3
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o numero");
         
         double numero = Double.parseDouble(sNumero);
         
         if (numero > 0) 
         {
             double raizquadrada = Math.sqrt(numero);
             JOptionPane.showMessageDialog
             (null,"A raiz quadrada de " + numero + " é: " + raizquadrada);
         }
         else 
         {
            double quadrado = Math.pow(numero,2);
             JOptionPane.showMessageDialog
             ( null, "O quadrado de " + numero + " é: " + quadrado);

            
         }
         
         
          
        
      }
   }