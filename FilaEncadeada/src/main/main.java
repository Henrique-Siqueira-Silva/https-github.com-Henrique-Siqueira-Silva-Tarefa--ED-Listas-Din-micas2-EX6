package main;

import biblioteca.ListaEncadeada;

public class main {

	public static <T> void main(String[] args) throws Exception {
		ListaEncadeada<Integer> l = new ListaEncadeada<>();
		

		System.out.println(l.Size());
		l.add(1, 0);
		System.out.println(l.get(0));
		System.out.println(l.getNo(0));
		l.RemoveFirst();
		System.out.println(l.Size());
		
	}

}
