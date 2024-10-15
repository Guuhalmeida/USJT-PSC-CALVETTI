import javax.swing.JOptionPane;

public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr ar = new CondicionadorDeAr();

        
        try {
            ar.aumentarTemperatura();    
            ar.reduzirTemperatura();              
            ar.ligar(); 

            ar.aumentarTemperatura(); 
            ar.aumentarTemperatura();
            ar.aumentarTemperatura(); 
            ar.aumentarTemperatura(); 
            ar.aumentarTemperatura(); 
            ar.imprimirTemperatura();  

            
            for (int i = 0; i < 5; i++) {
            ar.aumentarTemperatura();            }

            
            for (int i = 0; i < 10; i++) {
                ar.reduzirTemperatura(); 
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
