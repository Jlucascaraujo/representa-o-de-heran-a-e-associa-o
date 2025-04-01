public class SistemaHospitalar {
    public static void main(String[] args){
        Mensagens mensagens = new Mensagens();
        mensagens.ExibirMensagemInicial();

        MenuPrincipal menu = new MenuPrincipal();
        menu.iniciar();
    }
}

