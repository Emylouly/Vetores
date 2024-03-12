import java.util.Arrays;

public class Nome {

    private String nome[] = new String[3];

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public String[] getNome() {
        return nome;
    }


    public void Imprimir(){


        Arrays.sort(nome);

        for(String n: nome){

            System.out.println(n);

        }

    }


}
