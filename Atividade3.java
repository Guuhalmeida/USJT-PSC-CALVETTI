import javax.swing.JOptionPane;
public class Atividade3
   {
      public static void main(String[] args)
      {
         int somatoria = 0;
         int i = 5;     
         while(i >= 0)
         {
            String sValor = JOptionPane.showInputDialog("Digite um numero");
            int valor = Integer.parseInt(sValor);
               
            somatoria += valor;
            
            i--;
            
         }
         
         int media = somatoria / 5;
         JOptionPane.showMessageDialog(null, "A media é " + media + somatoria);
         
      }
   }