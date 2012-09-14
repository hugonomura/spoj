import java.util.Scanner;
// import java.util.NoSuchElementException;

class COPA{

	public static void main(String[] args){
		int t, n, acmPontos, maxPontos, pontos;

		Scanner entrada = new Scanner(System.in);

		t = entrada.nextInt();
		n = entrada.nextInt();

		while(t != 0 || n != 0){
			maxPontos = n * 3;

			acmPontos = 0;
			entrada.nextLine();
			for(int i = 0; i < t; i++){
				acmPontos += Integer.parseInt(entrada.nextLine().split(" ")[1]);
			}
			System.out.println(maxPontos - acmPontos);
			t = entrada.nextInt();
			n = entrada.nextInt();
		}
		entrada.close();

	}
}