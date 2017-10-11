
public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hap=0;
		int a;
		
		for(a = 500; a <= 1000; a=a+2){
			hap += a;
		}
		System.out.printf("500에서 1000까지의 홀수의 합 : %d", hap);
	}

}
