import javax.swing.JOptionPane;
public class Atividade10 {

    public static void main(String[] args) {
        int numero;

        while (true) {
            String entrada = JOptionPane.showInputDialog("Digite um número (ou -999 para sair):");
            numero = Integer.parseInt(entrada);

            if (numero == -999) {
                break;
            }

            imprimirDivisores(numero);
        }
        
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }

    public static void imprimirDivisores(int numero) {
        StringBuilder divisores = new StringBuilder("Divisores de " + numero + ": ");

        for (int i = 1; i <= Math.abs(numero); i++) {
            if (numero % i == 0) {
                divisores.append(i).append(" ");
            }
        }

        JOptionPane.showMessageDialog(null, divisores.toString());
    }
}
