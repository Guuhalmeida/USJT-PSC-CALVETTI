import javax.swing.JOptionPane;

public class CondicionadorDeAr {
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr() {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public Termostato getTermostato() {
        return termostato;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void aumentarTemperatura() {
        if (!ligado) {
            JOptionPane.showMessageDialog(null, "Condicionador de ar desligado. Ligue primeiro.");
            return;
        }

        int novaTemperatura = termostato.getTemperatura() + 1;
        if (novaTemperatura > 28) {
            JOptionPane.showMessageDialog(null, "Temperatura máxima de 28 graus atingida.");
        } else {
            termostato.setTemperatura(novaTemperatura);
        }
    }

    public void reduzirTemperatura() {
        if (!ligado) {
            JOptionPane.showMessageDialog(null, "Condicionador de ar desligado. Ligue primeiro.");
            return;
        }

        int novaTemperatura = termostato.getTemperatura() - 1;
        if (novaTemperatura < 15) {
            JOptionPane.showMessageDialog(null, "Temperatura mínima de 15 graus atingida.");
        } else {
            termostato.setTemperatura(novaTemperatura);
        }
    }

    public void imprimirTemperatura() {
        if (!ligado) {
            JOptionPane.showMessageDialog(null, "Condicionador de ar desligado. Ligue primeiro.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Temperatura atual: " + termostato.getTemperatura() + " graus.");
    }
}
