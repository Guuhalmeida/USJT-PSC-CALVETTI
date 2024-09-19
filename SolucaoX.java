import javax. swing. JOptionPane;
public class SolucaoX
   {
      public static void main(String[] args)
      {
         String n1 = JOptionPane.showInputDialog
         ("Digite a Diagonal maior do Losango");
         
          String n2 = JOptionPane.showInputDialog
         ("Digite a Diagonal menor do Losango");
         
         double maior = Double.parseDouble(n1);
         double menor = Double.parseDouble(n2);
         
         double area = maior*menor/2;
         
         JOptionPane.showMessageDialog(null, "A área do Losango é: " +area);
      }
   }

