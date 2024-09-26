import javax.swing.JOptionPane;
public class Atividade13 {

    public static void main(String[] args) {
        String entradaNumero = JOptionPane.showInputDialog("Digite um número:");
        int numero = Integer.parseInt(entradaNumero);

      
        boolean ehPrimo = isPrimo(numero);

        
        if (ehPrimo) {
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
        }
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
