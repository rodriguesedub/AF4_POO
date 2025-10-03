public class ProfessorHorista extends Professor{
    private float valorHora;
    private float numeroHoras;
    public ProfessorHorista(int matricula, String nome, float valorHora, float numeroHoras){
        super(matricula, nome);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }
    
    @Override
    public float getSalario(){
        return valorHora*numeroHoras;
    }

    @Override
    public void imprime(){
        System.out.println("*** PROF.HORISTA *** ");
        super.imprime();
        System.out.printf("Salario...: R$ %.2f\n", getSalario());
    }
}
