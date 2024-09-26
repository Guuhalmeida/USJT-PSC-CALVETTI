import javax.swing.JOptionPane;
public class Atividade12 {

    public static void main(String[] args) {
        int idade;
        int contadorMenosDe21 = 0;
        int contadorMaisDe50 = 0;

        while (true) {
            String entradaIdade = JOptionPane.showInputDialog("Digite a idade (ou uma idade fora da faixa 0-120 para sair):");
            idade = Integer.parseInt(entradaIdade);

            
            if (idade < 0 || idade > 120) {
                break; 
            }

            
            if (idade < 21) {
                contadorMenosDe21++;
            }
            if (idade > 50) {
                contadorMaisDe50++;
            }
        }

        String resultadoFinal = "Total de pessoas com menos de 21 anos: " + contadorMenosDe21 +
                                 "\nTotal de pessoas com mais de 50 anos: " + contadorMaisDe50;

        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}
