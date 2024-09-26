import javax.swing.JOptionPane;
public class Atividade5
   {
      public static void main(String[] args)
      {
         String amor = "";
         while(true)
         {
             String nome = JOptionPane.showInputDialog("Digite o nome");
             
             
             if(nome.equals("fim"))
             {
               break;
             }
                   
             amor = amor.concat(nome + " ");
         }
         
         JOptionPane.showMessageDialog(null,"imprimido" + amor);
      }
   }