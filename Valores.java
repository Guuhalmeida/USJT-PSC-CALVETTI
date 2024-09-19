import javax.swing.JOptionPane;
public class Valores 
   {
    public static void main(String[] args)
    {
      String valor = JOptionPane.showInputDialog
      ("Digite o valor:");
      
      int real = Integer.parseInt(valor);
      
      JOptionPane.showMessageDialog(null, "O valor do numero digitado é: = " + real);
    }
    
   }