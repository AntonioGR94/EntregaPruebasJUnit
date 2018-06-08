import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebaFuncion1 {
    ArrayList<Atleta> atletasPaula=new ArrayList<>();
    ArrayList<Atleta> atletasDiego=new ArrayList<>();
    Entrenador Paula=new Entrenador("Paula",atletasPaula);
    Entrenador Diego=new Entrenador("Diego",atletasDiego);
    Entrenador Rocio=null;
    Deporte obstaculos=new Deporte("Obstáculos");
    Deporte salto=new Deporte("Salto");
    Deporte maraton=new Deporte("Maratón");
    Atleta a1=new Atleta("Antonio","20091593N",Paula,obstaculos);
    Atleta a2=new Atleta("Antonio","20093543N",Diego,salto);
    Atleta a3=new Atleta("Antonio","20032493N",Rocio,null);





    @BeforeEach
     void preparar(){

        atletasPaula.add(a1);
        atletasDiego.add(a2);



    }

    @Test
    void primeraPrueba(){
        //	Practica ese deporte, pero no tiene el entrenador
        boolean practicaDeporte=a1.practica(obstaculos,Diego);
        assertFalse(practicaDeporte);

        //	Practica ese deporte y tiene ese entrenador.
        practicaDeporte=a1.practica(obstaculos,Paula);
        assertTrue(practicaDeporte);
    }

    @Test
    void segundaPrueba(){
       // No practica ese deporte, pero si tiene ese entrenador.

        boolean practicaDeporte=a2.practica(obstaculos,Diego);
        assertFalse(practicaDeporte);

        //	No practica el deporte y no tiene ese entrenador.
        practicaDeporte=a2.practica(maraton,Paula);
        assertFalse(practicaDeporte);
    }

    @Test
    void terceraPrueba() {
        // Usuario que no practica ningún deporte.
        boolean practicaDeporte = a3.practica(maraton, Rocio);
        assertFalse(practicaDeporte);

        // Entrenador null.

        practicaDeporte = a3.practica(maraton, Rocio);
        assertFalse(practicaDeporte);

    }

}
