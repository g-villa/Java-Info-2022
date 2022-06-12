import java.util.*;

public class Ejercicio4 {
	public static void main(String[] args) {
        
        ArrayList<String> nombresEstudiantes = new ArrayList<>();
        
        nombresEstudiantes.add("Goku");
        nombresEstudiantes.add("Pepe Grillo");
        nombresEstudiantes.add("Menen");
        nombresEstudiantes.add("Superman");
        nombresEstudiantes.add("Seiya");
        nombresEstudiantes.add("Jhonny Bravo");
        nombresEstudiantes.add("Piccolo");
        nombresEstudiantes.add("La Momia");
        nombresEstudiantes.add("Ryu");
        nombresEstudiantes.add("Ken");
        nombresEstudiantes.add("Sub Zero");
        nombresEstudiantes.add("Alfonsin");
        
        List<String> primerCurso = nombresEstudiantes.subList(0, 4);
        List<String> segundoCurso = nombresEstudiantes.subList(4, 8);
        List<String> tercerCurso = nombresEstudiantes.subList(8, 12);
        
        System.out.println(primerCurso);
        System.out.println(segundoCurso);
        System.out.println(tercerCurso);

    }
   
}