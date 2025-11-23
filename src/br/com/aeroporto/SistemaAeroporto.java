// Arquivo: SistemaAeroporto.java
package br.com.aeroporto;

public class SistemaAeroporto {

    public static void main(String[] args) {
        // Criação das instâncias dos Voos (Nacional e Internacional)
        VooNacional vooNacional = new VooNacional("G3-1400", "São Paulo (GRU)", "Recife (REC)", 2, "A12");
        VooInternacional vooInternacional = new VooInternacional("TP-82", "Rio de Janeiro (GIG)", "Lisboa (LIS)", 150, "3");

        // 2. Criando Passageiros
        Passageiro passageiro1 = new Passageiro("João Monteiro", "111.222.333-44", "20.123.456-7", null); // Sem passaporte
        Passageiro passageiro2 = new Passageiro("Maria Jesus", "555.666.777-88", "30.789.123-4", "BR123456");
        Passageiro passageiro3 = new Passageiro("Sinval Custodio", "999.888.777-66", "40.456.789-0", null);

        System.out.println("### Início da Simulação Aérea ###\n");
        System.out.println("Voo " + vooNacional.getNumeroVoo() + " tem " + vooNacional.getAssentosDisponiveis() + " assentos disponíveis.");

        // 3. Simulação de reserva e emissão de passagem
        try {
            // Tentativa de  reservar para o primeiro passageiro
            vooNacional.reservarAssento();
            // Instanciando 
            Passagem passagem1 = new Passagem(passageiro1, vooNacional);
            passagem1.exibirDetalhes();
            vooNacional.checkin(passageiro1);

            // Tentar a reservar para o SEGUNDO passageiro
            vooNacional.reservarAssento();
            // Instanciando
            Passagem passagem2 = new Passagem(passageiro2, vooNacional);
            passagem2.exibirDetalhes();
            vooNacional.checkin(passageiro2);

            //  Testar a exceção de Voo Lotado
            System.out.println("\nTentando reservar assento para " + passageiro3.getNome() + " em voo lotado...");
            vooNacional.reservarAssento(); // Esta linha deve lançar a exceção

        } catch (VooLotadoException e) {
            System.err.println("ERRO: " + e.getMessage()); // Captura e trata a exceção
        }

        System.out.println("\nAssentos restantes no voo " + vooNacional.getNumeroVoo() + ": " + vooNacional.getAssentosDisponiveis());

        // Cancelamento de uma reserva:
        System.out.println("\nCancelando a reserva de " + passageiro1.getNome());
        vooNacional.cancelarReserva();
        System.out.println("Assentos restantes no voo " + vooNacional.getNumeroVoo() + ": " + vooNacional.getAssentosDisponiveis());

        // 6. Teste de POLIMORFISMO  com cálculo de bagagem
        System.out.println("\n---(Cálculo de Bagagem) ---");
        Voo voo1 = vooNacional;
        Voo voo2 = vooInternacional;
        
        // Calculo de 2 Malas.
        double taxaNacional = voo1.calcularTaxaBagagem(2); 
        double taxaInternacional = voo2.calcularTaxaBagagem(2); 

        System.out.println("Taxa para 2 malas no voo nacional é de: R$ " + String.format("%.2f", taxaNacional)+("  Reais"));
        System.out.println("Taxa para 2 malas no voo internacional é de: $ " + String.format("%.2f", taxaInternacional)+( "  Dólares"));

        System.out.println("\n### Simulação Finalizada com Sucesso! Obrigado e Volte sempre! ###");
    }
}
