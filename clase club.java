import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;


public class ClubDeportivo {
    // Atributos privados
    private String idClub;
    private String nombre;
    private String direccion;
    
    // 2da Colección anidada de elementos tipo B (Actividades)
    private List<Actividad> actividades;

    // Constructor respectivo de la clase ClubDeportivo
     
    public ClubDeportivo(String idClub, String nombre, String direccion) {
        this.idClub = idClub;
        this.nombre = nombre;
        this.direccion = direccion;
        this.actividades = new ArrayList<>(); // Inicializacion de la coleccion
    }

    // sus respectivos Getters y Setters

    public String getIdClub() {
        return idClub;
    }

    public void setIdClub(String idClub) {
        this.idClub = idClub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }


    public void agregarActividad(Actividad actividad) {
        this.actividades.add(actividad);
    }

    //busqueda de una actividad por su ID

    public Actividad buscarActividad(String idActividad){
        for(Actividad act: actividades){
            if(act.getIdActividad().equals(idActividad)){
                return act;//retorna la actividad si la encuentra
            }
        }
        return null; //retorna null si no existe 
    }
    // Agrega esto a clase club.java para cumplir con la segunda clase del SIA-5
    
    public Actividad buscarActividad(String nombre, String horario) {
        for (Actividad act : actividades) {
            if (act.getNombre().equals(nombre) && act.getHorario().equals(horario)) {
            return act;
             }
        }
     return null;
}
    //Elimina actividad por su ID

    public boolean  eliminarActividad(String idActividad){
        Actividad act = buscarActividad(idActividad);

        if(act!=null){
            actividades.remove(act);
            return true;
        }
        return false;
    }

    @Override
    public String toString() { //imprimir los datos
        return "Club: " + nombre + " (ID: " + idClub + ") | Dirección: " + direccion + 
               " | Total Actividades: " + actividades.size();
    }

    
}