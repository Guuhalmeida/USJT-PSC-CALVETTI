import javax.swing.JOptionPane;
public class SolucaoP
   {
      public static void main(String[] args) 
      {
         String sPalavraone = JOptionPane.showInputDialog
         ("Digite a primeira palavra:");
         String sPalavratwo = JOptionPane.showInputDialog
         ("Digite a segunda palavra:");
         String sPalavratree = JOptionPane.showInputDialog
         ("Digite a terceira palavra:");
         
         int meioum = sPalavraone.length()/2;
         int meiodois = sPalavratwo.length()/2;
         int meiotres = sPalavratree.length()/2;
         
         String oneprimeiraparte = sPalavraone.substring(0,meioum);
         String onesegundaparte = sPalavraone.substring(meioum);
         String twoprimeiraparte = sPalavratwo.substring(0,meiodois);
         String twosegundaparte = sPalavratwo.substring(meiodois);
         String treeprimeiraparte = sPalavratree.substring(0,meiotres);
         String treesegundaparte = sPalavratree.substring(meiotres);

         JOptionPane.showMessageDialog(null, "Frases completas " + sPalavraone +" "+ sPalavratwo + " " +sPalavratree);
         
         JOptionPane.showMessageDialog(null, "Emparalhado " + onesegundaparte + " " +  treesegundaparte +" " + twosegundaparte + " " + oneprimeiraparte + " " + treeprimeiraparte + " " + onesegundaparte);

      }
   }