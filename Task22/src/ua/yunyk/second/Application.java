package ua.yunyk.second;

import java.util.Random;

interface Coin {
	public void throwUp();
}

public class Application {

	public static void main(String[] args) {
		
		Coin coin = ()->{
			Random r = new Random();
			int i = r.nextInt(2);
			
			if( i == 0) 
				System.out.println("Орел");
			else 
				System.out.println("Решка");
		};
		
		coin.throwUp();
		
	}
	
}
