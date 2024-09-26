import javax.swing.JOptionPane;
public class Atividade15 {

    public static void main(String[] args) {
        int numero;
        int maior = Integer.MIN_VALUE; 

        while (true) {
            String entradaNumero = JOptionPane.showInputDialog("Digite um número (ou -9999 para sair):");
            numero = Integer.parseInt(entradaNumero);

            if (numero == -9999) {
                break; 
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum número válido foi digitado.");
        }
    }
}
