#include <stdio.h>

int main(){
	int nComprimentos, nRetangulos, nVaretas;
	int i;

	scanf("%d", &nComprimentos);
	while(nComprimentos > 0){
		nRetangulos = 0;

		for(i = 0; i < nComprimentos; i++){
			scanf("%*d %d", &nVaretas);
			nRetangulos += nVaretas / 2;
		}
		printf("%d\n", nRetangulos / 2);

		scanf("%d", &nComprimentos);
	}

	return 0;
}
