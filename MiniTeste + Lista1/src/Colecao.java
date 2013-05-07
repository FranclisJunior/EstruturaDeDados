
public class Colecao {
	
	private String elementos [];
	private int size;
	private int novoSize = size*2;
	
	public Colecao(int t){
		elementos = new String[t];
		size = 0;
	}
	
	public void add(String e){
		if(size==elementos.length){
			aumetarList(e);
		}		
		//add o elemento na posiçao do size atual, depois incrementa size
		elementos[size++]= e; 		 
	}
	
	private void aumetarList(String e){
		//cria uma nova lista com o dobro do tamanho
		String listAux [] = new String[size*2]; 
		for(int i =0 ; i<size; i++){
			//copia cada elemento da lista antiga e coloca na nova
			listAux[i] = elementos[i];
		}
		// diz que antiga lista agora é a nova lista
		elementos = listAux; 				
	}
	
	public String getElemento(int ps){
		// se a posiçao for invalida lança um exerçao
		if(ps<0 || ps>elementos.length) throw new CollectionException("Posicao invalida"); 	
		
		// se nao lança a exception, retorna a string da posiçao passada no metodo
		return elementos[ps]; 
	}
	
	
	public int getSize(){
		return this.size;
	}	
	
	public void addInicio(String e){
		if(elementos.length !=0){
			for(int i=size; i>0;i--)
				elementos[i] = elementos[i-1];								
		}
		elementos[0]=e;		
		size++;	
	}
	
	public void addPosicao(String s, int pos){
		if(pos>size || pos<0){
			throw new CollectionException("Posicao invalida"); // se a posiçao for invalida lança um exerçao	
		}
		if(size!=0){
			for(int i = size; i> pos; i--)
				elementos[i] = elementos[i-1];		
		}
		elementos[pos]=s;		
		size++;		
	}
	
	public void removerInicio(){ 
		// lança uma exception se a lista estiver vazia
		if(size==0)
			throw new CollectionException("Nao existe elemento na lista");
					
		for(int i =0; i<size; i++){			
			elementos[i] = elementos [i+1];
		}
		size--;
	}
	
	public void removerPosicao(int pos){		
		if(pos>size || pos<0)
			// se a posiçao for invalida lança um exerçao
			throw new CollectionException("Posicao invalida"); 
						
		for(int i = pos;i<size ; i++){
			elementos[i] = elementos[i+1];		
		}
		size--;
	}	
}
