
public class MergeSort {
	
	
	
	public int [] merge(int [] a, int [] b){
		int tamTotal = (a.length + b.length);
		int [] c = new int[tamTotal];	
		int iA = 0;
		int iB = 0;
		int indNovo = 0;
		
		int menorSize = b.length;
		if(a.length<=b.length){
			menorSize=a.length;
		}
		
		
		while(menorSize>0){		
			if(a[iA]<b[iB]){
				c[indNovo++]=a[iA++];	
				menorSize--;
			}else{
				c[indNovo++]= b[iB++];			
			}
		}
		for(int i = iB; iB<b.length;iB++)
			c[a.length]=b[iB];
		
		return c;
	}
	

}
