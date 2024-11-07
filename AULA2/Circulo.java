public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcArea(){
        return Math.PI * raio * raio;
    }

    public double calcPerimetro(){
        return 2 * Math.PI * raio;
    }
}