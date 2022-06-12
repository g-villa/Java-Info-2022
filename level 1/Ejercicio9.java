import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un texto");
        String texto = scan.nextLine();
        
        System.out.println("Cual letra quiere contar?");
        String letra = scan.next();
        scan.close();
        
        
        Ejercicio9.contarLetra(texto, letra);

    }
    static int i;

    static void contarLetra(String txt, String ascci) {
        int cant = 0;
        for(i=0;i<txt.length();i++) {
            int ch=txt.charAt(i);
            int ch2=ascci.charAt(0);
            if(ch==ch2 || ch==(ch2-32) || ch==(ch2+32)) {
                cant=cant+1;
            } 
        }
        System.out.println(String.format("La letra seleccionada se repite %s veces",cant));
    }
}