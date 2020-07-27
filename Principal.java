


public class Principal {

	public static void main(String[] args) {
		try {
			new RoboGrafico(new Configuracao());
						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
