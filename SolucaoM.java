import javax.swing.JOptionPane;
public class SolucaoM 
   {
    public static void main(String[] args) 
      {
        String nl = JOptionPane.showInputDialog("Digite o ângulo em graus:");
        double graus = Double.parseDouble(nl);
        double radianos = graus * Math.PI / 180;
        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);

        String mensagem = "Seno: " + seno + "\n" + "Cosseno: " + cosseno + "\n";

        if (cosseno == 0) 
        {
            mensagem += "Tangente: indefinido (cosseno é zero)";
        } else
        
        {
            mensagem += "Tangente: " + tangente;
        }

          JOptionPane.showMessageDialog(null, mensagem);
    }
}