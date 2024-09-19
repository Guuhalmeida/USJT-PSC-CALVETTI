import javax.swing.JOptionPane;
public class SolucaoT
   {
      public static void main(String[] args)
      {
         String sRaio = JOptionPane.showInputDialog
         ("Digite o raio do circulo:");
         
         double raio = Double.parseDouble(sRaio);
         final double PI =  3.14159;
         double area = PI * raio * raio; 
         
         JOptionPane.showMessageDialog(null, "A area do circulo do raio é " + raio + area);
         
      }
   }