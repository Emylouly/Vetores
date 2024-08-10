public class Funcionario {

    private String cpf;
    private String nome;
    private String rg;
    private String telefone;
    private Empresa empresa;

    public Funcionario(String cpf, String nome, String rg, String telefone, Empresa empresa){

        super();
        this.cpf = cpf;
        this.telefone = telefone;
        this.nome = nome;
        this.rg = rg;
        this.empresa = empresa;

    }

    public Funcionario(){}
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getRg() {
        return rg;
    }
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", telefone=" + telefone + "]";
    }

}
