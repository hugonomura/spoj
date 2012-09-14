import java.util.Scanner;
import java.*;


class NEFER{
	public static void main(String args[]){
		int nInstancias, n, k;
		Scanner entrada = new Scanner(System.in);

		nInstancias = entrada.nextInt();

		for(int i = 0; i < nInstancias; i++){
			n = entrada.nextInt();
			k = entrada.nextInt();

			System.out.println("" + resultado(n, k) * k);

		}
	}

	private static long resultado(int n, int k){
		long result;
		// for(int i = 1; i <= n; i++){
		// 	if(fatorial(n) - i <= k)
		// 		result++;
		// }
		result = fatorial(n) / (fatorial(k) * fatorial(n - k));
		return result;
	}

	private static long fatorial(int n){
		long fatorial = 1;
		
		for(int i = n; i > 1; i--){
			fatorial *= i;
		}
		// System.out.println(n + "-" + fatorial);
		return fatorial;
	}
}
