

import java.util.ArrayList;

public class Configuracao {

private ArrayList<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void dettach(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyAllObservers(){
		for (Observer o : observers){
			o.update();
		}
	}

	public void jogar() {
		new Word(this);		
	}
	
}
