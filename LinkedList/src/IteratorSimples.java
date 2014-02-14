
public class IteratorSimples implements Iterator {
	private No atual;
	
	public IteratorSimples(No n){
		atual = n;
	}

	@Override
	public boolean hasNext() {
		return (atual!=null);
	}

	@Override
	public Pessoa next() {
		if(!hasNext())
			throw new RuntimeException("Nao existe elemento");
		No no  = atual;
		atual = atual.getProximo();
		return no.getPessoa();
	}

}
