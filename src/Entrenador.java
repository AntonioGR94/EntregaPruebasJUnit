/**
 * Clase Entrenador
 *
 * @author  Antonio Galán
 * @version 1.0
 * @since   2018-03-10
 */
import java.util.ArrayList;

import java.util.GregorianCalendar;

public class Entrenador {
    String name;
    ArrayList<Atleta> atletas=new ArrayList<>();

    /**
     * @param name Lista de los deportes del club
     * @param atletas Lista de los atletas del club
     */

    public Entrenador(String name, ArrayList<Atleta> atletas){
        this.name=name;
        this.atletas=atletas;
    }
    public String toString(){
        return name;
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


    /**
     * - Método que devuelva los atletas con un nombre entre 5 y 20 caracteres.
     * @return atletasNombre
     */
    public ArrayList<Atleta> atletasNombre(){
        ArrayList<Atleta> atletasNombre=new ArrayList<>();

        for (Atleta a:atletas){
            if (a.getNombre().length()>=5 && a.getNombre().length()<=20){
                atletasNombre.add(a);
            }
        }
        return atletasNombre;
    }


    /**
     * - Método que te indique si el club tiene atletas que practiquen el mismo deporte
     *   que un atleta que deja el club.
     * @param atletaDejaClub Atleta que abandona el club
     * @return boolean
     */
    public boolean tieneAtletas(Atleta atletaDejaClub){
        for (Atleta a: atletas){
            for (Deporte d: a.getDeportes()){
                if (a.getDeportes().contains(d)){
                    return true;
                }
            }
        }
        return false;
    }




}
