import javax.swing.JOptionPane;
public class Atividade6
 {  
      public static void main(String[] args)
      {
      
            String  raizstr = "";
            while(true)
            {
                String sNumero = JOptionPane.showInputDialog("Digite o numero");
                double numero = Double.parseDouble(sNumero);
                
                if(numero == -999)
                {
                  break;
                }
                
                double raizquadrada = Math.sqrt(numero);
                String raizquadradastr = Double.toString(raizquadrada);
                raizstr = raizstr.concat(raizquadradastr + " ");
                
      }
      
      JOptionPane.showMessageDialog(null, "A raiz quadrada é: " + raizstr);
   }
}   