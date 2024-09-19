import javax.swing.JOptionPane;
public class SolucaoS 
   {
      public static void main (String[] args)
      {
         String n1 = JOptionPane.showInputDialog("Digite o numero a:");
         String n2 = JOptionPane.showInputDialog("Digite o numero b:");
         String n3 = JOptionPane.showInputDialog("Digite o numero c:");
         
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);
        int x=2*((a-c)/8)-b*5;
        
        JOptionPane.showMessageDialog(null, "O resultado da expressão é: " + x); 
      }
   }