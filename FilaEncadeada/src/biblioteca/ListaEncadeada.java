package biblioteca;

public class ListaEncadeada<T> implements Ilista<T> {

	No<T> primeiro;

	public ListaEncadeada() {
		primeiro = null;
	}

	@Override
	public boolean isEmpy() {
		if (primeiro == null) {
			return true;
		}
		return false;
	}

	@Override
	public int Size() {
		int cta = 0;
		if (!isEmpy()) {
			No aux = primeiro;
			while (aux!= null) {
				cta++;
				aux = aux.proximo;
			}
		}

		return cta;
	}

	public void AddFirst(T dado) {
		No elemento = new No();
		elemento.dado = dado;
		elemento.proximo = primeiro;
		primeiro = elemento;

	}

	@Override
	public void AddLast(T dado) throws Exception {
		if (isEmpy()) {
			AddFirst(dado);
		}
		int tamanho = Size();
		No elemento = new No();
		elemento.dado = dado;
		elemento.proximo = null;
		No ultimo = getNo(tamanho - 1);
		ultimo.proximo = elemento;

	}

	@Override
	public void add(T dado, int pos) throws Exception {
		int tamanho = Size();
		if (pos < 0 || pos > tamanho ) {
			throw new Exception("POSIÇÃO INVALIDA");
		}
		if (pos == 0) {
			AddFirst(dado);
		} else if (pos == tamanho) {
			AddLast(dado);
		} else {
			No elemento = new No();
			elemento.dado = dado;
			No anterior = getNo(pos - 1);
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
		}
	}

	@Override
	public void RemoveFirst() throws Exception {
		if (isEmpy()) {
			throw new Exception("FILA VAZIA");
		}
		primeiro = primeiro.proximo;

	}

	@Override
	public void RemoveLast() throws Exception {
		if (isEmpy()) {
			throw new Exception("FILA VAZIA");
		}
		int tamanho = Size();
		if (tamanho == 1) {
			RemoveFirst();
		} else {
			No penultimo = getNo(tamanho - 2);
			penultimo.proximo = null;
		}

	}

	@Override
	public void Remove(int pos) throws Exception {
		if (isEmpy()) {
			throw new Exception("FILA VAZIA");
		}
		int tamanho = Size();
		if (pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição invalida");
		} else if (pos == 1) {
			RemoveFirst();
		} else if (pos == tamanho) {
			RemoveLast();
		} else {
			No anterior = getNo(pos - 1);
			No atual = getNo(pos);
			anterior.proximo = atual.proximo;

		}

	}

	@Override
	public int get(int pos) throws Exception {
		if (isEmpy()) {
			throw new Exception("FILA VAZIA");
		}
		int tamanho = Size();
		if (pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição invalida");
		}
		int cta = 0;
		No aux = primeiro;
		while (cta < pos) {
			aux = aux.proximo;
			cta++;
		}
		return (int) aux.dado;

	}

	@Override
	public No getNo(int pos) throws Exception {
		if (isEmpy()) {
			throw new Exception("FILA VAZIA");
		}
		int tamanho = Size();
		if (pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição invalida");
		}
		int cta = 0;
		No aux = primeiro;
		while (cta < pos) {
			aux = aux.proximo;
			cta++;
		}
		return aux;

	}

	@Override
	public void clean() {
		primeiro = null;

	}

}
