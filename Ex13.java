import javax.swing.JOptionPane;
public class Ex13 
   {
      public static void main(String[] args)
      {
         String snum1 = JOptionPane.showInputDialog
         ("Digite o primeiro numero:");
         
        String decimal = snum1.substring(1,2); 
                   
         int sdecimal = Integer.parseInt(decimal);
         
         if((sdecimal % 2) == 0)
         {
            JOptionPane.showMessageDialog
            (null, "O numero é par " + sdecimal);
         }    
         
         else
         {
           JOptionPane.showMessageDialog
            (null, "O numero é impar "  + sdecimal);
         }
             
       
      }
   }
