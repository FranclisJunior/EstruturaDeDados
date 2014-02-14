public class ListaDupla implements Pilha, Fila {
	private NoDuplo inicio;
	private NoDuplo fim;
	private int size;
	
	public ListaDupla(){
		inicio = fim = null;
		size = -1;
	}
	
	public void addInicio(Pessoa p){
		NoDuplo novo = new NoDuplo(p);
		if(vazio()){
			inicio = novo;
			fim = novo;						
		}else{
			novo.setProximo(inicio);
			inicio.setAnterior(novo);
			inicio = novo;			
		}
		size++;
	}
	
	public void addFinal(Pessoa p){
		NoDuplo novo = new NoDuplo(p);
		if(vazio()){
			inicio = novo;
			fim = novo;			
		}else{
			fim.setProximo(novo);
			novo.setAnterior(fim);
			fim = novo;			
		}
		size++;			
	}
	
	public void addPosicao(Pessoa p, int pos){
		NoDuplo novo = new NoDuplo(p);
		if(pos==0){
			addInicio(p);			
		}else{
			NoDuplo aux = inicio;
			for(int i = 0; i<pos ;i++){
				aux = aux.getProximo();
			}
			novo.setProximo(aux);
			novo.setAnterior(aux.getAnterior());
			aux.getAnterior().setProximo(novo);
			aux.setAnterior(novo);
			size++;	
		}
	}
	
	public Pessoa removerInicio() throws RuntimeException{		
		if(vazio()){
			throw new RuntimeException("Lista Vazia");
		}
		NoDuplo removido = inicio;
		inicio = inicio.getProximo();
		inicio.setAnterior(null);
		size--;
		return removido.getPessoa();
	}
	
	public Pessoa removerFinal() throws RuntimeException{
		if(vazio()){
			throw new RuntimeException("Lista Vazia");
		}
		NoDuplo removido = fim;
		NoDuplo penultimo = fim.getAnterior();
		penultimo.setProximo(null);
		fim=penultimo;		
		size--;
		return removido.getPessoa();		
	}
	
	public String toString() {
		NoDuplo aux = inicio;
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
		return new IteratorDuplo(inicio);
	}
	
	public boolean vazio(){
		return (size<0);
	}
	
	public int getSize(){
		return size;
	}
	
	@Override
	public void addNaFila(Pessoa p) {
		addFinal(p);
	}

	@Override
	public Pessoa removerDaFila() {
		return removerInicio();
	}

	@Override
	public void addNaPilha(Pessoa p) {
		addFinal(p);		
	}

	@Override
	public Pessoa removerDaPilha() {
		return removerFinal();
	}

}
