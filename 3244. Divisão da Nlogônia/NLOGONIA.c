#include <stdio.h>

typedef struct p{
	int x, y;
}Ponto;

int main(){
	int qtdEntradas, i;
	Ponto divisa, residencia;

	scanf("%d", &qtdEntradas);
	while(qtdEntradas){
		scanf("%d %d", &divisa.x, &divisa.y);
		for(i = 0; i < qtdEntradas; i++){
			scanf("%d %d", &residencia.x, &residencia.y);
			if(residencia.x == divisa.x || residencia.y == divisa.y){
				printf("divisa\n");
				continue;
			}
			if(residencia.y > divisa.y){
				printf("N");
			}else{
				printf("S");
			}
			if(residencia.x > divisa.x){
				printf("E\n");
			}else{
				printf("O\n");
			}

		}

		scanf("%d", &qtdEntradas);
	}

	return 0;
}