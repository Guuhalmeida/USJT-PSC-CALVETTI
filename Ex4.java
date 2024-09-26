import javax.swing.JOptionPane;
public class Ex4 
   {
      public static void main(String[] args)
      {
         String sNumero = JOptionPane.showInputDialog
         ("Ler numero");
          String sNumero2 = JOptionPane.showInputDialog
         ("Ler numero dois"); 
          String sNumero3 = JOptionPane.showInputDialog
         ("Ler numero tres"); 
         
         int num1 = Integer.parseInt(sNumero);
         int num2 = Integer.parseInt(sNumero2);
         int num3 = Integer.parseInt(sNumero3);
         
         int menor,medio,maior;
         
        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                medio = num2;
                maior = num3;
            } else {
                medio = num3;
                maior = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            if (num1 < num3) {
                medio = num1;
                maior = num3;
            } else {
                medio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 < num2) {
                medio = num1;
                maior = num2;
            } else {
                medio = num2;
                maior = num1;
                
            }
        }
           JOptionPane.showMessageDialog
                (null, "Os numeros em ordem cresente sao "  + menor + ", " + medio + ", " + maior);
  
                
      }
   }