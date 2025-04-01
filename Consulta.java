import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Consulta implements AcaoMenu{

    private Paciente paciente;
    private Medico medico;
    private Date data;
    private String receituario;
    private double valor;
    private Consulta[] consultas;

    public Consulta(){

    }

    public Consulta(Consulta[] consultas){
        this.consultas = consultas;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public void marcarConsulta(Medico medico,Paciente paciente,Date data){
        System.out.println("Marcar consulta");
    }

    public void cancelarConsulta(){
        System.out.println("Cancelar consulta marcada");
    }

    public Consulta[] pesquisarPorPaciente(Paciente paciente){
        List<Consulta> consultasEncontradas =  new ArrayList<>();

        if (consultas != null){
            for (Consulta consulta : consultas){
                if (consulta != null && consulta.getPaciente() != null && consulta.getPaciente().equals(paciente)) {
                    consultasEncontradas.add(consulta);
                }
            }
        }
        return consultasEncontradas.toArray(new Consulta[0]);
    }


    @Override
    public void executar() {
        System.out.println("executando opção 1");
    }
}
