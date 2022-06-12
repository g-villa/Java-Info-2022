import java.util.*;

public class Ejercicio5 {
	public static void main(String[] args) {
        
        ArrayList<Integer> hrsTrab = new ArrayList<>();
        ArrayList<Integer> valorHr = new ArrayList<>();
        ArrayList<Integer> total = new ArrayList<>();
        
        
        hrsTrab.add(4);
        hrsTrab.add(3);
        hrsTrab.add(7);
        hrsTrab.add(8);
        hrsTrab.add(2);
        valorHr.add(250);
        valorHr.add(180);
        valorHr.add(430);
        valorHr.add(386);
        valorHr.add(274);

        
        for (Integer i = 0; i < hrsTrab.size(); i++) {
            total.add(hrsTrab.get(i)*valorHr.get(i));
        }
        
        System.out.println(total);
        
        long totalACobrar= total.stream()
                  .mapToLong(o -> o)
                  .sum();
            System.out.println("Total Final: $ "+totalACobrar);
        

    }
}