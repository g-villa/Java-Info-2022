import java.util.*;

public class Ejercicio6 {
	public static void main(String[] args) {
		Set<Empleado> empleados = new HashSet<>();
        Map<Integer, Integer> sueldoCalcu = new HashMap<Integer, Integer>();
        empleados.add(new Empleado(28333666, "Clark Kent", 8, 350));
        empleados.add(new Empleado(6333489, "Don Diego de la Vega", 10, 240));
        empleados.add(new Empleado(23438179, "Torrente", 12, 230));
        empleados.add(new Empleado(95145662, "Kakaroto", 20, 540));

        for (Empleado i:empleados){
            int sueldo = i.getpagoxHrs() * i.gethrsTrabj();
            sueldoCalcu.put(i.getDni(), sueldo);
            System.out.println("Empleado: " + i.getnombyape() + " - DNI N° " + i.getDni() + " - Sueldo: " + sueldo);
        }
    }

    static class Empleado{
        private int dni;
        private String nombyape;
        private int hrsTrabj;
        private int pagoxHrs;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombyape = nombre;
            this.hrsTrabj = horasTrabajadas;
            this.pagoxHrs = valorHora;
        }

        public int getDni() {
            return dni;
        }

        public String getnombyape() {
            return nombyape;
        }
        
        public int gethrsTrabj() {
            return hrsTrabj;
        }

        public int getpagoxHrs() {
            return pagoxHrs;
        }
    }
}