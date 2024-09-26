import javax.swing.JOptionPane;
public class Ex20
 {
 
    public static void main(String[] args) 
    {
        String numero1Str = JOptionPane.showInputDialog("Digite o primeiro número:");
        String numero2Str = JOptionPane.showInputDialog("Digite o segundo número:");

        int numero1;
        int numero2;

        try {
           numero1 = Integer.parseInt(numero1Str);
           numero2 = Integer.parseInt(numero2Str);
        } catch (NumberFormatException e) 
        
        {
            JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.");
            return;
        }

        if (numero1 == numero2) 
        
        {
            JOptionPane.showMessageDialog(null, "Os números devem ser diferentes.");
            return;
        }

        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        int quadradoMenor = menor * menor;

    
        double raizMaior;
        if (maior >= 0) 
        {
            raizMaior = Math.sqrt(maior);
            JOptionPane.showMessageDialog(null, "Quadrado do menor número (" + menor + "): " + quadradoMenor +
                    "quadrada do maior número (" + maior + "): " + raizMaior);
        } else {
            JOptionPane.showMessageDialog(null, "Quadrado do menor número (" + menor + "): " + quadradoMenor +
                    "quadrada do maior número (" + maior + ") não é possível (número negativo).");
        }
    }
}
