
public class MiniTeste {

	public static void main(String[] args) {


		Colecao c = new Colecao(10);

//		for(int i = 1; i <= 15; i++){
//			c.add("E"+i);
//		}
//
//		for(int i = 0; i < c.getSize(); i++){
//			System.out.println(c.getElemento(i));
//		}
//		
		// add elemento no inicio;
		c.addInicio("a");
		c.addInicio("b");
		c.addInicio("c");
		c.addInicio("d");		
		for(int i = 0; i < c.getSize(); i++){
			System.out.print(c.getElemento(i)+", ");
		}
		System.out.println("Adicionou cada elemento no inicio\n");		
		
		
		//add elemento na posiçao
		c.addPosicao("e",3);	
		for(int i = 0; i < c.getSize(); i++){
			System.out.print(c.getElemento(i)+", ");
		}		
		System.out.println("adicionou o elemento 'e' na posiçao '3'\n");
		
		//remover elemento do inicio
		c.removerInicio();
		for(int i = 0; i < c.getSize(); i++){
			System.out.print(c.getElemento(i)+", ");
		}	
		System.out.println("removeu o primeiro elemento da lista\n");
		
		//remover elemento da posicao
		c.removerPosicao(3);
		for(int i = 0; i < c.getSize(); i++){
			System.out.print(c.getElemento(i)+", ");
		}
		System.out.print("removeu o elemento da posicao '3' \n");
	}

}