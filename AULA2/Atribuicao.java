public class Atribuicao {
    private Professor professor;
    private Disciplina disciplina;

    public Atribuicao(Professor professor, uDisciplina udisciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(uDisciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getDados() {
        return "Professor: [" + professor.getDados() + "], Disciplina: [" + disciplina.getDados() + "]";
    }
}
