public class Termostato {
    private int temperatura;

    public Termostato() {
        this.temperatura = 20; 
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 15 && temperatura <= 28) {
            this.temperatura = temperatura;
        } else {
            throw new IllegalArgumentException("Temperatura deve estar entre 15 e 28 graus.");
        }
    }
}
