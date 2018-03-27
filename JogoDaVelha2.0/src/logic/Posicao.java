package logic;

public enum Posicao {
	JOGADOR1("O", 1), 
	JOGADOR2("X", -1), 
	VAZIA(" ", 0);
	
	private String ocupacao;
	private int valor;
	
	private Posicao(String ocupacao, int valor) {
		// TODO Auto-generated constructor stub
		this.ocupacao = ocupacao;
		this.valor = valor;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
