public class RegraNegocioFuncionario {

    Funcionario [] funcionarios = new Funcionario[5];
    int count = 0;

    public void cadastroFuncionario(Funcionario f){

        funcionarios[count] = f;
        count++;
    }

    public Funcionario[] listar(){

        return funcionarios;

    }

}
