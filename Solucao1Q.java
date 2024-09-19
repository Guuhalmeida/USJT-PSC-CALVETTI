import javax.swing.JOptionPane;
public class Solucao1Q

    {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite a data no formato ddmmaa:");

        int dia = Integer.parseInt(input.substring(0, 2));
        int mes = Integer.parseInt(input.substring(2, 4));
        int ano = Integer.parseInt(input.substring(4, 6));

        ano += 2000;

        String mensagem = "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}