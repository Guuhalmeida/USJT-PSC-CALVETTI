import javax.swing.JOptionPane;
public class solucaoQ 
   {
    public static void main(String[] args)
             {
        // Solicita a data ao usuário
        String input = JOptionPane.showInputDialog("Digite a data no formato ddmmaa (por exemplo, 250924 para 25 de setembro de 2024):");

        try {
            // Converte a entrada para um número inteiro
            int dataInteiro = Integer.parseInt(input);
            
            // Extraí o dia, mês e ano da data
            int dia = dataInteiro / 10000;        // Obtém os dois primeiros dígitos para o dia
            int mesAno = dataInteiro % 10000;     // Obtém os quatro últimos dígitos
            int mes = mesAno / 100;                // Obtém os dois primeiros dígitos dos últimos quatro para o mês
            int ano = mesAno % 100;                // Obtém os dois últimos dígitos para o ano
            
            // Exibe o resultado
            JOptionPane.showMessageDialog(null, String.format("Dia: 1\nMês: 12\nAno: 2005", dia, mes, ano));
          }
           catch (NumberFormatException e) 
          {
            // Trata o caso onde a entrada não é um número válido
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido no formato ddmmaa.");
         }
    }
}
