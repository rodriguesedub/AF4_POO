public class Professor {
    private int matricula;
    private String nome;
    public Professor(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public float getSalario(){
        return 0;
    }

    public void imprime(){
        System.out.println("Matricula.: "+ matricula);
        System.out.println("Nome......: "+ nome);
    }
}
