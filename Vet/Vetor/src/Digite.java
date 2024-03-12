import java.util.Scanner;

public class Digite {

    public static void main(String[] args) {
        
        Nome nome = new Nome();
        String n[] = new String[3];

        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++){

            n[i] = input.nextLine();
            nome.setNome(n);


        }

        nome.Imprimir();

    }

}
