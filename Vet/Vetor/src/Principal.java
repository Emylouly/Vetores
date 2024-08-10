import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        System.out.println("cafe");
        
        Empresa emp1 = new Empresa("213435", "Boa Sorte", "2345");
        Empresa emp2 = new Empresa("343556", "Café Jao", "45667");
        Empresa emp3 = new Empresa("087634", "Loura", "09876");

        Funcionario fun1 = new Funcionario("2343556", "Carlos", "1223345", "7643231", emp1);
        Funcionario fun2 = new Funcionario("8754322", "Miguel", "0864534", "12234545", emp1);

        Funcionario fun3 = new Funcionario("234566", "Davi", "7858456", "1234", emp2);
        Funcionario fun4 = new Funcionario("685674578", "Lucas", "1223345", "7643231", emp2);

        Funcionario fun5 = new Funcionario("eryey", "Mari", "1223345", "7643231", emp3);
        Funcionario fun6 = new Funcionario("esgsg", "Jose", "1223345", "7643231", emp3);

        RegraNegocioEmpresa reg = new RegraNegocioEmpresa();
        RegraNegocioFuncionario fuc = new RegraNegocioFuncionario();

        reg.cadastrarEmpresa(emp1);
        reg.cadastrarEmpresa(emp2);
        reg.cadastrarEmpresa(emp2);

        fuc.cadastroFuncionario(fun1);
        fuc.cadastroFuncionario(fun2);
        fuc.cadastroFuncionario(fun3);
        fuc.cadastroFuncionario(fun4);
        fuc.cadastroFuncionario(fun5);

        System.out.println(Arrays.toString(reg.listar()));
        System.out.println(Arrays.toString(fuc.listar()));


    }

}
