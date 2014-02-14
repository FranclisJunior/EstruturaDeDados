
public class IteratorDuplo implements Iterator {
	private NoDuplo atual;
	
	public IteratorDuplo(NoDuplo n){
		atual = n;
	}

	@Override
	public boolean hasNext() {
		return (atual!=null);
	}

	@Override
	public Pessoa next() {
		NoDuplo no  = atual;
		atual = atual.getProximo();
		return no.getPessoa();
	}
	

}
