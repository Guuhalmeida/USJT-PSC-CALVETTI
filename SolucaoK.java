import javax.swing.JOptionPane;
public class SolucaoK
   {
     public static void main (String[] args)
     {
      String sValor = JOptionPane.showInputDialog
      ("Digite o valor:");
      
      String sJuros = JOptionPane.showInputDialog
      ("Digite o juros:");
      
      String sMeses = JOptionPane.showInputDialog
      ("Digite o mes:");
      
      
      double valor = Double.parseDouble(sValor);
      double juros = Double.parseDouble(sJuros);
      double meses = Double.parseDouble(sMeses);
      
      double taxaDecimal = juros / 100;
      double Valor_final = valor * Math.pow((1 + juros/100), meses);
      
      JOptionPane.showMessageDialog(null, "O saldo da conta sera de = " + Valor_final);       
     
      
         
      
     }
   }