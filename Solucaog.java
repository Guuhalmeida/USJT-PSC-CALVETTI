import javax.swing.JOptionPane;
public class Solucaog
   {
      public static void main(String[] args)
      {
         String sNascimento = JOptionPane.showInputDialog
         ("Digite nascimento");
         
         String sAno = JOptionPane.showInputDialog
         ("Digite o ano:");      
         
        int nascimento = Integer.parseInt(sNascimento);
        int ano = Integer.parseInt(sAno);
        
        int idade = nascimento - ano;
        
        int vividos = idade * 365;
        
         JOptionPane.showMessageDialog(null, "Dias que voce viveu " + vividos);
         
      }
   }