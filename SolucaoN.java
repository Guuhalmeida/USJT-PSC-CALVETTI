import javax.swing.JOptionPane;
public class SolucaoN
   {
    public static void main(String[] args)
    {   
     String input = JOptionPane.showInputDialog("Digite um número:");
     double numero = Double.parseDouble(input);

       
     double logaritmo = Math.log10(numero);
                
     String mensagem = "O logaritmo na base 10 de " + numero + " é: " + logaritmo;
               
     JOptionPane.showMessageDialog(null, mensagem);
    }
}