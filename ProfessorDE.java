public class ProfessorDE extends Professor {
    float salario;
    public ProfessorDE(int matricula, String nome, float salario){
        super(matricula, nome);
        this.salario = salario;
    }

    @Override
    public float getSalario(){
        return salario;
    }

    @Override
    public void imprime(){
        System.out.println("*** PROF.D.E. ***");
        super.imprime();
        System.out.printf("Salario...: R$ %.2f\n", getSalario());
    }
}
