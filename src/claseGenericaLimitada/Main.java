package claseGenericaLimitada;

import alumno.Alumno;

public class Main
{

	public static void main(String[] args) 
	{
		Almacen <String>almacen = new Almacen<String>(5);
		almacen.anadir("uno");
		almacen.anadir("dos");
		almacen.anadir("tres");
		almacen.anadir("cuatro");
		almacen.anadir("cinco");
		almacen.eliminar("dos");
		System.out.println(almacen.anadir("uno"));
		Object[] aux = almacen.getElementos();
		for (int i = 0; i < aux.length; i++) 
		{
			System.out.println((String) aux[i]);
		}
		Almacen <Alumno>almacen2 = new Almacen<Alumno>(5);
		Alumno a1 = new Alumno("Paco");
		almacen2.anadir(a1);
	}

}
