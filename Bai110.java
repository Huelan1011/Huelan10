package day2;

public class Bai110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0,b = 0;
		int total = 200000;
		for(a = 0;a <= total / 1000;a++) {
			for(b = 0;b <= total / 2000;b++) {
				if((200000-(a*1000+b*2000))%5000 == 0 && 200000>=(a*1000+b*2000)) {
					System.out.println( a+"\t" + b +"\t" + (total-(a*1000+b*2000))/5000);
				} 
			
			}
			
		}
		

	}

}
