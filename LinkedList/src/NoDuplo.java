
public class NoDuplo {
	private NoDuplo proximo;
	private NoDuplo anterior;
	private Pessoa pessoa;
	
	public NoDuplo(Pessoa p) {	
		this.pessoa = p;
	}

	public NoDuplo getProximo() {
		return proximo;
	}

	public void setProximo(NoDuplo proximo) {
		this.proximo = proximo;
	}

	public NoDuplo getAnterior() {
		return anterior;
	}

	public void setAnterior(NoDuplo anterior) {
		this.anterior = anterior;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa p) {
		this.pessoa = p;
	}
	
	
	
}
