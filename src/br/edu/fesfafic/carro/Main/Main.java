package br.edu.fesfafic.carro.Main;

import br.edu.fesfafic.carro.Model.Carro;

public class Main {
    public static void main(String[] args){
        Carro fusca = new Carro("Volkswagen", "Verde", "Fusca");
        fusca.ligar();
        fusca.acelerar(60);
        fusca.frear(20);
        System.out.println(fusca);
    }
}
