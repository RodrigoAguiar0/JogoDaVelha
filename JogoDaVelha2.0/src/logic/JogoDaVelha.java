package logic;

public class JogoDaVelha {
	private Posicao[][] tabuleiro;
	private int jogadorVez;

	public JogoDaVelha() {
		super();
		this.tabuleiro = new Posicao[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.tabuleiro[i][j] = Posicao.VAZIA;
			}
		}
		
		this.jogadorVez = 1;
	}
	
	public Posicao getCasa(int i, int j) {
		Posicao posicao = this.tabuleiro[i][j];
		
		return posicao;
	}
	
	public void setCasa(int i, int j, Posicao posicao) {
		this.tabuleiro[i][j] = posicao;
	}

	public Posicao[][] getTabuleiro() {
		return tabuleiro;
	}

	public int getJogadorVez() {
		return jogadorVez;
	}

	public void setJogadorVez(int jogadorVez) {
		this.jogadorVez = jogadorVez;
	}
}
