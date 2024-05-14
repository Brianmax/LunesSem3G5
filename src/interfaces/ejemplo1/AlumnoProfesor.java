package interfaces.ejemplo1;

public class AlumnoProfesor implements IProfesor, IAlumno {

    @Override
    public void calificar() {
        System.out.println("Calificando...");
    }

    @Override
    public void dejarTarea() {
        System.out.println("Dejando tareas...");
    }

    @Override
    public void hacerTarea() {
        System.out.println("Alumno Profesor haciendo tareas ...");
    }

    @Override
    public void estudiar() {
        System.out.println("Alumno Profesor estudiando");
    }
}
