

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;

public class JTabuleiro {

	protected Shell shell;
	private Configuracao model;
	private JTabuleiroController controller;
	private Label robot;
	
	public JTabuleiro(Configuracao model){
		this.model = model;
		this.controller = new JTabuleiroController(this, model);
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		robot = new Label(shell, SWT.NONE);
		robot.setImage(SWTResourceManager.getImage("C:\\Users\\marco\\Pictures\\robot-small.png"));
		robot.setBounds(10, 10, 50, 50);
		
		Button btnAndaFrente = new Button(shell, SWT.NONE);
		btnAndaFrente.setBounds(10, 205, 75, 25);
		btnAndaFrente.setText("Anda Frente");
		
		SelectionAdapter sa = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				controller.setEvent(e);
			}
		};

		btnAndaFrente.addSelectionListener(sa);
		
	}

	public void andaFrente() {
		robot.setBounds(robot.getBounds().x+50, robot.getBounds().y, 50, 50);
		
	}
	
}
