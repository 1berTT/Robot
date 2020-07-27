

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;


public class JTabuleiroController {

	Configuracao model;
	JTabuleiro view;
	
	public JTabuleiroController(JTabuleiro view, Configuracao model) {
		this.model = model;
		this.view = view;
	}

	public void setEvent(SelectionEvent e) {
		if (((Button)e.getSource()).getText().equals("Anda Frente")){
			view.andaFrente();
		}else if (((Button)e.getSource()).getText().equals("Girar direita")){
			
		}else if (((Button)e.getSource()).getText().equals("Girar Esquerda")){
			
		}
	}
	
}
