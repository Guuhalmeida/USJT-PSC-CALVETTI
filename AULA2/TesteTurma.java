import javax.swing.JOptionPane;

public class TesteTurma {
    public static void main(String[] args) {
        // Coletando dados do usuário
        String nome = JOptionPane.showInputDialog("Digite o nome da turma:");
        String curso = JOptionPane.showInputDialog("Digite o curso:");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a série:"));

        // Instanciando a turma
        sTurma turma = new sTurma(nome, curso, quantidadeDeAlunos, serie);

        // Exibindo os dados da turma criada
        JOptionPane.showMessageDialog(null, turma.exibirDados());

        // Pedindo nova quantidade de alunos
        int novaQuantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos:"));
        turma.setQuantidadeDeAlunos(novaQuantidade);

        // Exibindo os dados atualizados da turma
        JOptionPane.showMessageDialog(null, turma.exibirDados());
    }
}
