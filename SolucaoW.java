import javax.swing.JOptionPane;
public class SolucaoW
   {
      public static void main(String[] args)
      {
         String n1 = JOptionPane.showInputDialog
         ("Digite a base do triangulo:");
         String n2 = JOptionPane.showInputDialog
         ("Digite a altura do  triangulo:");
         
         double base = Double.parseDouble(n1);
         double altura = Double.parseDouble(n2);
         
         double area = base*altura/2;
         
         JOptionPane.showMessageDialog(null, "A area do triangulo é:" + area);


      }
   }
