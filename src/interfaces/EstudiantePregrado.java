package interfaces;

public class EstudiantePregrado implements IEstudiante {
    @Override
    public void hacerTarea() {
        System.out.println("Haciendo tarea");
    }

    @Override
    public void entregarTare() {
        System.out.println("Entregando tarea");
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiando....");
    }
}
