import java.util.Scanner;

public class Principal {
    public void main(){
        Scanner teclado = new Scanner(System.in);
        Herramienta.Jugador jugador1 = new Herramienta.Jugador();
        System.out.println("Introduce el nombre del primer jugador:");
        jugador1.nombre = teclado.nextLine();
        Herramienta.Jugador jugador2 = new Herramienta.Jugador();
        System.out.println("Introduce el nombre del segundo jugador:");
        jugador2.nombre = teclado.nextLine();
        System.out.println("Resultados");
        System.out.println(jugador1.nombre + " ha sacado un: " + jugador1.dado.lanzar());
        System.out.println(jugador2.nombre + " ha sacado un: " + jugador2.dado.lanzar());
    }
}
