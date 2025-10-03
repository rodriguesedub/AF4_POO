public class ProfessorBolsista extends Professor{
    float valorBolsa;
    public ProfessorBolsista(int matricula, String nome, float valorBolsa){
        super(matricula, nome);
        this.valorBolsa = valorBolsa;
    }

    @Override
    public float getSalario(){
        return valorBolsa;
    }

    @Override
    public void imprime(){
        System.out.println("*** PROF.HORISTA *** ");
        super.imprime();
        System.out.printf("Salario...: R$ %.2f\n", getSalario());
    }
}
