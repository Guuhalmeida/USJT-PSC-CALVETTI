import javax.swing.JOptionPane;
public class Solucaoj
   {
    public static void main(String[] args) 
      {
        // Leitura das Strings usando JOptionPane
        String str1 = JOptionPane.showInputDialog("Digite a primeira String:");
        String str2 = JOptionPane.showInputDialog("Digite a segunda String:");
        String str3 = JOptionPane.showInputDialog("Digite a terceira String:");

        // Cálculo dos comprimentos
        int comprimento1 = str1.length();
        int comprimento2 = str2.length();
        int comprimento3 = str3.length();

        // Soma dos comprimentos
        int somaComprimentos = comprimento1 + comprimento2 + comprimento3;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "A soma dos comprimentos das Strings é: " + somaComprimentos);
      }
   }
