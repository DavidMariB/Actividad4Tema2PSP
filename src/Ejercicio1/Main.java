package Ejercicio1;

public class Main{
	
	public static void main(String[] args) {
		llamaRunnable();
		llamaThread();
	}
	
	public static void llamaThread() {
		//Metodo utilizando la clase Thread
		ElBuenThread mt = new ElBuenThread();
		mt.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteracion desde el main");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			mt.join();
			System.out.println("Termina el Main");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void llamaRunnable() {
		//Metodo utilizando la clase Runnable
		new ElBuenRunnable();
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteracion desde el main");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
