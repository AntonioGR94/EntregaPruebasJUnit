package PACKAGE_NAME;
/**
 * Clase Club
 *
 * @author  Antonio Galán
 * @version 1.0
 * @since   2018-03-10
 */
import java.util.ArrayList;

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

}
