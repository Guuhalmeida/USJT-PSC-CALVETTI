import javax.swing.JOptionPane;
public class Atividade4
   {
      public static void main(String[] args)
      {
            int contador = 0;
            while(true)
            {
                String sNumero = JOptionPane.showInputDialog("Digite o numero");
                int numero = Integer.parseInt(sNumero);
                
                if(numero == 0)
                {
                  break;
                }
                
                if(numero >= 100 && numero <= 200)
                {
                  contador ++;
                }
                

            }    
                                    
            JOptionPane.showMessageDialog(null,"Numero digitado " + contador);              
      }
   }