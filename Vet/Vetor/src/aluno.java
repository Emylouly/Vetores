import java.util.Scanner;

public class aluno {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        App n = new App();
        String ne[] = new String[3];

        System.out.println("digite:");

        for(int i=0; i<3; i++){

            ne[i]=input.nextLine();
            n.setAluno(ne);

        }  


        n.ImprimirAluno();
 
}
}
