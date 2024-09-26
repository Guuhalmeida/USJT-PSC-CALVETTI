import javax.swing.JOptionPane;
public class Ex15 
     {
    public static void main(String[] args) {
        String anoNascimentoStr = JOptionPane.showInputDialog("Digite o ano de nascimento:");
        String anoAtualStr = JOptionPane.showInputDialog("Digite o ano atual:");

        int anoNascimento;
        int anoAtual;

        try {
            anoNascimento = Integer.parseInt(anoNascimentoStr);
            anoAtual = Integer.parseInt(anoAtualStr);
       
          } catch (NumberFormatException e) 
        
           {
            JOptionPane.showMessageDialog(null, "Por favor, forneça anos válidos como números inteiros.");
            return;
           }

        if (anoNascimento > anoAtual) {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido. O ano deve ser menor ou igual ao ano atual.");
        } else {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "A idade da pessoa é: " + idade + " anos.");
        }
    }
}
