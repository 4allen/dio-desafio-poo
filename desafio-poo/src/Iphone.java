public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO  DE VOZ.");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }
    
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    
    public static void main(String[] args) {
        Iphone meuiPhone = new Iphone();

        // Usando o iPhone como Reprodutor Musical
        meuiPhone.selecionarMusica("Música 1");
        meuiPhone.tocar();
        meuiPhone.pausar();

        // Usando o iPhone como Aparelho Telefônico
        meuiPhone.ligar();
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        // Usando o iPhone como Navegador na Internet
        meuiPhone.exibirPagina("https://www.example.com");
        meuiPhone.adicionarNovaAba("https://www.google.com");
        meuiPhone.atualizarPagina();
    }
}
