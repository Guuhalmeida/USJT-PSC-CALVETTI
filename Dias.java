import javax.swing.JOptionPane;
public class Dias
   {
      public static void main (String[] args)
      {
       String data = JOptionPane.showInputDialog
       ("Digite a data:");
       
       String mes = JOptionPane.showInputDialog
       ("Digite o mes:");
       
       String ano = JOptionPane.showInputDialog
       ("Digite o ano:");
       
         //Apresentando o resultado
         JOptionPane.showMessageDialog(null, "Dias = " + data + "/" +  mes + "/" +  ano);
             
      }
   }   
      
   