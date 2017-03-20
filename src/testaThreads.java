
public class testaThreads {

	public static void main(String[] args) throws InterruptedException {
		
	Imprime imp	= new Imprime();
	imp.setId(1);
	
	Thread t1 = new Thread(imp);
	t1.start();
	
	
	Imprime imp2 = new Imprime();
	imp.setId(2);
	
	Thread t2 = new Thread(imp2);
	t2.start();
	}
	
    
}
