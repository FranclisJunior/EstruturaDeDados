
public class ListaSimples {
	private No cabeca;
	private No calda;
	int size = 0;
	
	
	public void add(Pessoa p){
		No n = new No(p);
		calda = n;// como o novo elemento vai sempre ser o ultimo elemento, entao ele ja é a cauda.
		if(cabeca== null){
			cabeca = n;
			return;
		}
		No aux = cabeca;
		while(aux.getProximo()!=null){
			aux = aux.getProximo();
		}
		aux.setProximo(n);		
		size++;
	}
	
	public void remover(int pos){
		No aux = cabeca;			
		No ant = aux;
		if(pos==1){
			cabeca = cabeca.getProximo();
			return;
		}
		for(int i=1 ; i<pos; i++){		
			ant = aux;
			aux = aux.getProximo();
		}
		ant.setProximo(aux.getProximo());
		size--;
	}
	
	public String toString() {
		No aux = cabeca;
		StringBuffer str = new StringBuffer();
		str.append("[");
		while (aux != null) {
			str.append(aux.getPessoa().getNome());
			if (aux.getProximo() != null)
				str.append(",");
			aux = aux.getProximo();
		}
		str.append("]");
		return str.toString();
	}
	
	public Iterator getIterator(){
		return new IteratorSimples(cabeca);
	}
	
}
