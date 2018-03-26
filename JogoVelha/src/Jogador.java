
public class Jogador {

	private char avatar;
	private int vitoria;
	
	Jogador(char avatar){
		this.avatar = avatar;
	}

	public char getAvatar() {
		return avatar;
	}
	
	public int getVitoria(){
		return vitoria;
	}
	
	public void vencerJogo(){
		this.vitoria++;
	}
}
