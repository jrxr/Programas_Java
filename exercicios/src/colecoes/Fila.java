package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add -> adicionam elementos na fila
		//Diferença é o comportamento ocorre
		//quando a fila está cheia
		fila.add("Ana"); //retorna false
		fila.offer("Bia"); //lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> Obter o proximo elementos
		//da fila (sem remover)
		//Diferença é o comportamento ocorre
		//quando a fila está vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
		//Poll e remove -> obter o proximo elemento
		//da fila remover
		
		//Diferença é o comportamento ocorre
		//quando a fila está vazia
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); //lanca uma excecao
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
