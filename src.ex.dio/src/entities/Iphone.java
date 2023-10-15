package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    @Override
    public void tocarMusica(String nomeMusica) {
        System.out.println("Tocando a musica " + nomeMusica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");

    }

    @Override
    public void SelectMusica(String selectionMusic) {
        System.out.println("Musica selecionada: " + selectionMusic);
    }

    @Override
    public void exibirPg() {
        System.out.println("Pagina sendo exbida ");

    }

    @Override
    public void addNovaPg() {
        System.out.println("Nova pagina adicionada");
    }

    @Override
    public void atualizarPg() {
        System.out.println("Pagina Atualizada");

    }

    @Override
    public void ligar(String num) {
        System.out.println("Ligando para o número" + num);

    }

    @Override
    public void atender() {
        System.out.println("Atendendo");

    }

    @Override
    public void correioDeVoz() {
        System.out.println("Correio de voz");
        ;
    }

}
