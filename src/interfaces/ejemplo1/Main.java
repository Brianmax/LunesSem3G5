package interfaces.ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AlumnoProfesor alumnoProfesor1 = new AlumnoProfesor();

        // objeto de tipo alumno profesor llamando al metodo hacerTarea
        alumnoProfesor1.hacerTarea();

        SoloAlumno soloAlumno = new SoloAlumno();
        // objeto de tipo solo alumno llamando al metodo hacerTarea
        soloAlumno.hacerTarea();

        // variable de tipo interfaz que almacena un objeto ArrayList
        // ArrayList es una clase que implementa la interfaz List
        List<Integer> lista1 = new ArrayList<>();
    }
}
