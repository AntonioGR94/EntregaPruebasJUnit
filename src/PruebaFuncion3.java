import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PruebaFuncion3 {
    ArrayList<Atleta> atletasPaula=new ArrayList<>();
    ArrayList<Atleta> atletasDiego=new ArrayList<>();

    ArrayList<Deporte> deportes=new ArrayList<>();
    ArrayList<Entrenador> entrenadores=new ArrayList<>();
    ArrayList<Atleta> atletas=new ArrayList<>();
    Entrenador Paula=new Entrenador("Paula",atletasPaula);
    Entrenador Diego=new Entrenador("Diego",atletasDiego);
    Entrenador Rocio=null;
    Deporte obstaculos=new Deporte("Obstáculos");
    Deporte salto=new Deporte("Salto");
    Deporte maraton=new Deporte("Maratón");
    Atleta a1=new Atleta("Antonio","20091593N",Paula,obstaculos);
    Atleta a2=new Atleta("Antonio","20093543N",Diego,salto);
    Atleta a3=new Atleta("Antonio","20032493N",Diego,null);
    Club clubAtletismo=new Club(atletas,deportes,entrenadores);
    Atleta prueba= new Atleta("Sofía","15896347F",Paula,maraton);


    @BeforeEach
    void preparar(){

        atletasPaula.add(a1);
        atletasDiego.add(a2);
        deportes.add(obstaculos);
        deportes.add(salto);
        deportes.add(maraton);
        entrenadores.add(Diego);
        entrenadores.add(Paula);
        atletas.add(a1);
        atletas.add(a2);
        atletas.add(a3);




    }

    @Test
     void primeraPrueba(){
        //No sé bien qué pruebas hacer aquí. Habría que comprobar que el entrenador del atleta que devuelve la función sea
        // el mismo entrenador del atleta pasado por parámetro.
        //	Casos en el que el entrenador del atleta sólo lo entrena a él.
        // ¿Qué pasaría si no tiene entrenador el atleta?¿Puede darse ese caso?- Se le puede asignar un entrenador nulo a
        //un atleta, en ese caso nossaltaría NullPointer.



        assertEquals(prueba.entrenador,a1.entrenador);
    }




}
