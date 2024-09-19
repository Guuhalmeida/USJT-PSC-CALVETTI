import javax.swing.JOptionPane;
public class SolucaoF 
   {
      public static void main (String[] args) 
      {
         char milhar = JOptionPane.showInputDialog("Digite o milhar").charAt(0);
         char unidade = JOptionPane.showInputDialog("Digite o unidade").charAt(0);
         char dezena = JOptionPane.showInputDialog("Digite o dezena").charAt(0);
         char centena = JOptionPane.showInputDialog("Digite o centena").charAt(0);
         
         String numero = ("" + milhar + centena + dezena + unidade);
         
         int converter = Integer.parseInt(numero);
         
         JOptionPane.showMessageDialog(null,"O numero completo" + converter);
      
      }
   }