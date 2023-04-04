package br.edu.fesfafic.carro.Model;

public class Carro {
    public String marca;
    public String cor;
    public String modelo;
    public boolean ligado;
    public double velocidade;

    public Carro(String marca, String cor, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.ligado = false;
        this.velocidade = 0;
    }
    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.velocidade = 0;
        this.ligado = false;
    }

    public void acelerar(double velocidade){
        if(ligado)
            this.velocidade += velocidade;
        else
            System.out.println("O carro está desligado.");
    }

    public void frear(double velocidade){
        if(ligado){
            if(this.velocidade - velocidade > 0)
                this.velocidade -= velocidade;
            else
                this.velocidade = 0;
        }
        else
            System.out.println("O carro está desligado.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ligado=" + ligado +
                ", velocidade=" + velocidade +
                '}';
    }
}
