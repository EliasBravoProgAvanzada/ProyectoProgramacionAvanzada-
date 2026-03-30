/**
 * Representa una actividad o disciplina deportiva impartida en un club.
 */
public class Actividad {
    // Todos los atributos son privados cumpliendo con SIA-3
    private String idActividad;
    private String nombre;
    private String horario;
    private int cuposMaximos;
    private double costoMensual;

    /**
     * Constructor de la clase Actividad.
     */
    public Actividad(String idActividad, String nombre, String horario, int cuposMaximos, double costoMensual) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.horario = horario;
        this.cuposMaximos = cuposMaximos;
        this.costoMensual = costoMensual;
    }

    // --- Getters y Setters ---

    public String getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(String idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCuposMaximos() {
        return cuposMaximos;
    }

    public void setCuposMaximos(int cuposMaximos) {
        this.cuposMaximos = cuposMaximos;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    @Override
    public String toString() {
        return "Actividad [" + idActividad + "] " + nombre + " | Horario: " + horario + 
               " | Cupos: " + cuposMaximos + " | Costo: $" + costoMensual;
    }
}