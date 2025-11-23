// Arquivo: VooInternacional.java
package br.com.aeroporto;

public class VooInternacional extends Voo {
    private String terminal;

    public VooInternacional(String numeroVoo, String origem, String destino, int capacidadeTotal, String terminal) {
        super(numeroVoo, origem, destino, capacidadeTotal);
        this.terminal = terminal;
    }

    public boolean checkin(Passageiro passageiro) {
        if (passageiro.getPassaporte() != null && !passageiro.getPassaporte().isEmpty()) {
            System.out.println("Check-in realizado para " + passageiro.getNome() + ". Dirija-se ao terminal: " + this.terminal);
            return true;
        } else {
            System.out.println("Falha no check-in: Passaporte é obrigatório para voos internacionais.");
            return false;
        }
    }

    @Override
    public double calcularTaxaBagagem(int quantidadeMalas) {
        // Taxa de $ 60.00 (dólares) por mala em voo internacional
        return quantidadeMalas * 60.0;
    }

    public String getTerminal() {
        return terminal;
    }
}

