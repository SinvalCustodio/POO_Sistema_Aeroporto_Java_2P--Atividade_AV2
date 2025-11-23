# Sistema de Gerenciamento de Aeroporto em Java (POO)

## 📖 Sobre o Projeto

Este projeto é uma simulação de um sistema de gerenciamento de aeroporto, desenvolvido em Java como um exercício prático e avaliativo, visando aplicar os conceitos fundamentais da **Programação Orientada a Objetos (POO)**.

Este sistema modela entidades como `Voo`, `Passageiro` e `Passagem`, permitindo realizar operações como reserva de assentos, check-in, cancelamento de reservas e cálculo de taxas, além de tratar situações de erro, como um voo lotado.

## ✨ Pilares da Programação Orientada a Objetos Aplicados

O projeto foi estruturado para demonstrar a aplicação dos 4 pilares da POO:

1.**Abstração:** A classe `Voo` é abstrata e representa o conceito genérico de um voo, definindo atributos e comportamentos comuns a qualquer tipo de voo, sem se prender a detalhes específicos.

2.**Encapsulamento:** Todos os atributos das classes são privados (`private`), e o acesso a eles é controlado por meio de métodos públicos (`getters` e `setters`). Isso protege a integridade dos dados e garante que o estado dos objetos seja sempre consistente.

3.**Herança:** As classes `VooNacional` e `VooInternacional` herdam da superclasse `Voo`. Elas reutilizam código e adicionam funcionalidades específicas, como regras de check-in e portões de embarque distintos.

4.**Polimorfismo:** O método `calcularTaxaBagagem()` é sobrescrito (`@Override`) nas subclasses `VooNacional` e `VooInternacional`. Isso permite que um mesmo método tenha comportamentos distintos dependendo do tipo real do objeto (`Voo`) denominada a classe (Pai), aplicando taxas distintas para cada modalidade de voo.

## 🛠️ Funcionalidades Implementadas

-**Criação de Voos:** Distinção entre voos nacionais e internacionais.
-**Gerenciamento de Passageiros:** Cadastro de passageiros com seus documentos.
-**Reserva de Assentos:** Método para reservar um assento, decrementando o total disponível.
-**Cancelamento de Reserva:** Libera um assento previamente reservado.
-**Emissão de Passagem:** Classe `Passagem` que conecta um `Passageiro` a um `Voo`.
-**Check-in:** Validação de documentos (RG para voos nacionais e Passaporte para internacionais).
-**Tratamento de Exceções:**
    -   Uso de `try-catch` para lidar com erros de forma controlada.
    -   Lançamento de uma exceção personalizada (`VooLotadoException`) quando não há mais assentos disponíveis.

## 📂 Estrutura do Projeto

O código-fonte está organizado na seguinte estrutura de pacotes:

''''
Ex:1
sistema-aeroporto-java/
│
├── .gitignore          # Arquivo para ignorar arquivos da IDE (muito importante!)
├── README.md           # A documentação do projeto que vou criar abaixo.
│
└── src/                # Pasta principal para todo o seu código-fonte.
    └── main/           # Código principal da aplicação.
        └── java/       # Onde os pacotes Java ficam.
            └── br/
                └── com/
                    └── aeroporto/
                        ├── Passageiro.java
                        ├── Passagem.java
                        ├── SistemaAeroporto.java
                        ├── Voo.java
                        ├── VooInternacional.java
                        ├── VooNacional.java
                        └── VooLotadoException.java

''''
Ex:2
src/main/java/
└── br/com/aeroporto/
    ├── Passageiro.java         // Modela o passageiro.
    ├── Passagem.java           // Modela a passagem (eticket).
    ├── SistemaAeroporto.java   // Classe principal para execução (main).
    ├── Voo.java                // Superclasse abstrata.
    ├── VooInternacional.java   // Subclasse para voos internacionais.
    ├── VooNacional.java        // Subclasse para voos nacionais.
    └── VooLotadoException.java // Exceção personalizada.
''''

## 🚀 Como Executar

    1.**Clone o repositório:**
    ```bash
    git clone https://github.com/SinvalCustodio/POO_Sistema_Aeroporto_Java_2P--Atividade_AV2
    ```
    2.**Abra em sua IDE:**
    -   Importe o projeto em sua IDE Java favorita (Eclipse, IntelliJ IDEA, etc. ).
    -   A IDE deverá reconhecer a estrutura do projeto automaticamente.
    3.**Execute a classe principal:**
    -   Encontre o arquivo `SistemaAeroporto.java`.
    -   Execute o método `main()` para iniciar a simulação.
    -   O resultado da execução será exibido no console.

''''
*Projeto desenvolvido como parte de estudos em Programação Orientada a Objetos com Java no segundo periodo.*
