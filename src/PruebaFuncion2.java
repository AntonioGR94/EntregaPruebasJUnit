import jdk.jfr.StackTrace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

public class PruebaFuncion2 {
    GregorianCalendar fecha=new GregorianCalendar(2017,5,15);

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
    Atleta a3=new Atleta("Antonio","20032493N",Rocio,null);
    Club clubAtletismo=new Club(atletas,deportes,entrenadores);
    ArrayList<Atleta> atletasEsperados=new ArrayList<>();

    @BeforeEach
    void preparar(){
        a1.setFechaInicio(fecha);
        a2.setFechaInicio(new GregorianCalendar(2016,7,25));
        a3.setFechaInicio(new GregorianCalendar(2014,4,12));
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

        atletasEsperados.add(a1);



    }

    @Test
    void primeraPrueba(){
       // Fechas límites: 1 día antes y un día después. Incluso un mes antes y un mes después, y un año antes y un año después.
        ArrayList<Atleta> test=clubAtletismo.entrenarFecha(fecha);
        assertEquals(atletasEsperados.size(),test.size());
        for (int i=0;i<atletasEsperados.size();i++){
                assertEquals(atletasEsperados.get(i).getFechaInicio(),test.get(i).getFechaInicio());
        }

        a1.setFechaInicio(new GregorianCalendar(2017,5,14));
        assertEquals(atletasEsperados.size(),test.size());
        for (int i=0;i<atletasEsperados.size();i++){
            assertEquals(atletasEsperados.get(i).getFechaInicio(),test.get(i).getFechaInicio());
        }
        a1.setFechaInicio(new GregorianCalendar(2017,5,16));
        assertEquals(atletasEsperados.size(),test.size());
        for (int i=0;i<atletasEsperados.size();i++){
            assertEquals(atletasEsperados.get(i).getFechaInicio(),test.get(i).getFechaInicio());
        }

        a1.setFechaInicio(new GregorianCalendar(2017,4,14));
        assertEquals(atletasEsperados.size(),test.size());
        for (int i=0;i<atletasEsperados.size();i++){
            assertEquals(atletasEsperados.get(i).getFechaInicio(),test.get(i).getFechaInicio());
        }

        a1.setFechaInicio(new GregorianCalendar(2017,6,14));
        assertEquals(atletasEsperados.size(),test.size());
        for (int i=0;i<atletasEsperados.size();i++){
            assertEquals(atletasEsperados.get(i).getFechaInicio(),test.get(i).getFechaInicio());
        }

        a1.setFechaInicio(new GregorianCalendar(2016,5,14));
        assertEquals(atletasEsperados.size(),test.size());
        for (int i=0;i<atletasEsperados.size();i++){
            assertEquals(atletasEsperados.get(i).getFechaInicio(),test.get(i).getFechaInicio());
        }

        a1.setFechaInicio(new GregorianCalendar(2018,5,14));
        assertEquals(atletasEsperados.size(),test.size());
        for (int i=0;i<atletasEsperados.size();i++){
            assertEquals(atletasEsperados.get(i).getFechaInicio(),test.get(i).getFechaInicio());
        }

    }
}

