package sistema.apadrinhamento.usuarios.model;

public class CarteiraVirtual {
	
	private String nomeDoDono;
	private int codigo;
	private double saldo;
	
	public CarteiraVirtual() {
		super();
	}
	
	public CarteiraVirtual(String nomeDoDono, int codigo, double saldo) {
		super();
		this.nomeDoDono = nomeDoDono;
		this.codigo = codigo;
		this.saldo = saldo;
	}

	public String getNomeDoDono() {
		return nomeDoDono;
	}
	
	public void setNomeDoDono(String nomeDoDono) {
		this.nomeDoDono = nomeDoDono;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CarteiraVirtual [nomeDoDono=" + nomeDoDono + ", codigo=" + codigo + ", saldo=" + saldo + "]";
	}

}
