public class Principal {
	
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElementos(lista, i)).start();
		}
		
		//Dormir por 2 segundos
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		 //imprimindo a lista
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " - " + lista.pegaElemento(i));
		}
	}
}
