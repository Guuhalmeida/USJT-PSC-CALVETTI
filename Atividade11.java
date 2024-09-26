import javax.swing.JOptionPane;
public class Atividade11 {

    public static void main(String[] args) {
        int codigo;
        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;
        double somaConsumoResidencial = 0;
        double somaConsumoComercial = 0;
        int contadorResidencial = 0;
        int contadorComercial = 0;

        while (true) {
            String entradaCodigo = JOptionPane.showInputDialog("Digite o código do consumidor (ou 0 para sair):");
            codigo = Integer.parseInt(entradaCodigo);

            if (codigo == 0) {
                break; 
            }

            String entradaKwh = JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:");
            double kWh = Double.parseDouble(entradaKwh);

            String entradaTipo = JOptionPane.showInputDialog("Digite o tipo do consumidor (1 - residencial, 2 - comercial, 3 - industrial):");
            int tipo = Integer.parseInt(entradaTipo);

            double custo = 0;

            
            switch (tipo) {
                case 1: 
                    custo = kWh * 0.3;
                    totalResidencial += custo;
                    somaConsumoResidencial += kWh;
                    contadorResidencial++;
                    break;
                case 2: 
                    custo = kWh * 0.5;
                    totalComercial += custo;
                    somaConsumoComercial += kWh;
                    contadorComercial++;
                    break;
                case 3: 
                    custo = kWh * 0.7;
                    totalIndustrial += custo;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Tipo inválido. Digite 1, 2 ou 3.");
                    continue;
            }

           
            JOptionPane.showMessageDialog(null, "Custo total para o consumidor " + codigo + ": R$ " + custo);
        }

       
        double totalGeral = totalResidencial + totalComercial + totalIndustrial;
        double mediaConsumoResidencial = (contadorResidencial > 0) ? (somaConsumoResidencial / contadorResidencial) : 0;
        double mediaConsumoComercial = (contadorComercial > 0) ? (somaConsumoComercial / contadorComercial) : 0;

        
        String resultadoFinal = "Total Residencial: R$ " + totalResidencial +
                                 "Total Comercial: R$ " + totalComercial +
                                 "Total Industrial: R$ " + totalIndustrial +
                                 "Total Geral: R$ " + totalGeral +
                                 "Média de consumo Residencial: " + mediaConsumoResidencial +
                                 "Média de consumo Comercial: " + mediaConsumoComercial;

        JOptionPane.showMessageDialog(null, resultadoFinal);
    }
}
