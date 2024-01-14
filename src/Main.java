
public class Main {
    public static void main(String[] args) {
        Liga liga = new Liga();
        while (true) {
            System.out.println("MENU DE LA LIGA");
            System.out.println("1- Insertar Equipo");
            System.out.println("2- Insertar Jugador");
            System.out.println("3- Ver equipos de la liga");
            System.out.println("4- Ver jugadores de un equipo.");
            System.out.println("5- Vender jugador");
            System.out.println("6- Salir");
            System.out.println("Seleccione una opción:");

            int opcion = 0;
            switch (opcion) {

                case 1:
                    new Equipo();
                    break;
                case 2:
                    new Jugador();
                    break;
                case 3:
                    liga.getEquipo();
                    break;
                case 4:
                    Equipo.mostrarListaJugadores();
                    break;
                case 5:
                    Equipo.venderJugador();
                    break;
                case 6:
                    break;
            }
        }
    }