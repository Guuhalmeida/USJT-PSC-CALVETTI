import javax.swing.JOptionPane;
public class Atividade14 {

    public static void main(String[] args) {
        int quantidadePrimos = 0;

        while (true) {
            String entradaNumero = JOptionPane.showInputDialog("Digite um número inteiro positivo (ou um número não positivo para sair):");
            int numero = Integer.parseInt(entradaNumero);

           
            if (numero <= 0) {
                break; 
            }

            
            if (isPrimo(numero)) {
                quantidadePrimos++;
            }
        }

        
        JOptionPane.showMessageDialog(null, "Quantidade de números primos: " + quantidadePrimos);
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
