
/**
 * Clase Club
 *
 * @author  Antonio Galán
 * @version 1.0
 * @since   2018-03-10
 */
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Club {
    ArrayList<Atleta> atletas=new ArrayList<>();
    ArrayList<Deporte> deportes=new ArrayList<>();
    ArrayList<Entrenador> entrenadores=new ArrayList<>();

    /**
     * @param atletas Lista de los atletas del club
     * @param deportes Lista de los deportes del club
     * @param entrenadores Lista de los entrenadores del club
     */

    public Club (ArrayList<Atleta> atletas,ArrayList<Deporte> deportes,ArrayList<Entrenador> entrenadores){
        this.atletas=atletas;
        this.deportes=deportes;
        this.entrenadores=entrenadores;
    }

    //-
    /**
     * Método que indique si es un club con mucha diversidad: Se considera diversa si
     * practican 10 deportes distintos.
     * @return boolean
     */
    public boolean diversidad(){
        if (this.deportes.size()>=9)
            return true;
        return false;

    }

    /**
     * - Método que te devuelva todos los atletas que empezaron a entrenar a partir de
     *   una fecha.
     * @param fecha Fecha para saber que atletas empezaron a entrenar a partir de esa fecha
     * @return atletasFecha Lista de los atletas
     */
    public ArrayList<Atleta> entrenarFecha(GregorianCalendar fecha){
        ArrayList <Atleta> atletasFecha=new ArrayList<>();
        for (Atleta a:atletas){
            if (a.getFechaInicio().equals(fecha)){
                atletasFecha.add(a);
            }
        }
        return atletasFecha;
    }
    //
    /**
     * - Método que te devuelva otra atleta con el mismo entrenador y si no existe pues
     *   que devuelva null.
     * @return Atleta
     */
    public Atleta mismoEntrenador(Atleta atleta){
        for (Atleta a:atletas){
            if (!a.mismaPersona(atleta)){
                return a;
            }
        }
        return null;
    }
    /**
     * - Método que te indique si el club tiene atletas que practiquen el mismo deporte
     *   que un atleta que deja el club.
     * @param atletaDejaClub Atleta que abandona el club
     * @return boolean
     */
    public boolean tieneAtletas(Atleta atletaDejaClub){
        for (Atleta a: atletas){

            if (a.getDeporte()==atletaDejaClub.getDeporte()){
                return true;
            }
        }

        return false;
    }

}
