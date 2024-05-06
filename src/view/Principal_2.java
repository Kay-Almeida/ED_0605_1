package view;

import model.Lista;

public class Principal_2 {
	public static void main(String[] args) throws Exception {
		
		Lista<Integer> la = new Lista<Integer>(); 
		Lista<Integer> lb = new Lista<Integer>(); 
		Lista<Integer> li = new Lista<Integer>();
		Lista<Integer> lu = new Lista<Integer>();
		
		int vetora [] = {3, 5, 8, 12, 9, 7, 16}; 
		int vetorb [] = {9, 6, 2, 3, 7};
		
		int atamanho = vetora.length;
		int btamanho = vetorb.length;
		
		for(int i=0; i<atamanho; i++) {
			if(i==0) {
				la.addFirst(vetora[i]);
			}else {
				la.addLast(vetora[i]);
			}
		}
		
		for(int i=0; i<btamanho; i++) {
			if(i==0) {
				lb.addFirst(vetorb[i]);
			}else {
				lb.addLast(vetorb[i]);
			}
		}
		
		 atamanho = la.size(); 
		 btamanho = lb.size();

		for(int i=0; i<atamanho; i++){
		    for(int j=0; j<btamanho; j++){
		    	if(la.get(i)==lb.get(j)){
		    		li.addFirst(lb.get(j)); 
				}
		    }
		}

		for(int i=0; i<btamanho; i++){
    		lu.addFirst(lb.get(i)); 
		}
		for(int i=0; i<atamanho; i++){
			if(la.get(i)!= 7 && la.get(i)!= 3 && la.get(i)!= 9 ) {
    		lu.addFirst(la.get(i)); 
			}
		}

		System.out.print("Lista A: ");
		while(!la.isEmpty()) {
			System.out.print(la.get(0)+ " ");
			la.removeFirst();
		}
		System.out.println(" ");
		
		System.out.print("Lista B: ");
		while(!lb.isEmpty()) {
			System.out.print(lb.get(0)+ " ");
			lb.removeFirst();
		}
		System.out.println(" ");
		
		
		System.out.print("Lista I: ");
		while(!li.isEmpty()) {
			System.out.print(li.get(0)+ " ");
			li.removeFirst();
		}
		System.out.println(" ");

		
		System.out.print("Lista U: ");
		while(!lu.isEmpty()) {
			System.out.print(lu.get(0)+ " ");
			lu.removeFirst();
		}
		System.out.println(" ");

		
		
		
		
	}

}
