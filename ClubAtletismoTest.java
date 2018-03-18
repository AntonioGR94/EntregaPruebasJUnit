import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class ClubAtletismoTest {
    static ArrayList<Deporte> deportes=new ArrayList<>();
    static ArrayList<Atleta> atletas=new ArrayList<>();
    static ArrayList<Entrenador> entrenadores=new ArrayList<>();
    private Atleta atletaProbar=null;
    static int posAtletaActual = 0;
    static int posDeporteActual = 0;
    static Entrenador Pepe=new Entrenador ("Pepe",atletas);
    static Entrenador Paula=new Entrenador ("Paula",atletas);
    static Club clubAtletismo=new Club(atletas,deportes,entrenadores);


    @BeforeAll
    static void crearAtletas() {




        Deporte carrera = new Deporte("Carrera");
        Deporte obstaculos = new Deporte("Obstáculos");
        Deporte salto = new Deporte("Salto");
        Deporte pertiga = new Deporte("Pértiga");
        Deporte maraton = new Deporte("Maratón");

        Atleta a1= new Atleta ("20091593N","Antonio",Pepe,deportes);
        Atleta a2= new Atleta ("15896325T","Juan",Paula,deportes);
        Atleta a3= new Atleta ("20087412G","Marta",Pepe,deportes);
        Atleta a4= new Atleta ("28859800Y","María",Paula,deportes);
        Atleta a5= new Atleta ("45685223M","Jose",Pepe,deportes);
        a1.setFechaInicio(new GregorianCalendar (2017,5,15));
        a2.setFechaInicio(new GregorianCalendar (2017,4,17));
        a3.setFechaInicio(new GregorianCalendar (2016,5,15));
        a4.setFechaInicio(new GregorianCalendar (2014,4,17));
        a5.setFechaInicio(new GregorianCalendar (2012,5,15));

        entrenadores.add(Pepe);
        entrenadores.add(Paula);



        deportes.add(carrera);
        deportes.add(obstaculos);
        deportes.add(salto);
        deportes.add(pertiga);
        deportes.add(maraton);

        atletas.add(a1);
        atletas.add(a2);
        atletas.add(a3);
        atletas.add(a4);
        atletas.add(a5);

        System.out.println("Atletas: "+atletas.toString()+"\n Deportes: "+deportes.toString()+"\n Entrenadores: "+Pepe.toString()+"\t"+Paula.toString());




        }
    @BeforeEach
    void prepararAtletaProbar(){
        atletaProbar = atletas.get(posAtletaActual);

    }

    @AfterEach
    void aumentarPosicion(){
        posAtletaActual ++;
        posDeporteActual++;

    }


    @Test
    void primeraFuncion(){
        boolean tontoRaul=true;
        assertNotNull(deportes);
        Deporte carrera=deportes.get(posDeporteActual);
        boolean practica=atletaProbar.practica(carrera, Pepe);
        assertTrue(practica);
    }

    @Test
    void segundaFuncion(){
        ArrayList<Atleta> atletasEsperados=Pepe.entrenarFecha(new GregorianCalendar(2017,5,15));

        ArrayList<Atleta> test=new ArrayList<>();
        Atleta prueba= new Atleta("41786357J","Juan",Pepe,deportes);
        prueba.setFechaInicio(new GregorianCalendar(2017,5,15));
        test.add(prueba);

        assertEquals(atletasEsperados.size(),test.size());

        for (int i=0;i<atletasEsperados.size();i++){
                assertEquals(atletasEsperados.get(i).getFechaInicio(),test.get(i).getFechaInicio());
        }

    }

    @Test
    void terceraFuncion(){
        Atleta atleta=new Atleta("78569521H","Paco",Pepe,deportes);
        Atleta test=atleta.mismoEntrenador();

        assertEquals(atleta.entrenador,test.entrenador);


    }

    @Test
    void cuartaFuncion(){
        Deporte salto = new Deporte("Salto");
        Deporte pertiga = new Deporte("Pértiga");
        Deporte maraton = new Deporte("Maratón");
        ArrayList<Deporte> deportesTest=new ArrayList<>();
        deportesTest.add(salto);
        deportesTest.add(pertiga);
        deportesTest.add(maraton);


        Atleta dejaClub=new Atleta ("52842658M","Alvaro",Paula,deportesTest);
        assertNotNull(dejaClub.getDeportes());
        assertTrue(Paula.tieneAtletas(dejaClub));


    }

    @Test
    void quintaFuncion(){
        ArrayList<Atleta> atletasTest=new ArrayList<>();
        Atleta aTest1= new Atleta ("47515986F","Antonio",Pepe,deportes);
        Atleta aTest2= new Atleta ("56325841G","Marta",Paula,deportes);
        Atleta aTest3= new Atleta ("15876214D","María",Pepe,deportes);
        atletasTest.add(aTest1);
        atletasTest.add(aTest2);
        atletasTest.add(aTest3);
        Entrenador entrenadorTest=new Entrenador ("Fernando",atletasTest);

        assertNotNull(Pepe.atletasNombre());
        assertNotNull(entrenadorTest.atletasNombre());
        assertEquals(Pepe.atletasNombre().size(),entrenadorTest.atletasNombre().size());

        for (int i=0;i<atletasTest.size()-1;i++){
            assertEquals(entrenadorTest.atletasNombre().get(i).getNombre(),Pepe.atletasNombre().get(i).getNombre());
        }

    }

    @Test
    void sextaFuncion(){
        Atleta atletaTest=new Atleta ("20091593N","Antonio",Pepe,deportes);
        Atleta atletaTest1=new Atleta ("45712369S","Carlos",Pepe,deportes);
        boolean mismaPersona=atletas.get(0).mismaPersona(atletaTest);
        assertTrue(mismaPersona);

        mismaPersona=atletas.get(0).mismaPersona(atletaTest1);
        assertFalse(mismaPersona);



    }

    @Test
    void octavaFuncion(){
        boolean diversidad=clubAtletismo.diversidad();
        assertFalse(diversidad);
        Deporte carrera = new Deporte("Carrera");
        Deporte obstaculos = new Deporte("Obstáculos");
        Deporte salto = new Deporte("Salto");
        Deporte pertiga = new Deporte("Pértiga");
        Deporte maraton = new Deporte("Maratón");
        Deporte tripleSalto = new Deporte("Triple Salto");
        Deporte jabalina = new Deporte("Jabalina");
        Deporte cienMetros = new Deporte("100 m");
        Deporte saltoAltura = new Deporte("Salto de altura");
        Deporte doscientosMetros = new Deporte("200 m");

        ArrayList<Deporte> deportesTest=new ArrayList<>();
        deportesTest.add(carrera);
        deportesTest.add(obstaculos);
        deportesTest.add(salto);
        deportesTest.add(pertiga);
        deportesTest.add(maraton);
        deportesTest.add(tripleSalto);
        deportesTest.add(jabalina);
        deportesTest.add(cienMetros);
        deportesTest.add(saltoAltura);
        deportesTest.add(doscientosMetros);

        Club clubTest=new Club (atletas,deportesTest,entrenadores);
        diversidad=clubTest.diversidad();

        assertTrue(diversidad);









    }






}
