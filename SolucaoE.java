import javax.swing.JOptionPane;
public class SolucaoE 
   {
      public static void main(String[] args)
      {
         char c1 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c2 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c3 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c4 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c5 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c6 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c7 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c8 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c9 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);
         char c10 = JOptionPane.showInputDialog("Digite um caractere").charAt(0);

         String letra = "" + c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10;
         
         JOptionPane.showMessageDialog(null, letra);
      }
   }