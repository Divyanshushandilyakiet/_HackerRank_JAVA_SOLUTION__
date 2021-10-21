//Fibonaaci series

public class Fib {
	public void fib(int n) {
		int a=0;
		int b=1;
		System.out.println(a+" "+"\n"+b);
		for(int i=3;i<=n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Fibi f=new Fib();
		f.fib(10);
	}
}
