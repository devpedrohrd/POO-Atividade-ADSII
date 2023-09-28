import java.time.LocalDate;
import java.util.List;

public class Receita {
    private double valor;
    private String descricao;
    private String categoria;
    private LocalDate data;
    private Conta conta;

    public Receita(double valor, String descricao, String categoria, LocalDate data, Conta conta) {
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
        this.conta = conta;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getData() {
        return data;
    }

    public void exibirDespesa(Conta conta) {
        System.out.println("*****************");
        System.out.println("Banco -> " + conta.getBanco());
        System.out.println("Descricao -> " + getDescricao());
        System.out.println("Categoria -> " + getCategoria());
        System.out.println("Valor da receita -> " + getValor());
        System.out.println("Data -> " + getData());
        System.out.println("******************");
    }

}
