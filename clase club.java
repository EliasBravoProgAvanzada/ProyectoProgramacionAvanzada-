import java.util.ArrayList;
import java.util.List;

/**
 * Representa un club deportivo que gestiona múltiples actividades.
 */
public class ClubDeportivo {
    // Atributos privados
    private String idClub;
    private String nombre;
    private String direccion;
    
    // 2da Colección anidada de elementos tipo B (Actividades)
    private List<Actividad> actividades;

    /**
     * Constructor de la clase ClubDeportivo.
     * Inicializa la colección anidada vacía.
     */
    public ClubDeportivo(String idClub, String nombre, String direccion) {
        this.idClub = idClub;
        this.nombre = nombre;
        this.direccion = direccion;
        this.actividades = new ArrayList<>(); // Inicialización de la colección JCF
    }

    // --- Getters y Setters ---

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

    // --- Métodos de utilidad para la colección anidada ---

    /**
     * Agrega una nueva actividad a la colección del club.
     */
    public void agregarActividad(Actividad actividad) {
        this.actividades.add(actividad);
    }

    @Override
    public String toString() {
        return "Club: " + nombre + " (ID: " + idClub + ") | Dirección: " + direccion + 
               " | Total Actividades: " + actividades.size();
    }
}