//Clse base que represetna un miembro del club deportivo

public abstract class socio{
    protected string rut;
    protected string nombre;

    public socio(string rut, string nombre){
        this.rut=rut;
        this.nombre=nombre;
    }

    //Metodo que sera sobreescrito por las clases hijas 
    public abstract double calcularMensualidad(double tarifaBase);


    //sus respectivos Getters y Setters 
    public string getRut(){
        return rut;
    }

    public string getNombre(){
        return nombre;
    }

    public void setRut(string rut){
        this.rut=rut;
    }

    public void setNombre(string nombre){
        this.nombre=nombre;
    }
}