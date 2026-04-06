import java.util.HAshMap;
import java.util.Map;

public class SistemaGestion{
    private Map<String, ClubDeportivo> mapaClubes;
    
    public SistemaGestion(){
        this.mapaclubes=new HashMap<>();
        cargarDatosIniciales();
    }

    public void registrarclub(ClubDeportivo nuevoClub){
        mapaClubes-put(nuevoClub.getIdClub(), nuevoClub);
    }

    public void agregarActgividadAClub(string idClub, actgividad nuevaActividad){
        ClubDeportivo club=mapaClubes.get(nuevaActividad);
        if(club!=null){
            club.agregarActgividadAClub(nuevaActividad);
        }else{
            systeme-out.println("Erorr: El club no exixte.");
        }
    }

    //sobrecarga 1

    public void registrarCLub(ClubDeportivo nuevoClub){
        if(nuevoClub !=null && !mapaclubes.containsKey(nuevoClub.getIDClub())){
            mapaClubes.put(nuevoClub.getIdClub(),nuevoClub);
            system.out.println("Club registrado exsitosamente");
        }
    }
    //sobrecarga2 
    public void RegistrarClub(string idCLub, string nombre, string direccion){
        ClubDeportivo nuevoCLub=new ClubDeportivo(idClub, nombre, direccion);

        this.registrarCLub(nuevoCLub);
        system.out.println("CLub instanciado y regisstrado desde parametos base");
    }
}