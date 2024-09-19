import javax.swing.JOptionPane;
public class Solucao1d 
   {
      public static void main(String[] args)
      {
         String peso = JOptionPane.showInputDialog
         ("Digite seu peso:");
         
         
         double tamanho = Double.parseDouble(peso);
         
         JOptionPane.showMessageDialog(null, "O peso informando foi " + tamanho);
          
      }
   }