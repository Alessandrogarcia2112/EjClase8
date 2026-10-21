public class Herramienta {
    static class Dado {
        int lanzar() {
            return (int) (Math.random() * 6) + 1;
        }
    }

    static class Jugador {
        String nombre;
        Dado dado = new Dado();
    }
}

