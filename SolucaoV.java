import javax.swing.JOptionPane;
public class SolucaoV 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o numero:");
         
         
         double quadrado = Math.pow(numero,2);
         double raizQuadrada = Math.sqrt(numero);
         
         JOptionPane.showMessageDialog(null, "A raiz quadrada é ", + quadrado);
      }
  }