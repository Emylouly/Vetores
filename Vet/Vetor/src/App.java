public class App {
    private String aluno[] = new String[3];

    public void setAluno(String[] aluno) {
        this.aluno = aluno;
    }

    public String[] getAluno() {
        return aluno;
    }

    public void ImprimirAluno(){

        for(String n: aluno){
        System.out.println("aluno: " + n);
}
    }
}
