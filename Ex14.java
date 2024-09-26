import javax.swing.JOptionPane;
public class Ex14 
   {
      public static void main(String[] args)
      {
         String sNum = JOptionPane.showInputDialog
         ("Digite o numero:");
         
          String milhar = sNum.substring(0,1);
          
          int smilhar = Integer.parseInt(milhar);
          
          String centena = sNum.substring(1,2);
          
          int scentena = Integer.parseInt(centena);
          
          
          
          
          if(smilhar % 4 ==0 ||  scentena % 4 ==0)
          {
            JOptionPane.showMessageDialog
            (null, "O numero é multiplo: " + smilhar);
          }
          else 
          {
            JOptionPane.showMessageDialog
            (null, "O numero nao é multiplo: ");

          }
              
         
      }
   }
