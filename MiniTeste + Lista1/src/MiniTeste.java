
public class MiniTeste {

	public static void main(String[] args) {


		Colecao c = new Colecao(10);

		for(int i = 1; i <= 15; i++){
			c.add("E"+i);
		}

		for(int i = 0; i < c.getSize(); i++){
			System.out.println(c.getElemento(i));
		}
		
		// add elemento no inicio;
		c.addInicio("a");
		c.addInicio("b");
		c.addInicio("c");
		c.addInicio("d");		
		for(int i = 0; i < c.getSize(); i++){
			System.out.println(c.getElemento(i));
		}
		System.out.println("\n");		
		
		
		//add elemento na posiçao
		c.addPosicao("e",2);	
		for(int i = 0; i < c.getSize(); i++){
			System.out.print(c.getElemento(i)+", ");
		}		
		System.out.println("\n");
		
		//remover elemento do inicio
		c.removerInicio();
		for(int i = 0; i < c.getSize(); i++){
			System.out.print(c.getElemento(i)+", ");
		}	
		System.out.println("\n");
		
		//remover elemento da posicao
		c.removerPosicao(2);
		for(int i = 0; i < c.getSize(); i++){
			System.out.print(c.getElemento(i)+", ");
		}
		

	}

}