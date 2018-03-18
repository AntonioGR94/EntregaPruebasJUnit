/**
 * Clase Atleta
 *
 * @author  Antonio Galán
 * @version 1.0
 * @since   2018-03-10
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Atleta {

    String nombre;
    String dni;
    Entrenador entrenador;
    ArrayList<Deporte> deportes =new ArrayList<>();
    GregorianCalendar fechaInicio;
    GregorianCalendar fechaFin;

    /**
     * @param dni Dni del atleta
     * @param nombre Nombre del atleta
     * @param trainer Entrenador del atleta
     * @param sports Deportes que practica el atleta
     */


    public Atleta(String dni,String nombre, Entrenador trainer, ArrayList<Deporte> sports){
        this.dni=dni;
        this.nombre=nombre;
        entrenador=trainer;
        deportes=sports;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Deporte> getDeportes() {
        return deportes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(GregorianCalendar fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String toString(){
        return nombre;
    }

    //
    /**
     * - Método que si le indicas el tipo de deporte y un entrenador a un jugador te
     *   indique si lo practica o no y si tiene ese entrenador.
     * @param sport Deporte
     * @param trainer Entrenador
     * @return boolean
     */
    public boolean practica(Deporte sport, Entrenador trainer){
        boolean loPractica=false;
        if (deportes.contains(sport) && entrenador.equals(trainer)){
            loPractica=true;

        }
        return loPractica;
    }

    //
    /**
     * - Método que te devuelva otra atleta con el mismo entrenador y si no existe pues
     *   que devuelva null.
     * @return Atleta
     */
    public Atleta mismoEntrenador(){
        for (Atleta a:entrenador.atletas){
            if (!a.equals(this)){
                return a;
            }
        }
        return null;
    }


    /**
     * - Método que compara si dos atletas son la misma persona
     * @param a Atleta para comparar
     * @return boolean
     */
    public boolean mismaPersona(Atleta a){
        if (this.getDni().equals(a.getDni()))
            return true;
        return false;

    }





}
