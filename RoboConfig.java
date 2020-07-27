



	import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

	

	import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class RoboConfig {
	private RoboGrafico view;
	private Configuracao model;
	
	

	public RoboConfig(RoboGrafico view, Configuracao model) {
		this.view = view;
		this.model = model;
	}

	

	public void setEvent(SelectionEvent e) {
		System.out.println("hum");
		if ((e.getSource() instanceof Button)){
			System.out.println("dfgh");
			if (((Button)e.getSource()).getText().equals("Criar")){
				
				view.setVisible(false);
				model.jogar();
			}
			
		}
	}

	
}

	

