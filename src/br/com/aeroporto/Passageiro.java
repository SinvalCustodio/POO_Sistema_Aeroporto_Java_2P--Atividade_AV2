package br.com.aeroporto;

		public class Passageiro {
			// Classe: Passageiro
		
	    private String nome;
	    private String cpf;
	    private String rg;
	    private String passaporte;

	    public Passageiro(String nome, String cpf, String rg, String passaporte) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.rg = rg;
	        this.passaporte = passaporte;
	    }

	    // Getters e Setters
	    public String getNome() {
	        return nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public String getRg() {
	        return rg;
	    }

	    public String getPassaporte() {
	        return passaporte;
	    }

	    @Override
	    public String toString() {
	        return "Passageiro{" +
	                "nome='" + nome + '\'' +
	                ", cpf='" + cpf + '\'' +
	                '}';
	    }
	}



