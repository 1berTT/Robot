

import javax.swing.JOptionPane;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Word {


	/**
	 * Launch the application.
	 * @param args
	 */
	
	protected Shell shell;
	private Configuracao model;
	private WordController controller;
	private Label robot;
	
	public Word(Configuracao model){
		this.model = model;
		this.controller = new WordController(this, model);
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
		shell.setSize(450, 749);
		shell.setText("SWT Application");
		
		robot = new Label(shell, SWT.NONE);
		robot.setImage(SWTResourceManager.getImage("C:\\Users\\Humberto\\Desktop\\Corinthians.ico.jpg"));
		robot.setBounds(10, 10, 44, 44);
		
		Button btnAndarFrente = new Button(shell, SWT.NONE);
		btnAndarFrente.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				controller.setEvent(e);
			}
		});
		btnAndarFrente.setBounds(94, 675, 75, 25);
		btnAndarFrente.setText("Anda Frente");
		
		Button btnGirarEsquerda = new Button(shell, SWT.NONE);
		btnGirarEsquerda.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnGirarEsquerda.setBounds(0, 675, 88, 25);
		btnGirarEsquerda.setText("Girar Esquerda");
		
		Button btnGirarDireita = new Button(shell, SWT.NONE);
		btnGirarDireita.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnGirarDireita.setBounds(175, 675, 75, 25);
		btnGirarDireita.setText("Girar Direita");

	}

	public void andaFrente() {
		if(robot.getBounds().x > 1300 || robot.getBounds().y > 1250){
			JOptionPane.showMessageDialog(null, "Dexa de ser barbeiro");
		}else{
			robot.setBounds(robot.getBounds().x+50, robot.getBounds().y, 50, 50);
		}
		
	}

	
}
