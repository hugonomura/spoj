import java.util.Scanner;

class VARETAS{
	public static void main(String[] args){
		int nComprimentos, nRetangulos;
		Scanner entrada = new Scanner(System.in);

		nComprimentos = entrada.nextInt();
		while(nComprimentos > 0){
			nRetangulos = 0;

			for(int i = 0; i < nComprimentos; i++){
				entrada.nextInt();
				nRetangulos += entrada.nextInt() / 2;
			}

			System.out.println(nRetangulos / 2);

			nComprimentos = entrada.nextInt();
		}
	}
}