public class Disciplina {
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    // Construtor
    public Disciplina(String nomeDisciplina, String nomeProfessor, int semestreDisciplina, boolean oferta) {
        nome = nomeDisciplina;       // Atribui diretamente aos atributos
        professor = nomeProfessor;   // Atribui diretamente aos atributos
        semestre = semestreDisciplina; // Atribui diretamente aos atributos
        ofertada = oferta;           // Atribui diretamente aos atributos
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public boolean isOfertada() {
        return ofertada;
    }

    // Método para exibir os dados da disciplina
    public String exibirDados() {
        return "Nome da Disciplina: " + nome +
               "\nProfessor: " + professor +
               "\nSemestre: " + semestre +
               "\nOfertada: " + (ofertada ? "Sim" : "Não");
    }
}
