package Ejercicio1;

public class ElBuenThread extends Thread{
	
	public ElBuenThread() {
		
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Utilizando Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Termina el Thread");
	}

}
