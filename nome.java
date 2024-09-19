import javax.swing.JOptionPane;
public class nome
{
      public static void main (String[] args) 
   
   {
      //nomes
      String nome = JOptionPane.showInputDialog
      ("Digite seu nome:");
      String nome2 = JOptionPane.showInputDialog
      ("Digite o segundo nome:");
      String nome3 = JOptionPane.showInputDialog
      ("Digite o terceiro nome:");
      
      
      //apresentação dos nomes
      JOptionPane.showMessageDialog(null, "Nome = " + nome2 + ", " + nome3 + ", " + nome);
     
   }
   
 }
   
   