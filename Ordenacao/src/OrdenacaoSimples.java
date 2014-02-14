
public class OrdenacaoSimples {

	public long bubbleSort(int[] num) {
		
		long before = System.currentTimeMillis();
		for(int i=0; i < num.length; i++){
			for(int n:num){
				System.out.print(n+"-");				
			}
			System.out.println();
			for(int j=i+1; j < num.length; j++){
				if(num[i] > num[j]){
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;			
				}
			}
			
		}
		return System.currentTimeMillis() - before;
	}

	public long selectionSort(int[] num){
		long before = System.currentTimeMillis();
		int min;
		for(int i=0; i < (num.length - 1); i++){
			min = i;
			for(int j = i+1; j < num.length; j++){
				if(num[j] < num[min])
					min = j;
			}
			int tmp = num[min];
			num[min] = num[i];
			num[i] = tmp;
			
			for(int n:num){
				System.out.print(n+"-");				
			}
			System.out.println();
		}
		return System.currentTimeMillis() - before;

	}

	public long insertionSort(int[] num){
		long before = System.currentTimeMillis();
		int atual;
		for(int i = 1; i < num.length; i++){
			atual = num[i];
			int j = i;
			while ((j > 0) && (num[j-1] > atual)){
				num[j] = num[j-1];
				j = j-1;
				for(int n:num){
					System.out.print(n+"-");				
				}
				System.out.println();
			}
					
			num[j] = atual;
			
			for(int n:num){
				System.out.print(n+"-");				
			}
			System.out.println();
		}

		return System.currentTimeMillis() - before;
	}
	
	public void quicksort(int p, int q, int array[] ) {  
		if (p < q) {  
            int x = particao(p, q, array);  
            quicksort(p, x - 1, array);  
            quicksort(x + 1, q, array);  
        }	    
	}  
	  
	public int particao(int p, int q, int array[] ){  
	        int j = p - 1;  
	        int aux = array[q];  
	        for (int i = p; i <= q; i++) {  
	            if (array[i] <= aux){  
	                troca (array, i, ++j);  
	            }  
	        }  
	        return j;  
	} 
	 public void troca (int array [], int i, int j ) {  
	        int aux = array[i];  
	        array [i] = array [j];  
	        array [j] = aux;  
	 }  
	
}
