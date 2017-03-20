public class Imprime implements Runnable {
    private int id;
	public void run() {
		for (int i = 1; i < 1000; ++i) {
			System.out.println("Programa "+id+" Valor: "+  i);
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
