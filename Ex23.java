import javax.swing.JOptionPane;
public class Ex23
{
    public static void main(String[] args)
    {
        String numero1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        String numero2Str = JOptionPane.showInputDialog("Digite o segundo número:");
        String numero3Str = JOptionPane.showInputDialog("Digite o terceiro número:");

        int numero1;
        int numero2;
        int numero3;
        int maior, intermediario, menor;

        try {
            numero1 = Integer.parseInt(numero1Str);
            numero2 = Integer.parseInt(numero2Str);
            numero3 = Integer.parseInt(numero3Str);
        } catch (NumberFormatException e) 
        
        {
            JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
            return;
        }

        
        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) 
        
        {
            JOptionPane.showMessageDialog(null, "Os números devem ser diferentes.");
            return;
        }

        
        if (numero1 > numero2 && numero1 > numero3) 
        {
           maior = numero1;
           if (numero2 > numero3) 
            
        {
            intermediario = numero2;
            menor = numero3;
        }
        
        else 
        {
           intermediario = numero3;
           menor = numero2;
        }
        
        } else if (numero2 > numero1 && numero2 > numero3)
        
        {
          
           maior = numero2;
           if (numero1 > numero3)
           
        {
           intermediario = numero1;
           menor = numero3;
        } 
        
        else
        {
           intermediario = numero3;
           menor = numero1;
        }
        
        
        } 
         
         else
        {
           maior = numero3;
           if (numero1 > numero2) 
            
        {
           intermediario = numero1;
           menor = numero2;
        } 
                
        else
        {
           intermediario = numero2;
           menor = numero1;
        }
        
        
      }
        JOptionPane.showMessageDialog(null,  + maior + " , " + intermediario + ", " + menor);
    }
}
