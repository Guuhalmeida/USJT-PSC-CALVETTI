public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        nome = nomeProduto;        // Atribui diretamente aos atributos
        preco = precoProduto;      // Atribui diretamente aos atributos
        quantidade = quantidadeProduto; // Atribui diretamente aos atributos
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Métodos modificadores (setters)
    public void setPreco(double novoPreco) {
        preco = novoPreco; // Atribui diretamente
    }

    public void setQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade; // Atribui diretamente
    }

    // Método para exibir os dados do produto
    public String exibirDados() {
        return "Nome do Produto: " + nome +
               "\nPreço: " + preco +
               "\nQuantidade: " + quantidade;
    }
}
