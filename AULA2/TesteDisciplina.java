import javax.swing.JOptionPane;

public class TesteDisciplina {
    public static void main(String[] args) {
        // Coletando dados do usuário
        String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina:");
        String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do professor:");
        int semestreDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre:"));
        boolean ofertada = JOptionPane.showConfirmDialog(null, "A disciplina é ofertada?", "Ofertada", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        // Instanciando a disciplina
        Disciplina disciplina = new Disciplina(nomeDisciplina, nomeProfessor, semestreDisciplina, ofertada);

        // Exibindo os dados da disciplina criada
        JOptionPane.showMessageDialog(null, disciplina.exibirDados());
    }
}
