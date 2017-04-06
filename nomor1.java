import java.util.Scanner;
public class nomor1{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan jumlah deret fibonaci : ");
		int n = input.nextInt();
		
		int awal=1;
		System.out.print(awal+" "+awal+" ");
		int fib1=awal;
		int fib2=awal;
		int fibFinal = awal;
		for(int i=3; i<=n; i++){
			fibFinal = fib1+fib2;
			fib1=fib2;
			fib2=fibFinal;
			System.out.print(fibFinal+" ");
		}
		
	}
}