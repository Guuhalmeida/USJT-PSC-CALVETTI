import javax.swing.JOptionPane;
public class SolucaoR2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a data no formato ddmmaa ou dd/mm/aa:");

        input = input.replace("/", "");

        if (input.length() == 6) {
            String dia = input.substring(0, 2);
            String mes = input.substring(2, 4);
            String ano = input.substring(4, 6);

            String mensagem = "Sua data correta é: " + dia + "/" + mes + "/" + ano;
            JOptionPane.showMessageDialog(null, mensagem);
        } else {

        }
    }
}
