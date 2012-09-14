import java.util.Scanner;

class BAFO{
	public static void main(String[] args){
		int acmA, acmB, nRodadas, teste;
		Scanner entrada = new Scanner(System.in);

		nRodadas = entrada.nextInt();
		teste = 1;
		while(nRodadas > 0){
			acmA = 0;
			acmB = 0;
			
			for(int i = 0; i < nRodadas; i++){
				acmA += entrada.nextInt();
				acmB+= entrada.nextInt();
			}

			System.out.println("Teste " + teste);
			if(acmB > acmA)
				System.out.println("Beto\n");
			else
				System.out.println("Aldo\n");

			teste++;
			nRodadas = entrada.nextInt();

		}

	}
}
