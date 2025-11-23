// Arquivo: Voo.java
package br.com.aeroporto;

public abstract class Voo {
    // ATRIBUTOS
    protected String numeroVoo;
    protected String origem;
    protected String destino;
    protected int assentosDisponiveis;

    // CONSTRUTOR
    public Voo(String numeroVoo, String origem, String destino, int capacidadeTotal) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.assentosDisponiveis = capacidadeTotal;
    }

    // MÉTODOS CONCRETOS
    public void reservarAssento() throws VooLotadoException {
        if (assentosDisponiveis > 0) {
            assentosDisponiveis--;
            System.out.println("Assento reservado com sucesso no voo! " + numeroVoo);
        } else {
            throw new VooLotadoException("Não há assentos disponíveis neste voo! " + numeroVoo);
        }
    }

    public void cancelarReserva() {
        assentosDisponiveis++;
        System.out.println("Reserva cancelada. Um assento foi liberado no voo " + numeroVoo);
    }

    // GETTERS (MÉTODOS DE ACESSO)
    public String getNumeroVoo() {
        return numeroVoo;
    }

    public int getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    // MÉTODO ABSTRATO (PARA POLIMORFISMO)
    public abstract double calcularTaxaBagagem(int quantidadeMalas);
}

