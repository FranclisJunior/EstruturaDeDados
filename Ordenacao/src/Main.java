
public class Main {


	
	public static void main(String[] args) {
		int [] num1 = {10,5,12,2,3,6};
		int [] num2 = {10,5,12,2,3,6};
		int [] num3 = {10,5,12,2,3,6};
		int [] num4 = {3, 41, 52, 26, 38, 57, 9, 49};
		OrdenacaoSimples orden = new OrdenacaoSimples();
		
		System.out.println("Tempo no BubbleSort: " +orden.bubbleSort(num1));		
		System.out.println("Tempo no SelectionSort: " +orden.selectionSort(num2));
		System.out.println("Tempo no InsertionSort: " +orden.insertionSort(num3));
		

		QuickSort qs = new QuickSort();		
		long tInicial = System.currentTimeMillis();   
        qs.quicksort(1, num4.length-1, num4);    
        long tTotal = tInicial - System.currentTimeMillis(); ;  
        System.out.println("Tempo no QuickSort: "+ tTotal );
		
	}

}
