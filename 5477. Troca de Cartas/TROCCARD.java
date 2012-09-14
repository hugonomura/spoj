import java.util.Scanner;
import java.util.Arrays;

class TROCCARD{
	public static void main(String[] args) {
		int qtdAline, qtdBeatriz;
		int[] cartasAline;
		int[] cartasBeatriz;
		int anterior;
		int qtdTrocaAline, qtdTrocaBeatriz;
		Scanner entrada = new Scanner(System.in);

		qtdAline = entrada.nextInt();
		qtdBeatriz = entrada.nextInt();
		while(qtdAline != 0 && qtdBeatriz != 0){
			cartasAline = new int[qtdAline];
			cartasBeatriz = new int[qtdBeatriz];
			
			cartasAline[0] = entrada.nextInt();
			anterior = cartasAline[0];
			for(int i = 1; i < qtdAline; i++){
				cartasAline[i] = entrada.nextInt();
				if(cartasAline[i] == anterior){
					i--;
					qtdAline--;
					continue;
				}
				anterior = cartasAline[i];
			}

			cartasBeatriz[0] = entrada.nextInt();
			anterior = cartasBeatriz[0];
			qtdTrocaBeatriz = 0;
			if(Arrays.binarySearch(cartasAline, anterior) < 0){
					qtdTrocaBeatriz++;
			}
			for(int i = 1; i < qtdBeatriz; i++){
				cartasBeatriz[i] = entrada.nextInt();
				if(cartasBeatriz[i] == anterior){
					i--;
					qtdBeatriz--;
					continue;
				}
				anterior = cartasBeatriz[i];
				if(Arrays.binarySearch(cartasAline, anterior) < 0){
					qtdTrocaBeatriz++;
				}
			}

			qtdTrocaAline = 0;
			for(int i = 0; i < qtdAline; i++){
				if(Arrays.binarySearch(cartasBeatriz, cartasAline[i]) < 0){
					qtdTrocaAline++;
				}
			}

			if(qtdTrocaAline < qtdTrocaBeatriz)
				System.out.println(qtdTrocaAline);
			else
				System.out.println(qtdTrocaBeatriz);

			cartasAline = null;
			cartasBeatriz = null;

			qtdAline = entrada.nextInt();
			qtdBeatriz = entrada.nextInt();
		}
	}
}