// Representa una actividad o disciplina deportiva impartida en un club.
public class Actividad {
    // Todos los atributos son privados Como dice el punto SIA 3
    private String idActividad;
    private String nombre;
    private String horario;
    private int cuposMaximos;
    private double costoMensual;

    // constructo de la claase    
    public Actividad(String idActividad, String nombre, String horario, int cuposMaximos, double costoMensual) {
        this.idActividad = idActividad;
        this.nombre = nombre;
        this.horario = horario;
        this.cuposMaximos = cuposMaximos;
        this.costoMensual = costoMensual;
    }

    // y sus respectivos Getters y Setter

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

    //Actuliza el costo mensual
    public void actulizarCosto(double nuevoCosto){
        if(nuevoCosto>=0){
            this.costoMensual=nuevoCOsto;
            system.out.println("Costo de la actividad actulizado a: $"+ this.costoMensual);
        }
    }

    //actuliza el costo aplicando un porcentaje de aumento 

    public void actualizarCosto(double porcentajeAumento, boolean aplicarPorcentaje){
        if(aplicarPorcentaje && porcentajeAumento>0){
            double aumento=this.costoMensual *(porcentajeAumento/100);
            this.costoMensual +=aumento;
            system.out.println("costo acutlizado por "+ porcentajeAumento+ "% a: $"+this.costoMensual )
        }
    }

    @Override
    public String toString() {
        return "Actividad [" + idActividad + "] " + nombre + " | Horario: " + horario + 
               " | Cupos: " + cuposMaximos + " | Costo: $" + costoMensual;
    }
}