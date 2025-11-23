// Arquivo: Passagem.java
package br.com.aeroporto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Passagem {
    private static int contadorId = 1000; // Simula um gerador de ID
    private int idPassagem;
    private Passageiro passageiro;
    private Voo voo;
    private String dataHoraEmissao;

    public Passagem(Passageiro passageiro, Voo voo) {
        this.idPassagem = contadorId++;
        this.passageiro = passageiro;
        this.voo = voo;
        // Formata a data e hora atuais
        this.dataHoraEmissao = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public void exibirDetalhes() {
        System.out.println("\n--- Detalhes da Passagem (Eticket) ---");
        System.out.println("ID da Passagem: " + idPassagem);
        System.out.println("Passageiro: " + passageiro.getNome());
        System.out.println("Voo: " + voo.getNumeroVoo());
        System.out.println("Origem: " + voo.getOrigem() + " -> Destino: " + voo.getDestino());
        System.out.println("Emitida em: " + dataHoraEmissao);
        System.out.println("-------------------------------------\n");
    }

    // Getters
    public int getIdPassagem() {
        return idPassagem;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Voo getVoo() {
        return voo;
    }
}
