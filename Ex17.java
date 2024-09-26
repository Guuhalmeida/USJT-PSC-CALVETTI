import javax.swing.JOptionPane;
public class Ex17

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

        int menor = (numero1 < numero2) ? numero1 : numero2;
        JOptionPane.showMessageDialog(null, "O menor número é: " + menor);
    }
}
