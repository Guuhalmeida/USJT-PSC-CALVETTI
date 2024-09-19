import javax.swing.JOptionPane;
public class SolucaoO
   {
      public static void main(String[] args) 
      {
         String sNumero = JOptionPane.showInputDialog
         ("Digite o numero:");
         
         String sBase = JOptionPane.showInputDialog
         ("Digite a base:");
         
         double base = Double.parseDouble(sBase);
         
         double numero = Double.parseDouble(sNumero);
         
         double logaritimo = Math.log(numero)/Math.log(base);
         
         String mensagem = "O resultado é = " + numero + logaritimo;
         
         JOptionPane.showMessageDialog(null, mensagem);
      }
   }