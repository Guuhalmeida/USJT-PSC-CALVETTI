import javax.swing.JOptionPane;
public class Ex22 
{
    public static void main(String[] args) 
      {
        String numero1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        String numero2Str = JOptionPane.showInputDialog("Digite o segundo número:");
        String numero3Str = JOptionPane.showInputDialog("Digite o terceiro número:");

        int numero1;
        int numero2;
        int numero3;
        int maior;

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

        
        maior = Math.max(numero1, Math.max(numero2, numero3));
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}
