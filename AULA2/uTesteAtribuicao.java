import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {
        String nomeProfessor = JOptionPane.showInputDialog("Informe o nome do professor:");
        int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do professor:"));
        
        Professor professor = new Professor(nomeProfessor, idadeProfessor);

        String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina:");
        boolean praticaDisciplina = JOptionPane.showConfirmDialog(null, "A disciplina é prática?") == JOptionPane.YES_OPTION;

        Disciplina disciplina = new Disciplina(nomeDisciplina, praticaDisciplina);

        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}
