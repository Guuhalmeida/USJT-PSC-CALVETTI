import javax.swing.JOptionPane;
public class Solucaoh
   {
      public static void main(String[] args)
      {
         String sBase = JOptionPane.showInputDialog
         ("Digite a base do retangulo:");
         
         String sAltura = JOptionPane.showInputDialog
         ("Digite a altura do retangulo:");
         
         double base = Double.parseDouble (sBase);
         double altura = Double.parseDouble (sAltura);
         
         double resultado =  base * altura;
         
         JOptionPane.showMessageDialog(null,"A medida da base e altura são " + resultado); 
      }
   }