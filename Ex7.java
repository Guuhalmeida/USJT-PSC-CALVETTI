import javax.swing.JOptionPane;
public class Ex7 
   {
      public static void main(String[] args)
      {
         String sNome = JOptionPane.showInputDialog
         ("Digite o nome:");
         
         String cSexo = JOptionPane.showInputDialog
         ("Digite o sexo");
         
         String sIdade = JOptionPane.showInputDialog
         ("Digite a idade:");
         
         int idade = Integer.parseInt(sIdade);
         
         if(idade < 25 && cSexo == "F" || cSexo == "f") 
         {
             JOptionPane.showMessageDialog
             (null, "Pessoa Aceita" + sNome);
                
         }
         
         else 
         {
            JOptionPane.showMessageDialog
            (null, "Pessoa nao aceita");
         }
         
         
      }
   }
