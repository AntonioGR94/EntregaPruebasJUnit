import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PruebaFuncion7 {
    ArrayList<Atleta> atletasPaula = new ArrayList<>();
    ArrayList<Atleta> atletasDiego = new ArrayList<>();

    ArrayList<Deporte> deportes = new ArrayList<>();
    ArrayList<Entrenador> entrenadores = new ArrayList<>();
    ArrayList<Atleta> atletas = new ArrayList<>();
    Entrenador Paula = new Entrenador("Paula", atletasPaula);
    Entrenador Diego = new Entrenador("Diego", atletasDiego);
    Entrenador Rocio = null;
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

    Atleta a1 = new Atleta("Antonio", "20091593N", Paula, obstaculos);
    Atleta a2 = new Atleta("Antonio", "20093543N", Diego, salto);
    Atleta a3 = new Atleta("Antonio", "20032493N", Diego, null);
    Club clubAtletismo = new Club(atletas, deportes, entrenadores);
    Atleta prueba = new Atleta("Sofía", "15896347F", Paula, maraton);
    ArrayList<Deporte> deportesTest = new ArrayList<>();
    Club clubTest = new Club(atletas, deportesTest, entrenadores);


    @BeforeEach
    void preparar(){
        atletas.add(a1);
        atletas.add(a2);
        atletas.add(a3);



    }


    @Test
    void primeraPrueba() {
        boolean diversidad = clubAtletismo.diversidad();
        assertFalse(diversidad);

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


        diversidad = clubTest.diversidad();

        assertTrue(diversidad);
    }

    @Test
    void segundaPrueba(){
        boolean diversidad = clubAtletismo.diversidad();
        assertFalse(diversidad);

       // Falta hacer pruebas con una lista de deportes vacía.
        diversidad=clubTest.diversidad();
        assertFalse(diversidad);




    }
    @Test

    void terceraPrueba(){
        deportesTest.add(carrera);
        deportesTest.add(obstaculos);
        deportesTest.add(salto);
        deportesTest.add(obstaculos);
        deportesTest.add(carrera);
        boolean diversidad=clubTest.diversidad();
        assertFalse(diversidad);
    }
}
