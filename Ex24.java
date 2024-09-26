import javax.swing.JOptionPane;
public class Ex24 {
    public static void main(String[] args) {
        int quantidade = 5;
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 

        for (int i = 1; i <= quantidade; i++) {
            String numeroStr = JOptionPane.showInputDialog("Digite o " + i + "º número:");
            int numero;

            try {
               numero = Integer.parseInt(numeroStr);
            } catch (NumberFormatException e) 
            
            {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                i--; 
                continue;
            }

            
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior +  "E o menor numero é: " + menor);
    }
}
