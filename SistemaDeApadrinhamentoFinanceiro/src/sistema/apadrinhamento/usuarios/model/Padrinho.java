package sistema.apadrinhamento.usuarios.model;

public abstract class Padrinho extends Pessoa{
	
	private double valorMensalDoado;
	private int numeroDeCriancasApadrinhadas;
	
	public void solicitaApadrinhamento() {
	
	}
	
	public abstract double doaValor(double valor);
		
	public abstract void verificaInvestimentoDaDoacao();

}
