import java.util.Date;

public class Procedimento implements AcaoMenu{
    private Paciente paciente;
    private Medico[] medicos;
    private Date data;
    private Sala sala;
    private String observacoes;
    private double valor;
    private int tempoDuracao;


    @Override
    public void executar(){
        System.out.println("executando opção 2");
    }
}
