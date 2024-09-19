import javax.swing.JOptionPane;
public class SolucaoU
   {
      public static void main(String[] args)
      {
         String sN1 = JOptionPane.showInputDialog
         ("Digite dividendo:");
         String sN2 = JOptionPane.showInputDialog
         ("Digite o divisor:");
         
         int dividendo = Integer.parseInt(sN1);
         int divisor = Integer.parseInt(sN2);
         
         int quociente = dividendo / divisor;
         int resto = dividendo % divisor; 
         
         JOptionPane.showMessageDialog(null, "O resultado sera de : " + quociente);
         JOptionPane.showMessageDialog(null, "O resto é: " + resto);
      }
   }