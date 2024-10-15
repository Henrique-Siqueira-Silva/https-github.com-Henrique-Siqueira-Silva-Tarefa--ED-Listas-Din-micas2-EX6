package biblioteca;

public interface Ilista <T> {
	
	public boolean isEmpy ();
	public int Size ();
	public void AddFirst(T dado);
	public void AddLast (T dado) throws Exception;
	public void add (T dado, int pos) throws Exception;
	public void RemoveFirst () throws Exception;
	public void RemoveLast () throws Exception;
	public void Remove ( int pos) throws Exception;
	public int get (int pos)throws Exception;
	public No getNo (int pos)throws Exception;
	public void clean ();
	
	
	

}
