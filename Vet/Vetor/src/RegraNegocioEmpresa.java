public class RegraNegocioEmpresa {

    Empresa [] empresas = new Empresa[5];
    int count = 0;

    public void cadastrarEmpresa(Empresa emp){

        empresas[count] = emp;
        count++;

    }

    public Empresa[] listar(){

        return empresas;

    }

}
