package statics;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("user01", "email@gmail.com");

        Usuario.counter++; // accediendo al campo desde la clase

        System.out.println(Usuario.counter);

        usuario1.counter++; // accediendo al campo desde una instancia

        System.out.println(usuario1.counter);


        System.out.println(Math.PI);
        System.out.println(Math.E);


        // Calculadora

       int respuesta = Calculadora.sumar(200, 482);
        System.out.println(respuesta);

    }
}
