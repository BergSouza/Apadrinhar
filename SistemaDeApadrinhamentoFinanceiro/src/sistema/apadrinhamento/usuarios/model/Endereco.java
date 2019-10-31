package sistema.apadrinhamento.usuarios.model;

public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco(String logradouro, String bairro, String cep, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}
	
	
	

}
