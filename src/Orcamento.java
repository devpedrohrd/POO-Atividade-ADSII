import java.time.LocalDate;

public class Orcamento {
    private LocalDate data;
    private double valor;
    private String descricao;
    private Usuario usuario;

    public Orcamento(LocalDate data, double valor, String descricao) {
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirOrcamento(Usuario usuario) {
        System.out.println("*****************");
        System.out.println("Usuario -> " + usuario.getNome());
        System.out.println("Email do Usuario -> " + usuario.getEmail());
        System.out.println("Descricao -> " + getDescricao());
        System.out.println("Valor do orcamento -> " + getValor());
        System.out.println("Data -> " + getData());
        System.out.println("******************");
    }
}
