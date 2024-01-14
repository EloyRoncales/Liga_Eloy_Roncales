public class Liga {
    private String pais;
    private final int numMaxEquipos = 20;
    private Equipo[] listadoEquipos;
    public Liga(){
        this.pais = pais;
        this.listadoEquipos = new Equipo[numMaxEquipos];
    }
    public void mostrarListadoEquipo(){

    }
    public int getNumEquipos(){
        int numEquip = 0;
        for (int i = 0; i < listadoEquipos.length; i++) {
            if (listadoEquipos[i] != null) {
                numEquip++;
            }
        }
        return numEquip;
    }
    public Equipo getEquipo(){
        return ;
    }
    public String getPais(){
        return pais;
    }
    public void añadirEquipo(){
        if (getNumEquipos() < numMaxEquipos) {
            listadoEquipos[getNumEquipos()] = new Equipo();
            getNumEquipos();
        } else {
            System.out.println("No se puede añadir más equipos. La liga está completa.");
        }
    }
}
