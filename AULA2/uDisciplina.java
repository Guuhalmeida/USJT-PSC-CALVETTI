public class uDisciplina {
    private String nome;
    private boolean pratica;

    public uDisciplina(String nome, boolean pratica) {
        this.nome = nome;
        this.pratica = pratica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isPratica() {
        return pratica;
    }

    public void setPratica(boolean pratica) {
        this.pratica = pratica;
    }

    public String getDados() {
        return "Nome: " + nome + ", Prática: " + (pratica ? "Sim" : "Não");
    }
}
