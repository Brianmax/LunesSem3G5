package interfaces;

public interface IEstudiante {
    float nota = 19; // estatico y final
    void hacerTarea();
    void entregarTare();
    void estudiar();
    default void printNota()
    {
        System.out.println(nota);
    }
}
