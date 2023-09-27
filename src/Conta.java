public class Conta {
    private String banco;
    private String descricao;
    private Usuario usuario;

    public Conta(String banco, String descricao, Usuario usuario) {
        this.banco = banco;
        this.descricao = descricao;
        this.usuario = usuario;
    }

    public String getBanco() {
        return banco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void dadosUsuario(Usuario usuario) {
        System.out.println("**** Dados do Usuario ****");
        System.out.println("Usuario ->" + usuario.getNome());
        System.out.println("Email do usuario ->" + usuario.getEmail());
        System.out.println("Banco -> " + getBanco());
        System.out.println("Descricao -> " + getDescricao());
    }

}
