import org.eclipse.jface.text.link.LinkedModeUI.ExitFlags;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Decorations;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.wb.swt.SWTResourceManager;


public class RoboGrafico {

	
	
	protected Shell shell;
	private Text nomeRobo;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	/**
	 * Launch the application.
	 * @param args
	 */
	
	private Configuracao model;
	private RoboConfig controller;

	public RoboGrafico(Configuracao model) {
		this.model=model;
		controller = new RoboConfig(this, model);
		open();
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
		shell.setImage(SWTResourceManager.getImage(RoboGrafico.class, "/icons/progress/ani/4.png"));
		shell.setSize(541, 380);
		shell.setText("Robo");
		
		nomeRobo = new Text(shell, SWT.BORDER);
		nomeRobo.setBounds(366, 56, 127, 21);
		
		Label lblNomeRobo = new Label(shell, SWT.NONE);
		lblNomeRobo.setBounds(366, 35, 127, 15);
		lblNomeRobo.setText("Nome do Rob\u00F4");
		
		Label lblSexoRobo = new Label(shell, SWT.NONE);
		lblSexoRobo.setBounds(366, 83, 127, 15);
		lblSexoRobo.setText("Sexo do Rob\u00F4");
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setItems(new String[] {"Masculino", "Feminino"});
		combo.setBounds(366, 104, 127, 23);
		
		Label lblTamanhoMundo = new Label(shell, SWT.NONE);
		lblTamanhoMundo.setBounds(10, 35, 109, 15);
		lblTamanhoMundo.setText("Tamanho do Mundo");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(10, 56, 127, 21);
		
		Button btnCriar = new Button(shell, SWT.NONE);
		btnCriar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				controller.setEvent(e);
			}
		});
		btnCriar.setBounds(267, 308, 75, 25);
		btnCriar.setText("Criar");
		
		Label lblLifeRobo = new Label(shell, SWT.NONE);
		lblLifeRobo.setBounds(366, 133, 67, 15);
		lblLifeRobo.setText("Life do Rob\u00F4");
		
		Combo combo_1 = new Combo(shell, SWT.NONE);
		combo_1.setItems(new String[] {"50", "100", "150", "200"});
		combo_1.setBounds(366, 152, 127, 23);
		
		Button btnCancelar = new Button(shell, SWT.NONE);
		btnCancelar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				limparMundo();
			}
		});
		btnCancelar.setBounds(348, 308, 75, 25);
		btnCancelar.setText("Cancelar");
		
		Label lblQuantidadesDeComidas = new Label(shell, SWT.NONE);
		lblQuantidadesDeComidas.setBounds(10, 83, 183, 15);
		lblQuantidadesDeComidas.setText("Quantidades de comidas na matriz");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(10, 104, 127, 21);
		
		Label lblQuantidadeDeArmas = new Label(shell, SWT.NONE);
		lblQuantidadeDeArmas.setBounds(10, 131, 183, 15);
		lblQuantidadeDeArmas.setText("Quantidade de armas na matriz");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(10, 152, 127, 21);
		
		Label lblQuantidadeDeBaterias = new Label(shell, SWT.NONE);
		lblQuantidadeDeBaterias.setBounds(10, 177, 183, 15);
		lblQuantidadeDeBaterias.setText("Quantidade de baterias na matriz");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(10, 195, 127, 21);
		
		Button btnSair = new Button(shell, SWT.NONE);
		btnSair.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(428, 308, 75, 25);
		btnSair.setText("Sair");
		
		Label lblEnergiaDaBateria = new Label(shell, SWT.NONE);
		lblEnergiaDaBateria.setBounds(365, 177, 150, 15);
		lblEnergiaDaBateria.setText("Energia da bateria do Rob\u00F4");
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(366, 195, 127, 21);
	
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents1() {
		shell = new Shell();
		shell.setSize(541, 459);
		shell.setText("SWT Application");
		
		nomeRobo = new Text(shell, SWT.BORDER);
		nomeRobo.setBounds(366, 56, 127, 21);
		
		Label lblNomeRobo = new Label(shell, SWT.NONE);
		lblNomeRobo.setBounds(366, 35, 127, 15);
		lblNomeRobo.setText("Nome do Rob\u00F4");
		
		Label lblSexoRobo = new Label(shell, SWT.NONE);
		lblSexoRobo.setBounds(366, 83, 127, 15);
		lblSexoRobo.setText("Sexo do Rob\u00F4");
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setItems(new String[] {"Masculino", "Feminino"});
		combo.setBounds(366, 104, 127, 23);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 35, 109, 15);
		lblNewLabel.setText("Tamanho do Mundo");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(10, 56, 127, 21);
		
		Button btnCriar = new Button(shell, SWT.NONE);
		btnCriar.setBounds(267, 351, 75, 25);
		btnCriar.setText("Criar ");
		
		Label lblLifeRobo = new Label(shell, SWT.NONE);
		lblLifeRobo.setBounds(366, 133, 67, 15);
		lblLifeRobo.setText("Life do Rob\u00F4");
		
		Combo combo_1 = new Combo(shell, SWT.NONE);
		combo_1.setItems(new String[] {"50", "100", "150", "200"});
		combo_1.setBounds(366, 154, 127, 23);
		
		Button btnCancelar = new Button(shell, SWT.NONE);
		btnCancelar.setBounds(348, 351, 75, 25);
		btnCancelar.setText("Cancelar");
		
		Label lblQuantidadesDeComidas = new Label(shell, SWT.NONE);
		lblQuantidadesDeComidas.setBounds(10, 83, 183, 15);
		lblQuantidadesDeComidas.setText("Quantidades de comidas na matriz");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(10, 104, 127, 21);
		
		Label lblQuantidadeDeArmas = new Label(shell, SWT.NONE);
		lblQuantidadeDeArmas.setBounds(10, 131, 183, 15);
		lblQuantidadeDeArmas.setText("Quantidade de armas na matriz");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(10, 152, 127, 21);
		
		Label lblQuantidadeDeBaterias = new Label(shell, SWT.NONE);
		lblQuantidadeDeBaterias.setBounds(10, 177, 183, 15);
		lblQuantidadeDeBaterias.setText("Quantidade de baterias na matriz");
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(10, 195, 127, 21);
		
		Button btnSair = new Button(shell, SWT.NONE);
		btnSair.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnSair.setBounds(429, 351, 75, 25);
		btnSair.setText("Sair");
		
		Label lblEnergiaDaBateria = new Label(shell, SWT.NONE);
		lblEnergiaDaBateria.setBounds(365, 177, 150, 15);
		lblEnergiaDaBateria.setText("Energia da bateria do Rob\u00F4");
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(366, 195, 127, 21);

	}


	public void setVisible(boolean b) {
		shell.setVisible(b);
		System.out.println("try");
	}





	public void limparMundo() {
		
	
		nomeRobo.setText("");
		text_1.setText("");
		text_2.setText("");
		text_4.setText("");
		text_3.setText("");
		//combo.setText("");
		text_5.setText("");
		//combo_1.setText("");
		
	}
}
