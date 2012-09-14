#include <stdio.h>

int main(){
	int t, n, i, acmPontos, maxPontos, pontos;
	
	scanf("%d", &t);
	scanf("%d", &n);
	while(n || t){
		maxPontos = n * 3;

		acmPontos = 0;
		for (i = 0; i < t; i++){
			scanf("%*s %d", &pontos);
			acmPontos += pontos;
		}
		printf ("%d\n", maxPontos - acmPontos);

		scanf("%d", &t);
		scanf("%d", &n);
	}
	return 0;
}           
