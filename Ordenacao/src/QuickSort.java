public class QuickSort {  
  
   
    public static void quicksort(int p, int q, int array[] ){  
        if (p < q){  
            int x = particao(p, q, array);  
            quicksort(p, x - 1, array);  
            quicksort(x + 1, q, array);  
        }  
    }  
  
    public static int particao(int p, int q, int array[] ){  
        int j = p - 1;  
        int aux = array[q];  
        for (int i = p; i <= q; i++){  
            if (array[i] <= aux){  
                troca(array, i, ++j);  
            }  
        }  
        return j;  
    } 
    
    public static void troca(int array [], int i, int j ){
        int aux = array [i];  
        array [i] = array [i];  
        array [j] = aux;  
    } 
}