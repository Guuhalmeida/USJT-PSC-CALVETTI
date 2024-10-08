public class sTurma {
    private String nome;
    private String curso;
    private int quantidadeDeAlunos;
    private int serie;

    // Construtor
    public sTurma(String nome, String curso, int quantidadeDeAlunos, int serie) {
        // Atribuindo os parâmetros diretamente aos atributos
        nome = nome;
        curso = curso;
        quantidadeDeAlunos = quantidadeDeAlunos;
        serie = serie;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public int getSerie() {
        return serie;
    }

    // Métodos modificadores (setters)
    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    // Método para exibir os dados da turma
    public String exibirDados() {
        return "Nome da Turma: " + nome + 
               "\nCurso: " + curso + 
               "\nQuantidade de Alunos: " + quantidadeDeAlunos + 
               "\nSérie: " + serie;
    }
}
