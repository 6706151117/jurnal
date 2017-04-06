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
		long arrFibFinal[] = new long[n];
		for(int i=3; i<=n; i++){
			fibFinal = fib1+fib2;
			fib1=fib2;
			fib2=fibFinal;
			arrFibFinal[i-3]=fibFinal;
		}
		for(int i=arrFibFinal.length; i>=0; i--){
			System.out.print(arrFibFinal[i]+" ");
		}
		
	}
}
