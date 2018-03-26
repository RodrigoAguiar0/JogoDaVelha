
public class Jogo {
	
	private Jogador jogador1, jogador2;
	Matriz matriz;
	
	Jogo(char avatar1, char avatar2){
		this.jogador1 = new Jogador(avatar1);
		this.jogador2 = new Jogador(avatar2);
		matriz = new Matriz();
	}
	
	public boolean marcar(int linha, int coluna, Jogador jogador){
		if(matriz.getMatriz(linha, coluna) == ('f')){
			matriz.setMatriz(linha, coluna, jogador.getAvatar());
			return true;
		}else{
			return false;
		}
	}
	
	
}
