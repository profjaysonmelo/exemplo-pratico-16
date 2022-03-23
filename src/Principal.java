
public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Iniciando o exemplo de exceções...");
		
		int[] lista = new int[10];
		try {
			for(int i=0; i < 15; i++) {
				lista[i] = i;
				System.out.println("Posição: " + lista[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição a ser acessada não existe!");
		}
		
		System.out.println("Terminando o exemplo de exceções...");
		
	}
	
}
