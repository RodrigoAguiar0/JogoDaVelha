package view;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.wb.swt.SWTResourceManager;

import logic.JogoDaVelha;
import logic.Posicao;

import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Tabuleiro {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private static JogoDaVelha jogo;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			jogo = new JogoDaVelha();
			Tabuleiro window = new Tabuleiro();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(551, 453);
		shell.setText("SWT Application");
		
		// Inicio do Menu do jogo
		
		Label lblJogador1 = new Label(shell, SWT.NONE);
		lblJogador1.setFont(SWTResourceManager.getFont("Segoe UI", 24, SWT.NORMAL));
		lblJogador1.setBounds(10, 10, 190, 51);
		lblJogador1.setText("Jogador 1: O");
		
		Label lblJogador2 = new Label(shell, SWT.NONE);
		lblJogador2.setText("Jogador 2: X");
		lblJogador2.setFont(SWTResourceManager.getFont("Segoe UI", 24, SWT.NORMAL));
		lblJogador2.setBounds(335, 10, 190, 51);
		
		
		// Inicio do tabuleiro
		
		Composite table = formToolkit.createComposite(shell, SWT.NONE);
		table.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		table.setBounds(107, 73, 322, 322);
		formToolkit.paintBordersFor(table);
		
		CLabel lblPos0 = new CLabel(table, SWT.NONE);
		lblPos0.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos0.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(0, 0, Posicao.JOGADOR2);
						lblPos0.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(0, 0, Posicao.JOGADOR1);
						lblPos0.setText("O");
					}
				}
				
				int resultado = checaVitoria(0, 0);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve Empate");
					reiniciaJogo();
				}
			}
		});
		lblPos0.setAlignment(SWT.CENTER);
		lblPos0.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos0.setBounds(10, 10, 94, 94);
		lblPos0.setText(" ");
		
		CLabel lblPos1 = new CLabel(table, SWT.NONE);
		lblPos1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos1.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(0, 1, Posicao.JOGADOR2);
						lblPos1.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(0, 1, Posicao.JOGADOR1);
						lblPos1.setText("O");
					}
				}
				
				int resultado = checaVitoria(0, 1);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve empate");
					reiniciaJogo();
				}
			}
		});
		lblPos1.setText(" ");
		lblPos1.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos1.setAlignment(SWT.CENTER);
		lblPos1.setBounds(114, 10, 94, 94);
		formToolkit.adapt(lblPos1);
		formToolkit.paintBordersFor(lblPos1);
		
		CLabel lblPos2 = new CLabel(table, SWT.NONE);
		lblPos2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos2.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(0, 2, Posicao.JOGADOR2);
						lblPos2.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(0, 2, Posicao.JOGADOR1);
						lblPos2.setText("O");
					}
				}
				
				int resultado = checaVitoria(0, 2);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve empate");
					reiniciaJogo();
				}
			}
		});
		lblPos2.setText(" ");
		lblPos2.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos2.setAlignment(SWT.CENTER);
		lblPos2.setBounds(218, 10, 94, 94);
		formToolkit.adapt(lblPos2);
		formToolkit.paintBordersFor(lblPos2);
		
		CLabel lblPos3 = new CLabel(table, SWT.NONE);
		lblPos3.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos3.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(1, 0, Posicao.JOGADOR2);
						lblPos3.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(1, 0, Posicao.JOGADOR1);
						lblPos3.setText("O");
					}
				}
				
				int resultado = checaVitoria(1, 0);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve empate");
					reiniciaJogo();
				}
			}
		});
		lblPos3.setText(" ");
		lblPos3.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos3.setAlignment(SWT.CENTER);
		lblPos3.setBounds(10, 114, 94, 94);
		formToolkit.adapt(lblPos3);
		formToolkit.paintBordersFor(lblPos3);
		
		CLabel lblPos4 = new CLabel(table, SWT.NONE);
		lblPos4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos4.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(1, 1, Posicao.JOGADOR2);
						lblPos4.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(1, 1, Posicao.JOGADOR1);
						lblPos4.setText("O");
					}
				}
				
				int resultado = checaVitoria(1, 1);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve empate");
					reiniciaJogo();
				}
			}
		});
		lblPos4.setText(" ");
		lblPos4.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos4.setAlignment(SWT.CENTER);
		lblPos4.setBounds(114, 114, 94, 94);
		formToolkit.adapt(lblPos4);
		formToolkit.paintBordersFor(lblPos4);
		
		CLabel lblPos5 = new CLabel(table, SWT.NONE);
		lblPos5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos5.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(1, 2, Posicao.JOGADOR2);
						lblPos5.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(1, 2, Posicao.JOGADOR1);
						lblPos5.setText("O");
					}
				}
				
				int resultado = checaVitoria(1, 2);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve empate");
					reiniciaJogo();
				}
			}
		});
		lblPos5.setText(" ");
		lblPos5.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos5.setAlignment(SWT.CENTER);
		lblPos5.setBounds(218, 114, 94, 94);
		formToolkit.adapt(lblPos5);
		formToolkit.paintBordersFor(lblPos5);
		
		CLabel lblPos6 = new CLabel(table, SWT.NONE);
		lblPos6.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos6.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(2, 0, Posicao.JOGADOR2);
						lblPos6.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(2, 0, Posicao.JOGADOR1);
						lblPos6.setText("O");
					}
				}
				
				int resultado = checaVitoria(2, 0);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve empate");
					reiniciaJogo();
				}
			}
		});
		lblPos6.setText(" ");
		lblPos6.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos6.setAlignment(SWT.CENTER);
		lblPos6.setBounds(10, 218, 94, 94);
		formToolkit.adapt(lblPos6);
		formToolkit.paintBordersFor(lblPos6);
		
		CLabel lblPos7 = new CLabel(table, SWT.NONE);
		lblPos7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos7.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(2, 1, Posicao.JOGADOR2);
						lblPos7.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(2, 1, Posicao.JOGADOR1);
						lblPos7.setText("O");
					}
				}
				
				int resultado = checaVitoria(2, 1);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve empate");
					reiniciaJogo();
				}
			}
		});
		lblPos7.setText(" ");
		lblPos7.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos7.setAlignment(SWT.CENTER);
		lblPos7.setBounds(114, 218, 94, 94);
		formToolkit.adapt(lblPos7);
		formToolkit.paintBordersFor(lblPos7);
		
		CLabel lblPos8 = new CLabel(table, SWT.NONE);
		lblPos8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblPos8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (lblPos8.getText().equals(" ")){
					if(jogo.getJogadorVez() == 2) {
						jogo.setJogadorVez(1);
						jogo.setCasa(2, 2, Posicao.JOGADOR2);
						lblPos8.setText("X");
					} else {
						jogo.setJogadorVez(2);
						jogo.setCasa(2, 2, Posicao.JOGADOR1);
						lblPos8.setText("O");
					}
				}
				
				int resultado = checaVitoria(2, 2);
				if(resultado == 3) {
					//comandos de vitoria
					JOptionPane.showMessageDialog(null, "O jogador 2 perdeu");
					reiniciaJogo();
				} else if (resultado == -3) {
					JOptionPane.showMessageDialog(null, "O jogador 1 perdeu");
					reiniciaJogo();
				} else if (tabuleiroCheio()) {
					JOptionPane.showMessageDialog(null, "Houve empate");
					reiniciaJogo();
				}
			}
		});
		lblPos8.setText(" ");
		lblPos8.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblPos8.setAlignment(SWT.CENTER);
		lblPos8.setBounds(218, 218, 94, 94);
		formToolkit.adapt(lblPos8);
		formToolkit.paintBordersFor(lblPos8);


		Button btnReset = formToolkit.createButton(shell, "RECOME\u00C7AR", SWT.NONE);
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				for (int i = 0; i < jogo.getTabuleiro().length; i++) {
					for (int j = 0; j < jogo.getTabuleiro().length; j++) {
						jogo.setCasa(i, j, Posicao.VAZIA);
					}
				}
				
				lblPos0.setText(" ");
				lblPos1.setText(" ");
				lblPos2.setText(" ");
				lblPos3.setText(" ");
				lblPos6.setText(" ");
				lblPos8.setText(" ");
				lblPos4.setText(" ");
				lblPos5.setText(" ");
				lblPos7.setText(" ");
				
				jogo.setJogadorVez(1);
			}
		});
		btnReset.setBounds(223, 22, 82, 38);
	}
	
	public int checaVitoria(int x, int y) {
		int valorLinha = 0;
		int valorColuna = 0;
		if (Math.floorMod(y + x * jogo.getTabuleiro().length, 2) != 0) {
			// Posicoes laterais do tabuleiro
			
			for (int i = 0; i < jogo.getTabuleiro().length; i++) {
				valorColuna += jogo.getCasa(i, y).getValor();	
			}
			if (valorColuna == -3) return valorColuna;
			if (valorColuna == 3) return valorColuna;
			
			for (int j = 0; j < jogo.getTabuleiro().length; j++) {
				valorLinha += jogo.getCasa(x, j).getValor();
			}
			if (valorLinha == -3) return valorLinha;
			if (valorLinha == 3) return valorLinha;
			
		} else if (x == 2 && y == 2){
			// Posicao do meio do tabuleiro
			
			//Verificacao vertical
			for (int i = 0; i < jogo.getTabuleiro().length; i++) {
				valorColuna += jogo.getCasa(i, y).getValor();	
			}
			if (valorColuna == -3) return valorColuna;
			if (valorColuna == 3) return valorColuna;
			
			//Verificacao horizontal
			for (int j = 0; j < jogo.getTabuleiro().length; j++) {
				valorLinha += jogo.getCasa(x, j).getValor();
			}
			if (valorLinha == -3) return valorLinha;
			if (valorLinha == 3) return valorLinha;
			
			// Verificacao diagonal
			if (jogo.getCasa(0, 0).getValor() == jogo.getCasa(1, 1).getValor() && 
					jogo.getCasa(1, 1).getValor() == jogo.getCasa(2, 2).getValor()) {
				
				if (jogo.getCasa(0, 0).getValor() == 1) return 3;
				if (jogo.getCasa(0, 0).getValor() == -1) return -3;
			}
			
			if(jogo.getCasa(0, 2).getValor() == jogo.getCasa(1, 1).getValor() && 
					jogo.getCasa(1, 1).getValor() == jogo.getCasa(2, 0).getValor()) {
				
				if(jogo.getCasa(1, 1).getValor() == 1) return 3;
				if(jogo.getCasa(1, 1).getValor() == -1) return -3;
			}
		} else {
			// Posicoes dos cantos do tabuleiro
			
			//Verificacao vertical
			for (int i = 0; i < jogo.getTabuleiro().length; i++) {
				valorColuna += jogo.getCasa(i, y).getValor();	
			}
			if (valorColuna == -3) return valorColuna;
			if (valorColuna == 3) return valorColuna;
			
			//Verificacao horizontal
			for (int j = 0; j < jogo.getTabuleiro().length; j++) {
				valorLinha += jogo.getCasa(x, j).getValor();
			}
			if (valorLinha == -3) return valorLinha;
			if (valorLinha == 3) return valorLinha;
			
			if(x == y) {
				if (jogo.getCasa(0, 0).getValor() == jogo.getCasa(1, 1).getValor() && 
						jogo.getCasa(1, 1).getValor() == jogo.getCasa(2, 2).getValor()) {
					
					if (jogo.getCasa(0, 0).getValor() == 1) return 3;
					if (jogo.getCasa(0, 0).getValor() == -1) return -3;
				}
			} else {
				if(jogo.getCasa(0, 2).getValor() == jogo.getCasa(1, 1).getValor() && 
						jogo.getCasa(1, 1).getValor() == jogo.getCasa(2, 0).getValor()) {
					
					if(jogo.getCasa(1, 1).getValor() == 1) return 3;
					if(jogo.getCasa(1, 1).getValor() == -1) return -3;
				}
			}
		}
		return 0;
	}
	
	public boolean tabuleiroCheio() {
		for (int i = 0; i < jogo.getTabuleiro().length; i++) {
			for (int j = 0; j < jogo.getTabuleiro().length; j++) {
				if(jogo.getCasa(i, j).getValor() == 0) return false;
			}
		}
		return true;
	}
	
	public void reiniciaJogo() {
		for (int i = 0; i < jogo.getTabuleiro().length; i++) {
			for (int j = 0; j < jogo.getTabuleiro().length; j++) {
				jogo.setCasa(i, j, Posicao.VAZIA);
			}
		}
		jogo.setJogadorVez(1);
		
		shell.dispose();;
		open();
	}
}
