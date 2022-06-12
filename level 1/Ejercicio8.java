import java.util.*;

public class Ejercicio8 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su Nombre y Apellido:");
        String nombre = scan.nextLine();
        
        System.out.println("Ingrese su Edad:");
        Integer edad = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Ingrese su Dirección:");
        String direccion = scan.nextLine();
        
        System.out.println("Ingrese su Ciudad:");
        String ciudad = scan.nextLine();
        
        scan.close();
        
        System.out.println(String.format("%s - %s - %s - %s", ciudad, direccion, edad, nombre));

    }

}