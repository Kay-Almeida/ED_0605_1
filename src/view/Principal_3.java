package view;

import model.Lista;

public class Principal_3 {
	public static void main(String[] args) throws Exception {
		
		Lista<Integer> l = new Lista<Integer>();  
		
		int vetorinicial [] = {1, 2, 6, 7, 8};
		int vetor [] = {3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8};
		int tamanho = vetorinicial.length;  
		
		for(int i=0; i<tamanho; i++) {
			if(i==0) {
				l.addFirst(vetorinicial[i]);
			}else {
				l.addLast(vetorinicial[i]);
			}
		}
		
		int tam = vetor.length; 
		for(int i=0; i<tam; i++) {
			int valor = vetor[i];
			if(verifica(valor, l)) {
				l.addLast(valor);
			}else if(valor%2==0) {
				l.add(valor, 2);
			}else if(valor%2!=0) {
				l.add(valor, 1);
			}
		}
		System.out.println("Lista: ");
		while(!l.isEmpty()) {
			System.out.print(l.get(0)+ " ");
			l.removeFirst();
		}
	}
		
		public static boolean verifica(int valor, Lista<Integer> l) throws Exception {
			for(int i=0; i<l.size(); i++) {
				if(valor==l.get(i)) {
					return true; 
				}
			}
			return false;
	}
}

