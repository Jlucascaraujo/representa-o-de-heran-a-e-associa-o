public class Paciente implements AcaoMenu{
    private String nome;

    public Paciente(){

    }

    public Paciente(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;
    }

    @Override
    public void executar(){
        System.out.println("executando opção 3");
    } 
}
