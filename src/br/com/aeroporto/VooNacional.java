// Arquivo: VooNacional.java
package br.com.aeroporto;

public class VooNacional extends Voo {
    private String portaoEmbarque;

    public VooNacional(String numeroVoo, String origem, String destino, int capacidadeTotal, String portaoEmbarque) {
        super(numeroVoo, origem, destino, capacidadeTotal);
        this.portaoEmbarque = portaoEmbarque;
    }

    public boolean checkin(Passageiro passageiro) {
        if (passageiro.getRg() != null && !passageiro.getRg().isEmpty()) {
            System.out.println("Check-in realizado para " + passageiro.getNome() + ". Portão de embarque: " + this.portaoEmbarque);
            return true;
        } else {
            System.out.println("Falha no check-in: RG é obrigatório para voos nacionais.");
            return false;
        }
    }

    @Override
    public double calcularTaxaBagagem(int quantidadeMalas) {
        // Taxa de R$ 50.00 por mala em voo nacional
        return quantidadeMalas * 50.0;
    }

    public String getPortaoEmbarque() {
        return portaoEmbarque;
    }
}
