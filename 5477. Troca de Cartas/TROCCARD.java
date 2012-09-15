import java.util.Scanner;
import java.util.Arrays;

class TROCCARD{
	public static void main(String[] args) {
		int qtdAline, qtdBeatriz;
		int[] cartasAline = new int[100000];
		int[] cartasBeatriz = new int[100000];
		int[] aline;
		int qtdTrocaAline, qtdTrocaBeatriz;
		Scanner entrada = new Scanner(System.in);

		qtdAline = entrada.nextInt();
		qtdBeatriz = entrada.nextInt();
		while(qtdAline != 0 && qtdBeatriz != 0){
			aline = new int[qtdAline];
			qtdTrocaAline = 0;
			qtdTrocaBeatriz = 0;

			for(int i = 0; i < 100000; i++){
				cartasAline[i] = -1;
				cartasBeatriz[i] = -1;
			}

			aline[0] = entrada.nextInt() - 1;
			cartasAline[aline[0]]++;
			for(int i = 1; i < qtdAline; i++){
				aline[i] = entrada.nextInt() - 1;
				if(aline[i] == aline[i-1]){
					i--;
					qtdAline--;
					continue;
				}
				cartasAline[aline[i]]++;
			}

			int b = entrada.nextInt() - 1;
			for(int i = 1; i < qtdBeatriz; i++){
				int temp;
				temp = entrada.nextInt() - 1;
				if(cartasAline[temp] == -1 && temp != b){
					qtdTrocaBeatriz++;
					b = temp;
					continue;
				}
				cartasBeatriz[temp]++;
				b = temp;
			}

			for(int i = 0; i < qtdAline; i++){
				if(cartasBeatriz[aline[i]] == -1){
					qtdTrocaAline++;
				}
			}

			if(qtdTrocaAline < qtdTrocaBeatriz)
				System.out.println(qtdTrocaAline);
			else
				System.out.println(qtdTrocaBeatriz);

			aline = null;

			qtdAline = entrada.nextInt();
			qtdBeatriz = entrada.nextInt();
		}
	}
}