
public class Arvore {
	private NoTree raiz;
	
	//metodo inserir iterativo 
	public void add(String s){
		NoTree novo = new NoTree(s);
		if(raiz.getValor()==null){
			raiz = novo;
			return;
		}		
		NoTree aux = raiz;			
		while(aux!=null){
			if(aux.getValor().compareTo(s)<0){
				if(aux.getFilhoEsq()==null){
					aux.setFilhoEsq(novo);
					break;
				}else
					aux = aux.getFilhoEsq();				
			}else{
				if(aux.getFilhoDir()==null){
					aux.setFilhoDir(novo);
					break;
				}else
					aux = aux.getFilhoDir();
			}			
		}		
	}
	
	
	
	//metodo inserir recursivo 
	public void addRecursivo(String s){		
		NoTree novo = new NoTree(s);
		if(raiz==null)
			raiz = novo;			
		else
			recursivo(raiz,novo);
	}
	private void recursivo(NoTree pai, NoTree filho){
		if(pai.getValor().compareTo(filho.getValor())<0){
			if(pai.getFilhoEsq()==null)
				pai.setFilhoEsq(filho);
			else
				recursivo(pai.getFilhoEsq(),filho);
		}else{			
			if(pai.getFilhoDir()==null)
				pai.setFilhoDir(filho);
			else
				recursivo(pai.getFilhoDir(),filho);	
		}
	}
		
}
	
	




