import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        // Coletando dados do usuário
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
        double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        int quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));

        // Instanciando o produto
        Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);

        // Exibindo os dados do produto criado
        JOptionPane.showMessageDialog(null, produto.exibirDados());
    }
}
