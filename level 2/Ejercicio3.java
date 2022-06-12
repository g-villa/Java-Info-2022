import java.util.*;

public class Ejercicio3 {
	public static void main(String[] args) {
        
        ArrayList<String> numeracionCartas = new ArrayList<>();
        for (int x = 2; x < 15; x++) {
            numeracionCartas.add(String.format("%s",x));
        }
        System.out.println(numeracionCartas);
        
        Collections.reverse(numeracionCartas);
        System.out.println(numeracionCartas);
        
        Collections.shuffle(numeracionCartas);
        System.out.println(numeracionCartas);
    }
}