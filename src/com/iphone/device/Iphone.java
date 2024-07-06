package com.iphone.device;

import com.iphone.services.AparelhoTelefonico;
import com.iphone.services.NavegadorInternet;
import com.iphone.services.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocarMusica() {
        System.out.println("tocando música");
    };

    public void pausarMusica() {
        System.out.println("música pausanda");
    };

    public void selecionarMusica() {
        System.out.println("música selecionada!");
    };

    public void ligar() {
        System.out.println("aparelho ligado");
    };

    public void atender() {
        System.out.println("atendendo o telefone");
    };

    public void iniciarCorreioVoz() {
        System.out.println("correio de voz iniciado");
    };

    public void exibirPagina() {
        System.out.println("exibindo pagina");
    };

    public void adicionarNovaAba() {
        System.out.println("nova aba adicionada");
    };

    public void atualizarPagina() {
        System.out.println("pagina atualizada");
    };
}
