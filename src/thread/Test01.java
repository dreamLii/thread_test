package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		int i = -1;
		for (i = 0; i < 5; i++) {
			Runnable runn = new Runnable() {
				public void run() {
					System.out.println("我是线程");	
				}
			};
			threadPool.execute(runn);
		}
	}
	
}
