package sistema.apadrinhamento.usuarios.model;

import java.util.Date;

public class Apadrinhado extends Pessoa {
	
	private String naturalidade;
	private Date dataDeNascimento;
	private Date dataDeEntradaNaOrganizacao;
	private String nomeDoPai;
	private String nomeDaMae;
	private String descricao;
	private String img;
	private double valorRecebidoDeDoacoes;
	
	public Apadrinhado() {
		super();
	}
	
	public Apadrinhado(String nome, String cpf, int idade, String naturalidade, Date dataDeNascimento,
			Date dataDeEntradaNaOrganizacao, String nomeDoPai, String nomeDaMae, String descricao, String img, double valorRecebidoDeDoacoes) {
		super(nome, cpf, idade);
		this.naturalidade = naturalidade;
		this.dataDeNascimento = dataDeNascimento;
		this.dataDeEntradaNaOrganizacao = dataDeEntradaNaOrganizacao;
		this.nomeDoPai = nomeDoPai;
		this.nomeDaMae = nomeDaMae;
		this.descricao = descricao;
		this.img = img;
		this.valorRecebidoDeDoacoes = valorRecebidoDeDoacoes;
	}
	
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public Date getDataDeEntradaNaOrganizacao() {
		return dataDeEntradaNaOrganizacao;
	}
	public void setDataDeEntradaNaOrganizacao(Date dataDeEntradaNaOrganizacao) {
		this.dataDeEntradaNaOrganizacao = dataDeEntradaNaOrganizacao;
	}
	public String getNomeDoPai() {
		return nomeDoPai;
	}
	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public double getValorRecebidoDeDoacoes() {
		return valorRecebidoDeDoacoes;
	}

	public void setValorRecebidoDeDoacoes(double valorRecebidoDeDoacoes) {
		this.valorRecebidoDeDoacoes = valorRecebidoDeDoacoes;
	}

	@Override
	public String toString() {
		return "Apadrinhado [naturalidade=" + naturalidade + ", dataDeNascimento=" + dataDeNascimento
				+ ", dataDeEntradaNaOrganizacao=" + dataDeEntradaNaOrganizacao + ", nomeDoPai=" + nomeDoPai
				+ ", nomeDaMae=" + nomeDaMae + ", descricao=" + descricao + ", img=" + img + ", valorRecebidoDeDoacoes="
				+ valorRecebidoDeDoacoes + "]";
	}
	
}
