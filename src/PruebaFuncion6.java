import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebaFuncion6 {
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
        atletas.add(a1);
        atletas.add(a2);
        atletas.add(a3);



    }

    @Test
    void primeraPrueba(){
        Atleta atletaTest=new Atleta ("Antonio","20091593N",Paula,obstaculos);
        Atleta atletaTest1=new Atleta ("Carlos","45712369S",Diego,obstaculos);

        boolean mismaPersona=atletas.get(0).mismaPersona(atletaTest);
        assertTrue(mismaPersona);

        mismaPersona=atletas.get(0).mismaPersona(atletaTest1);
        assertFalse(mismaPersona);



    }

    @Test

    void segundaPrueba(){
        Atleta atletaTest=null;
        Atleta atletaTest1=new Atleta ("Carlos","45712369S",Diego,obstaculos);

        boolean mismaPersona=atletas.get(0).mismaPersona(atletaTest);
        assertTrue(mismaPersona);

        mismaPersona=atletas.get(0).mismaPersona(atletaTest1);
        assertFalse(mismaPersona);

    }

    //¿Qué hubiera pasado si el atleta es un niño que no tiene DNI?
    //-En ese caso habría que modificar el método mismaPersona()
    // para que no comparase por dni sino con el equals de Atleta.
}
