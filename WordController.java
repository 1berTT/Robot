import javax.swing.JOptionPane;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionEvent;

import primeiro.Bateria;
import primeiro.Robo;
import primeiro.SemEnergiaException;

public class WordController {

	Configuracao model;
	Word view;
	
	Robo tt = new Robo();
	
	public void setaRobo(){
		
		Bateria bateria = new Bateria("Duracell", 3, 3);
		tt.setBateriaPrincipal(bateria);
	}
	
	public WordController(Word view, Configuracao model) {
		this.model = model;
		this.view = view;
	}

	public void setEvent(SelectionEvent e) {
		
		if (((Button)e.getSource()).getText().equals("Anda Frente")){
			view.andaFrente();
		}else if(((Button)e.getSource()).getText().equals("Gira Direita")){
			try {
				tt.giraDireita();
			} catch (SemEnergiaException e1) {
				JOptionPane.showMessageDialog(null, "Sem energia.");
			}
		}
	}
	
	
}
