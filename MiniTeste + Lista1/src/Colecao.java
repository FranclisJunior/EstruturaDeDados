
public class Colecao {
	
	private String elementos [];
	private int size = 0;
	
	public Colecao(int t){
		elementos = new String[t];
	}
	
	public void add(String e){
		if(size==elementos.length){
			aumetarList(e);
		}		
		elementos[size++]= e; //add o elemento na posiçao do size atual, depois incrementa		 
	}
	
	private void aumetarList(String e){
		String listAux [] = new String[size*2]; //cria uma nova lista com o dobro do tamanho
		for(int i =0 ; i<size; i++){
			listAux[i] = elementos[i];//copia cada elemento da lista antiga e coloca na nova
		}
		elementos = listAux; // diz que antiga lista agora é a nova lista				
	}
	
	public String getElemento(int ps){
		if(ps<0 || ps>elementos.length) 	throw new RuntimeException("Posicao invalida"); // se a posiçao for invalida lança um exerçao	
		
		return elementos[ps]; // se nao lança a exception, retorna a string da posiçao passada no metodo
	}
	
	
	public int getSize(){
		return this.size;
	}	
	
	public void addInicio(String s){
		if(elementos.length !=0){
			for(int i=size; i>0;i--)
				elementos[i] = elementos[i-1];								
		}
		elementos[0]=s;		
		size++;	
	}
	
	public void addPosicao(String s, int pos){
		if(pos>size || pos<0){
			throw new RuntimeException("Posicao invalida"); // se a posiçao for invalida lança um exerçao	
		}
		if(size!=0){
			for(int i = size; i> pos; i--)
				elementos[i] = elementos[i-1];		
		}
		elementos[pos]=s;		
		size++;		
	}
	
	public void removerInicio(){
		for(int i =0; i<size; i++){
			elementos[i] = elementos [i+1];
		}
		--size;
	}
	
	public void removerPosicao(int pos){		
		if(pos>size || pos<0){
			throw new RuntimeException("Posicao invalida"); // se a posiçao for invalida lança um exerçao	
		}
				
		for(int i = pos;i<size ; i++){
			elementos[i] = elementos[i+1];		
		}
		size--;
	}
	
	
	
	
	
}
