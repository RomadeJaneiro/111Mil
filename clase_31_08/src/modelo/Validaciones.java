package modelo;

public class Validaciones {
	
	public static boolean validarEdad(int edad){
		boolean ok;
		if(edad < 18 || edad > 90){
			ok = false;
		}
		else{
			ok = true;
		}
		return ok;
	}
	
	public static boolean validarSexo(String sexo){
		boolean ok;
		if(sexo.equals("M") || sexo.equals("F")){
			ok = true;
		}
		else{
			ok = false;
		}
		return ok;
	}
	
	public static boolean validarEstadoCivil(int estado){
		boolean ok;
		if(estado < 1 || estado > 4){
			ok = false;
		}
		else{
			ok = true;
		}
		return ok;
	}
	
	public static boolean validarSueldo(double sueldo){
		boolean ok;
		if(sueldo < 8000){
			ok = false;
		}
		else{
			ok = true;
		}
		return ok;
	}
	
	public static boolean validarLegajo(int legajo){
		boolean ok;
		if(legajo > 999 && legajo < 10000){
			ok = true;
		}
		else{
			ok = false;
		}
		return ok;
	}
	
	public static boolean validarNacionalidad(String nac){
		boolean ok;
		if(nac.equals("A") || nac.equals("E") || nac.equals("N")){
			ok = true;
		}
		else
		{
			ok = false;
		}
		return ok;
	}
	

}
