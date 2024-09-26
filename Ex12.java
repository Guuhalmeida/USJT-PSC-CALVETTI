import javax.swing.JOptionPane;
public class Ex12 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite um numero:");
         
       int numero = Integer.parseInt(sNumero);
       
       if(numero % 10 ==0)
       {
          JOptionPane.showMessageDialog
          (null, "O numero é divisivel " + numero);
       }
       else if (numero % 5 ==0)
       {
          JOptionPane.showMessageDialog 
          (null, "O numero é divisivel " + numero);
       }
       else if(numero % 2 ==0)
       {
          JOptionPane.showMessageDialog
          (null, "O numero é divisivel " + numero);
       }
       else 
       {
         JOptionPane.showMessageDialog
         (null, "Numero nao divisivel");
       }
        
      }
   }

