

public class Nodo
{
	int datos;
	Nodo siguiente;
	Nodo primero ;

	public void crear()
	{
		primero =new Nodo();
		primero.datos=25;
		primero.siguiente=null;
	}
	public void agregarAlInicio()
	{

		Nodo aux=new Nodo();
		aux.datos=2;
		aux.siguiente=null;
		aux.siguiente=primero;
		primero=aux;
	}
	public void agregarFinal()
	{
		Nodo aux2= new Nodo();
		aux2.datos=8;
		aux2.siguiente=null;
		
		Nodo recorrer;
		recorrer=primero;
		while(recorrer!=null)
		{
			if(recorrer.siguiente==null)
			{
				recorrer.siguiente=aux2;
				recorrer=null;
			}
			else{
			recorrer=recorrer.siguiente;}
			
		}
		
		
	}
	public void imprimir()
	{
		String lista="";
			Nodo recorrer;
			recorrer=primero;
			while(recorrer!=null)
			{
				lista+="\n"+recorrer.datos;
				recorrer=recorrer.siguiente;
			}
			System.err.println(lista);
	}
	public void insertarNodo()
	{
		Nodo aux3=new Nodo();
		aux3.datos=10;
		aux3.siguiente=null;
		
		Nodo recorrer;
		recorrer=primero;
		while(recorrer!=null)
		{
			if(recorrer.datos==25)
			{
					recorrer.siguiente=aux3;
					//aux3=recorrer.siguiente;
					System.err.println("encontrado");
					recorrer=null;
					
			}
			else
			{
				recorrer=recorrer.siguiente;
			}
		}
	}
	public static void main(String args[])
	{
			Nodo no =new Nodo();
			no.crear();
			no.agregarAlInicio();
			no.agregarFinal();
			no.insertarNodo();
			no.imprimir();
			
	}
}
