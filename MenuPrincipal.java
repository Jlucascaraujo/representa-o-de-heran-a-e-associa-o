import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner;
    private Map<Integer, AcaoMenu> opcoes;

    public MenuPrincipal() {
        this.scanner = new Scanner(System.in);
        this.opcoes = new HashMap<>();

        opcoes.put(1, new Consulta());
        opcoes.put(2, new Procedimento());
        opcoes.put(3, new Paciente());
        opcoes.put(4, new Medico());
    }

    public void exibirMenu() {
        System.out.println("----- Menu Principal -----");
        for (Map.Entry<Integer, AcaoMenu> entry : opcoes.entrySet()){
            System.out.println(entry.getKey() + ". Opção " + entry.getKey());
        }
        System.out.println("0. Sair");
        System.out.println("Escolha uma opção: ");
    }

    public void executarOpcao(int opcao){
        if(opcoes.containsKey(opcao)){
            opcoes.get(opcao).executar();
        } else if (opcao == 0) {
            System.out.println("Saindo do Sistema");
        } else {
            System.out.println("Opção Inválida");
        }
    }

    public void iniciar(){
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            executarOpcao(opcao);
            System.out.println();
        } while (opcao != 0);
        scanner.close();
    }
}
