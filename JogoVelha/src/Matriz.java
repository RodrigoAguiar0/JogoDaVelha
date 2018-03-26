public class Matriz {
	
	public char[][] matriz;
	
	Matriz(){
		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++) {
				this.matriz[i][j] = 'f';
			}
		}
	}

	public char getMatriz(int linha, int coluna) {
		return matriz[linha][coluna];
	}

	public void setMatriz(int linha, int coluna, char avatar) {
		this.matriz[linha][coluna] = avatar;
	}
}