

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;

import primeiro.Robo;


public class RoboController {
	private Robo robo;
	private RoboGrafico view;
	private Configuracao model;
	
	public RoboController(RoboGrafico roboConfig, Configuracao model) {
		this.view = roboConfig;
		this.model = model;
	}

	public void setEvent(SelectionEvent e) {
		if ((e.getSource() instanceof Button)){
			Button b=(Button)e.getSource();
			if (b.getText().equals("Criar")){
				view.setVisible(false);
				
				model.jogar();
			} else {
				if (((Button)e.getSource()).getText().equals("Cancelar")){
					view.limparMundo();
				}
		}
			
		}
	}
	
}
