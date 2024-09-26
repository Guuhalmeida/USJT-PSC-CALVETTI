import javax.swing.JOptionPane;
public class Atividade7
   {
      public static void main(String[] args)
      {
         for(int i = 1; i <= 500; i++)
         {
            if(i % 5 == 0)
            {
               JOptionPane.showMessageDialog(null, "Os multiplos de 5 são: " + i);
            }   
         }
      }
   }