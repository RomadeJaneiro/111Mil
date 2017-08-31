package modelo;
import java.util.*;
public class Cargas {
	
	public static void cargarEdad(){
		String edad;
		Scanner entrada = new Scanner(System.in);
		boolean validar = false;
		do{
			System.out.println("Ingrese edad: ");
			edad = entrada.nextLine();
			validar = Validaciones.validarEdad(Integer.parseInt(edad));
		}while(validar == false);
		
	}
	
	public static void cargarSexo(){
		String sexo;
		Scanner entrada = new Scanner(System.in);
		boolean validar = false;
		do{
			System.out.println("Ingrese sexo (F = femenino M = masculino): ");
			sexo = entrada.nextLine();
			validar = Validaciones.validarSexo(sexo);
		}while(validar == false);
		
		entrada.close();
		
	}

}
