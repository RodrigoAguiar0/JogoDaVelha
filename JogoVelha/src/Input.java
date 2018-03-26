import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Input {

	protected Shell shell;
	public static Jogo jogo;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		jogo = new Jogo('X', 'O');
		try {
			Input window = new Input();
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
		shell.setSize(450, 533);
		shell.setText("SWT Application");
		
		CLabel label_0 = new CLabel(shell, SWT.NONE);
		label_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_0.setAlignment(SWT.CENTER);
		label_0.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_0.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_0.setBounds(101, 247, 70, 70);
		label_0.setText("0");
		
		CLabel label_1 = new CLabel(shell, SWT.NONE);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_1.setText("0");
		label_1.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_1.setAlignment(SWT.CENTER);
		label_1.setBounds(177, 247, 70, 70);
		
		CLabel label_2 = new CLabel(shell, SWT.NONE);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_2.setText("0");
		label_2.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_2.setAlignment(SWT.CENTER);
		label_2.setBounds(253, 247, 70, 70);
		
		CLabel label_3 = new CLabel(shell, SWT.NONE);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_3.setText("0");
		label_3.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_3.setAlignment(SWT.CENTER);
		label_3.setBounds(101, 323, 70, 70);
		
		CLabel label_4 = new CLabel(shell, SWT.NONE);
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_4.setText("0");
		label_4.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_4.setAlignment(SWT.CENTER);
		label_4.setBounds(177, 323, 70, 70);
		
		CLabel label_5 = new CLabel(shell, SWT.NONE);
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_5.setText("0");
		label_5.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_5.setAlignment(SWT.CENTER);
		label_5.setBounds(253, 323, 70, 70);
		
		CLabel label_6 = new CLabel(shell, SWT.NONE);
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_6.setText("0");
		label_6.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_6.setAlignment(SWT.CENTER);
		label_6.setBounds(101, 399, 70, 70);
		
		CLabel label_7 = new CLabel(shell, SWT.NONE);
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_7.setText("0");
		label_7.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_7.setAlignment(SWT.CENTER);
		label_7.setBounds(177, 399, 70, 70);
		
		CLabel label_8 = new CLabel(shell, SWT.NONE);
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
			}
		});
		label_8.setText("0");
		label_8.setFont(SWTResourceManager.getFont("Roboto Slab", 33, SWT.NORMAL));
		label_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		label_8.setAlignment(SWT.CENTER);
		label_8.setBounds(253, 399, 70, 70);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Roboto Slab", 24, SWT.NORMAL));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBounds(10, 10, 414, 53);
		lblNewLabel.setText("Super Jogo da Velha 2000");
		
		Label lblJogador_0 = new Label(shell, SWT.NONE);
		lblJogador_0.setFont(SWTResourceManager.getFont("Roboto Slab", 15, SWT.NORMAL));
		lblJogador_0.setAlignment(SWT.CENTER);
		lblJogador_0.setBounds(101, 106, 113, 35);
		lblJogador_0.setText("Jogador 1");
		
		CLabel lblX = new CLabel(shell, SWT.NONE);
		lblX.setAlignment(SWT.CENTER);
		lblX.setFont(SWTResourceManager.getFont("Roboto Slab", 15, SWT.NORMAL));
		lblX.setBounds(134, 147, 61, 21);
		lblX.setText("X");
		
		Label lblJogador_1 = new Label(shell, SWT.NONE);
		lblJogador_1.setText("Jogador 2");
		lblJogador_1.setFont(SWTResourceManager.getFont("Roboto Slab", 15, SWT.NORMAL));
		lblJogador_1.setAlignment(SWT.CENTER);
		lblJogador_1.setBounds(220, 106, 113, 35);
		
		CLabel label = new CLabel(shell, SWT.NONE);
		label.setText("0");
		label.setFont(SWTResourceManager.getFont("Roboto Slab", 15, SWT.NORMAL));
		label.setAlignment(SWT.CENTER);
		label.setBounds(253, 147, 61, 21);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(177, 199, 75, 25);
		btnNewButton.setText("Novo Jogo");

	}
}
