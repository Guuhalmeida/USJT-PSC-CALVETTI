import javax.swing.JOptionPane;
public class Atividade9
   {
      public static void main(String[] args)
      {
         int somatoria = 0;
         for(int i = 1; i <= 100; i++)
         {
            somatoria += i;
         }
         JOptionPane.showMessageDialog(null,"A soma é: " + somatoria);
      }
   }