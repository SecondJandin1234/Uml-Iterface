import entities.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        // Aparelho telefonico
        System.out.println("Aparelho telefonico\n");
        iphone.atender();
        iphone.ligar("123456789");
        iphone.correioDeVoz();

        // Navegador da internet
        System.out.println("Navegador da internet \n");
        iphone.addNovaPg();
        iphone.atualizarPg();
        iphone.exibirPg();

        // Reprodutor Musical
        System.out.println("Reprodutor Musical\n");
        iphone.SelectMusica("nome da musica");
        iphone.tocarMusica("musica");
        iphone.pausarMusica();
    }
}
