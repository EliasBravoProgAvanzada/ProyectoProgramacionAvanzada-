public abstract class socio{
    protected string rut;
    protected string nombre;

    public socio(string rut, string nombre){
        this.rut=rut;
        this.nombre=nombre;
    }


    public abstract double calcularMensualidad(double tarifaBase);

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