package interfaces.ejemplo1;

public class SoloAlumno implements IAlumno{
    @Override
    public void hacerTarea() {
        System.out.println("Solo alumno haciendo tarea");
    }

    @Override
    public void estudiar() {
        System.out.println("Solo alumno estudiando...");
    }
}
