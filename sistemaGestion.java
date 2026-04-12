//Clase principal con la funcion de administrar el sistem de clubes deportivos, contiene coleccion principal y operaciones necesarias

import java.util.HAshMap;
import java.util.Map;
import java.io.*;
import java.util;


public class SistemaGestion{

    // clase prucnipal que administra el sistema de clubes de deportivos

    //primera coleccion tipo A, se utiliza interfaz Map y la implementacion HashMap del 
    //la clave es un string id del club y el valor des el objeto CLubDeportivo
    private Map<String, ClubDeportivo> mapaClubes;
    
    public SistemaGestion(){ 
        this.mapaclubes=new HashMap<>();
        cargarDatosIniciales(); //cumple el punto del SIA 3
    }


    private void cargarDatosIniciales(){ //carga de datos iniciales provicionales
        //instancia un par de clubes
        ClubDeportivo club1 = new ClubDeportivo("Club1", "club atetico Viña","Av.alvares 123");
        ClubDeportivo club2=new clubDeportivo("Club2","deportes Valparaiso","plaza valpraioso 32");

        //instanciar algunas actividiades
        Actividad act1 = new Actividad("Actividad1","futbol","Lun-Jue 16:00",20,25000.0);
        Actividad act2= new Actividad("Activivdad2", "Natacion", "Mar-vier 17:00",15,30000.0);
        Actividad act3=new Actividad("Actividad 3","Basquetbol","sab-dom 10:00",12,20000.0);

        //asignar actuvuvades a os clubes
        club1.agregarActividad(act1);
        Club1.agregarActividad(act2);
        club2.agregarActividad(act3);
        
        //guardar los clubes en la coleccion principal 
        mapaClubes.put(club.getIdclub(),club1);
        mapaClubes.put(club2.getIdClub(),club2);
    }


    //metodo para agregar un nuevo club a la primera coleccion
    public void registrarclub(ClubDeportivo nuevoClub){
        //se agrega al mapa usando el id como clave
        mapaClubes-put(nuevoClub.getIdClub(), nuevoClub);
    }

    //MEto que agrega una actividad a un club, busca un club en el mapa y la agrega una cactividad a su coleccion interna
    public void agregarActgividadAClub(string idClub, actgividad nuevaActividad){
        ClubDeportivo club=mapaClubes.get(nuevaActividad);

        if(club!=null){
            //se accede a la colecicon anidad dentro del club
            club.agregarActgividadAClub(nuevaActividad);
        }else{
            //sino manda mensjae que el club seleccionado no existe
            systeme-out.println("Erorr: El club no exixte.");
        }
    }

    //sobrecarga 1: registra unclub recibiendo el onjeto ya instanciado

    public void registrarCLub(ClubDeportivo nuevoClub){
        if(nuevoClub !=null && !mapaclubes.containsKey(nuevoClub.getIDClub())){
            mapaClubes.put(nuevoClub.getIdClub(),nuevoClub);
            system.out.println("Club registrado exsitosamente");
        }
    }
    //sobrecarga 2: Registra un club recibiendo directamente sus datos basicos  
    public void RegistrarClub(string idCLub, string nombre, string direccion){
        ClubDeportivo nuevoCLub=new ClubDeportivo(idClub, nombre, direccion);

        //lamamos al meteodo sobrecargado para evitar duplicar la logica de insercion
        this.registrarCLub(nuevoCLub);
        system.out.println("CLub instanciado y regisstrado desde parametos base");
    }


    public clubDeportivo buscarClub(string idClub){
        reutrn mapaClubes.get(idClub);
    }

    public boolean eliminarClub(string idClub){
        if(mapaClubes.containsKey(idClub)){
            mapaClubes.remove(idClub);
            system.out.println("club eliminado con exito");
            return true;
        }
        system.out.println("error");
        return false;
    }

    public boolean editarClub(string idClub, string nuevoNombre, string nuevoNombre, string nuevaDireccion){
        clubDeportivo club=bucarClub(idClub);
        if(club!=null){
            club.setNombre(nuevoNombre);
            club.setDireccion(nuevaDireccion);
            system.oout.println("Datos del club actualizado");
            return true;
        }
        system.out.println("error");
        return false;
    }

    // MÉTODO SIA-9: FUNCIONALIDAD PROPIA DEL NEGOCIO (FILTRADO)
    
    //busqueda de una actividad dentro de un club

    public Actividad busActividadEnClub(String idClub, string idActividad){
        ClubDeportivo club=buscarClub(idClub);
        if(club!=null){
            return club.buscarActividad(idActividad);
        }
        return null;
    }

    //metodo que elimina una actividad dentro del club

    public void eliminarActividadDeClub(String idClub, string idActividad){
        ClubDeportivo club= buscarCLub(idClub);
        if(club!=null){
            if(club.eliminarActividad(idActividad)){
                system.out.println("actividad eliminada");
            } else{
                system.out.println("Erorr");
            }
        } else{
            System.out.println("Club ingresa No existe");
        }
    }

    public void editarActividad(String idClub, String idActividad,String nuevoHorario, double nuevoCosto){
        Actividad act=buscarActividadEnClub(idClub,idActividad);
        if(act!=null){
            act.setHorario(nuevoHorario);
            act.setCostoMensua(nuevoCosto);
            system.out.println("Datos actulizados");
        }else{
            system.out.println("Error al actualizar datos");
        }
    }

    public List<Actividad> filtrarActividadesPorPresupuesto(double presupuestoMaximo) {
        // Esta lista guardará el "subconjunto filtrado" que piden las bases
        List<Actividad> actividadesFiltradas = new ArrayList<>();

        System.out.println("--- Buscando actividades hasta $" + presupuestoMaximo + " ---");

        // 1. Recorremos todos los clubes en el HashMap
        for (ClubDeportivo club : mapaClubes.values()) {
            
            // 2. Por cada club, recorremos su lista de actividades
            for (Actividad act : club.getActividades()) {
                
                // 3. Aplicamos el CRITERIO DE FILTRADO: 
                // Que el costo sea menor/igual al presupuesto Y que tenga cupos disponibles
                if (act.getCostoMensual() <= presupuestoMaximo && act.getCuposMaximos() > 0) {
                    actividadesFiltradas.add(act);
                    
                    // Imprimimos el resultado mostrando en qué club se imparte
                    System.out.println("-> Club " + club.getNombre() + " ofrece: " + 
                                       act.getNombre() + " por $" + act.getCostoMensual());
                }
            }
        }

        if (actividadesFiltradas.isEmpty()) {
            System.out.println("Lo sentimos, no hay actividades disponibles para ese presupuesto.");
        }

        return actividadesFiltradas;
    }

    public void guardarDatos(){
        try(PrintWriter pw=new PrintWriter(new fileWriter(ARCHIVO_DATOS))){
            for(ClubDeportivo club: mapaClubes.values()){
                pw.println("Cub, "+club.getIdClub()+ ","+club.getNombre()+","+club.getDireccion());

                for(Actividad act: club.getActividades()){

                    pw.println("ACT," + club.getIdClub() + "," + act.getIdActividad() + "," + 
                               act.getNombre() + "," + act.getHorario() + "," + 
                               act.getCuposMaximos() + "," + act.getCostoMensual());
                }
            }
            System.out.println("datos")
        } catch(ios )
    }
}