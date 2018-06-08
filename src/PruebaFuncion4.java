import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaFuncion4 {
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
    Atleta a3=new Atleta("Antonio","20032493N",Diego,obstaculos);
    Atleta a4=new Atleta("Antonio","20043493N",Paula,null);
    Club clubAtletismo=new Club(atletas,deportes,entrenadores);
    Atleta prueba= new Atleta("Sofía","15896347F",Paula,maraton);





    @BeforeEach
    void preparar(){


    }

    @Test
    void primeraPrueba(){
        //	Casos en el que no haya atletas en el club.
        assertFalse(clubAtletismo.tieneAtletas(prueba));


    }

    @Test

    void segundaPrueba(){
        //	Casos en el que si haya sólo un atleta en el club.
        clubAtletismo.atletas.add(a1);
        assertTrue(clubAtletismo.tieneAtletas(a3));


    }
    @Test

    void terceraPrueba(){
        //	Casos en el que si haya sólo un atleta en el club.
        clubAtletismo.atletas.add(a1);
        assertTrue(clubAtletismo.tieneAtletas(a3));


    }
    @Test

    void cuartaPrueba(){
        // Casos en el que haya dos atletas en el club.
        clubAtletismo.atletas.add(a1);
        clubAtletismo.atletas.add(a2);
        assertTrue(clubAtletismo.tieneAtletas(a3));


    }

    @Test

    void quintaPrueba(){
        // 	Casos en el que el atleta que se va no practique ningún deporte.
        clubAtletismo.atletas.add(a1);
        clubAtletismo.atletas.add(a2);
        assertFalse(clubAtletismo.tieneAtletas(a4));


    }

}
