package modelo;
import java.util.*;


/*
 * Crear la clase Funciones en modelo con los siguientes métodos estáticos
+ esBisiesto (int anio) : boolean
+ traerAnio ( GregorianCalendar fecha) : int
+ traerMes ( GregorianCalendar fecha) : int //devuelve int entre 1 y 12
+ traerDia (GregorianCalendar fecha) : int

 */


public class Funciones {
	
	public static int traerAnio(GregorianCalendar c){
		return c.get(Calendar.YEAR);
	}
	public static int traerMes(GregorianCalendar c){
		return c.get(Calendar.MONTH)+1;
	}
	public static int traerDia(GregorianCalendar c){
		return c.get(Calendar.DATE);
	}
	
	public static boolean esBisiesto(int anio){
		boolean es = false;
		if(anio % 4 == 0){
			es = true;
			if(anio % 100 == 0 && anio % 400 != 0){
				es = false;
			}
		}
//		else{
//			es = false;
//		}
		return es;
	}
//	public static boolean esFechaValida(int anio, int mes, int dia){
//		boolean es;
//		if(mes < 1 || mes > 12 ){
//			es = false;
//		}
//		else{
//			if(mes == 2 && Funciones.esBisiesto(anio) == true){
//				
//			}
				
			
//		}
		
//	}
	
	
	
	
}
