
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Iniciando o exemplo de exce��es...");
		
		int[] lista = new int[10];
		try {
			for(int i=0; i < 15; i++) {
				lista[i] = i;
				System.out.println("Posi��o: " + lista[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o a ser acessada n�o existe!");
		}
		
		System.out.println("Terminando o exemplo de exce��es...");
		
	}
	
}
