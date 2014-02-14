
public class Teste {
	
	
	public int[] ordenar(int vetor[]){
		
		
		
		int maiorN = 0;
		for(int i = 0; i< vetor.length; i++){
			if(vetor[i]>maiorN)
				maiorN = vetor[i];		
		}
				
		int vetorMaior[] = new int[maiorN+1];
		
		for(int i = 0;i<vetorMaior.length;i++){
			vetorMaior[i] = 0;
		}
		for(int i = 0;i< vetor.length;i++){
			int num = vetor[i];
			vetorMaior[num] = num;			
		}
		
		int [] vetorOrdenado = new int[vetor.length+1]; 
		for(int i=0;i<vetor.length+1;i++){
			int posAtual = 0;
			if(vetorMaior[i] == 0){
				
			}else{
				vetorOrdenado[i] = vetorMaior[i];				
			}
		}
				
		return vetorOrdenado;
		
	}
	

}
