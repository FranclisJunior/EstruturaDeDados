public class Main {
  public static void main(String[] args) {
		
		System.out.println("Testando Lista Simples");
		ListaSimples listaS = new ListaSimples();			
		listaS.add(new Pessoa("Rodrigo"));	
		listaS.add(new Pessoa("Pauloo"));
		listaS.add(new Pessoa("Joao"));
		listaS.add(new Pessoa("Tiago"));	
		System.out.println(listaS.toString());		
		listaS.remover(2);
		System.out.println(listaS.toString()+"\n");
		
		
		System.out.println("Testando Lista Dupla");
		ListaDupla listaD = new ListaDupla();
		listaD.addInicio(new Pessoa("Rodrigo"));			
		listaD.addInicio(new Pessoa("Junior"));
		listaD.addInicio(new Pessoa("Tiago"));	
		System.out.println(listaD.toString());
		
		listaD.addFinal(new Pessoa("Joao"));
		System.out.println(listaD.toString());
		
		listaD.addPosicao(new Pessoa("Rivaldo"), 2);
		System.out.println(listaD.toString());
		
		listaD.removerInicio();
		System.out.println(listaD.toString());
		
		listaD.removerFinal();
		System.out.println(listaD.toString());	
		
		System.out.println("\nTestando Iterator Simples");
		Iterator itS = listaS.getIterator();
		while(itS.hasNext()){
			System.out.print(itS.next().getNome()+"-");
		}
		
		System.out.println("\n\nTestando Iterator Duplo");
		Iterator itD = listaD.getIterator();
		while(itD.hasNext()){
			System.out.print(itD.next().getNome()+"-");
		}
	}
}