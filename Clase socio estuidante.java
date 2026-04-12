//Represnta a un socio estudiante que recibe cierto descuetno en la mensualidad

Public class SocioEstudiante extends Socio{
    private String institucionEducactiva;

    public SocioEstudiante(string rut, string nombre, string institucionEducactiva){
        super(rut, nombre);
        this.institucionEducactiva=institucionEducactiva;
    }

    public double calcularMensualidad(double tarifaBase){
        //los estudiantes reciben un 20% de descuetno en la tarfia base
        return tarfiaBae *0.80;
    }

}