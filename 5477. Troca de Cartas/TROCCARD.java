import java.util.Scanner;
import java.util.Arrays;

class TROCCARD{
	public static void main(String[] args) {
		int qtdAline, qtdBeatriz;
		int[] cartasAline;
		int[] cartasBeatriz;
		int[] aline;
		int[] beatriz;
		int qtdTrocaAline, qtdTrocaBeatriz;
		Scanner entrada = new Scanner(System.in);

		qtdAline = entrada.nextInt();
		qtdBeatriz = entrada.nextInt();

		while(qtdAline != 0 && qtdBeatriz != 0){
			aline = new int[qtdAline];
			beatriz = new int[qtdBeatriz];
			cartasAline = new int[100000];
			cartasBeatriz = new int[100000];
			qtdTrocaAline = 0;
			qtdTrocaBeatriz = 0;

			aline[0] = entrada.nextInt() - 1;
			cartasAline[aline[0]] = 1;
			for(int i = 1; i < qtdAline; i++){
				aline[i] = entrada.nextInt() - 1;
				if(aline[i] == aline[i-1]){
					i--;
					qtdAline--;
					continue;
				}
				cartasAline[aline[i]] = 1;
			}

			beatriz[0] = entrada.nextInt() - 1;
			cartasBeatriz[beatriz[0]] = 1;
			for(int i = 1; i < qtdBeatriz; i++){
				beatriz[i] = entrada.nextInt() - 1;
				if(beatriz[i] == beatriz[i-1]){
					i--;
					qtdBeatriz--;
					continue;
				}
				if(cartasAline[beatriz[i]] != 1 && beatriz[i] != beatriz[i-1]){
					qtdTrocaBeatriz++;
				}
				cartasBeatriz[beatriz[i]] = 1;
			}

			for(int i = 0; i < qtdAline; i++){
				if(cartasBeatriz[aline[i]] != 1){
					qtdTrocaAline++;
				}
			}

			if(qtdTrocaAline < qtdTrocaBeatriz)
				System.out.println(qtdTrocaAline);
			else
				System.out.println(qtdTrocaBeatriz);

			for(int i = 0; i < qtdAline; i++){
				cartasAline[aline[i]] = -1;
			}

			aline = null;
			beatriz = null;
			cartasAline = null;
			cartasBeatriz = null;

			qtdAline = entrada.nextInt();
			qtdBeatriz = entrada.nextInt();
		}
	}
}