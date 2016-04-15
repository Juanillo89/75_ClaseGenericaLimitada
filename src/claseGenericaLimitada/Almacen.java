package claseGenericaLimitada;

public class Almacen<T>
{
	private Object[] contenedor;
	private int contador;
	
	public Almacen(int capacidad)
	{
		contenedor = new Object[capacidad];
	}
	
	/** A�ade un elemento a la estructura
	* @param T
	* @return true si lo a�ade, false si ya existe o no cabe */
	public boolean anadir(T t)
	{
		if(contador != contenedor.length)
		{	
			for (int i = 0; i < contador; i++) 
			{
				if (contenedor[i].equals(t))
				{
					return false;
				}
			}
			contenedor[contador] = t;
			contador++;
			return true;
		}	
		return false;
	}
	
	/** Elimina la primera aparici�n de un elemento de la estructura
	* @param T
	* @return true si lo elimina, false si no lo encuentra */
	public boolean eliminar(T t)
	{
		for (int i = 0; i < contador; i++) 
		{
			if (contenedor[i].equals(t))
			{
				for (int j = i; j < contenedor.length - 1; j++) 
				{
					contenedor[j] = contenedor[j + 1];
				}
				contador--;
				return true;
			}
		}
		return false;
	}
	
	/** Busca un elemento
	* @param T elemento a buscar
	* @return true si lo encuentra, false en caso contrario */
	public boolean existe(T t)
	{
		for (int i = 0; i < contador; i++) 
		{
			if (contenedor[i].equals(t))
			{
				return true;
			}
		}
		return false;
	}
	
	/** Conocer los elementos que hay.
	* @return array del tama�o ajustado con los elementos ordenados*/
	public Object[] getElementos()
	{
		Object[] aux = new Object[contador];
		for (int i = 0; i < aux.length; i++) 
		{
			aux[i] = contenedor[i];
		}
		return aux;
	}
	
	/** Conocer cu�ntos elementos hay.
	* @return n�mero de elementos que hay */
	public int getNumeroElementos()
	{
		return contador;
	}
	/** Conocer el n�mero m�ximo de elementos.
	* @return n�mero m�ximo de elementos que puede haber */
	public int getCapacidad()
	{
		return contenedor.length;
	}
}
