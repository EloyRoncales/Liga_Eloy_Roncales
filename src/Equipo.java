public class Equipo {
    private String nombre;
    private String ciudad;
    private final int numMaxJugadores = 22;
    private Jugador[] listaJugadores;
    public Equipo(){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.listaJugadores = new Jugador[numMaxJugadores];
    }
    public String getNombre(){
        return nombre;
    }
    public String getCiudad(){
        return ciudad;
    }
    public int getNumJugadores(){
        int numJug = 0;
        for (int i = 0; i < listaJugadores.length; i++) {
            if (listaJugadores[i] != null) {
                numJug++;
            }
        }
        return numJug;
    }
    public static void mostrarListaJugadores(){

    }
    public void adquirirJugador(Jugador jugador){
        for (int i = 0; i < listaJugadores.length; i++) {
            if (listaJugadores[i] == null) {
                listaJugadores[i] = jugador;
            }
        }
    }
    public static void venderJugador(){
        for (int i = 0; i < numMaxJugadores; i++) {
            if () {
                borrar(i);
                break;
            }
        }
    }
    private void borrar(int p)
    {
        int pos = 0;
        if (p >= 0 && p < pos) {
            System.arraycopy(listaJugadores, p + 1,
                    listaJugadores, p, pos - p - 1);
            pos--;
        }
    }

}
