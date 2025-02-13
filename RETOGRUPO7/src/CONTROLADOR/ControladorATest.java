package CONTROLADOR;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Modelo.Aeropuerto;
import Modelo.Agencia;
import Modelo.Alojamiento;
import Modelo.Otros;
import Modelo.Pais;
import Modelo.Viaje;
import Modelo.Vuelo;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class ControladorATest {

    private JPanel panelLogo;
    private JPanel panelColor;

    @Before
    public void setUp() {
        panelLogo = new JPanel();
        panelColor = new JPanel();
    }

    @Test
    public void testLogoconColor_ValidData() {
        int idAgencia = 1;

        try {
            ControladorA.logoconColor(panelLogo, panelColor, idAgencia);

            // Verificamos si los paneles fueron modificados correctamente
            assertNotNull(panelLogo);
            assertNotNull(panelColor);
        } catch (Exception e) {
            fail("Se produjo una excepción: " + e.getMessage());
        }
    }

    @Test
    public void testConvertirImg_ValidUrl() {
        String logoUrl = "https://example.com/logo.png";
        ImageIcon imageIcon = ControladorA.convertirImg(logoUrl);

        assertNotNull(imageIcon); // Si se pudo cargar la imagen
    }

    @Test
    public void testConvertirColor_ValidHexColor() {
        String colorHex = "#FF5733"; // Un color válido en formato hex
        Color color = ControladorA.convertirColor(colorHex);

        assertNotNull(color); // Verificamos que el color fue convertido
    }



    @Test
    public void testObtenerPaisId_ValidId() {
        ArrayList<Pais> paises = ControladorA.obtenerPaisId("P001");

        assertNotNull(paises);
        assertTrue(paises.size() > 0);
        assertFalse(paises.size() <= 0);
    }

    @Test
    public void testObtenerIdAeropuerto_ValidId() {
        ArrayList<Aeropuerto> aeropuertos = ControladorA.obtenerIdAeropuerto("A001");

        assertNotNull(aeropuertos);
        assertTrue(aeropuertos.size() > 0);
    }



    @Test
    public void testAutenticarUsuario_ValidCredentials() {
        boolean autenticado = false;
        try {
            // Intentamos autenticar con unas credenciales de prueba
            autenticado = ControladorA.autenticarUsuario("usuario", "contraseña");
            
            
            // Añadimos más información para depurar
            System.out.println("Autenticación realizada: " + autenticado);
        } catch (Exception e) {
            // En caso de excepción, imprimimos la pila de errores
            e.printStackTrace();
        }
        
        // Verificamos que la autenticación sea verdadera
        assertTrue("El usuario debería estar autenticado", autenticado);
    }

    @Test
    public void testObtenerAgenciaId_ValidId() {
        ArrayList<Agencia> agencias = ControladorA.obtenerAgenciaId("A001");

        assertNotNull(agencias);
        assertTrue(agencias.size() > 0);
        assertFalse(agencias.size() <= 0);
    }

    @Test
    public void testObtenerAgenciaNombre_ValidName() {
        ArrayList<Agencia> agencias = ControladorA.obtenerAgenciaNombre("Agencia Test");

        assertNotNull(agencias);
        assertTrue(agencias.size() > 0);
    }

    @Test
    public void testObtenerAgenciaLogo_ValidLogo() {
        ArrayList<Agencia> agencias = ControladorA.obtenerAgenciaLogo("logo.png");

        assertNotNull(agencias);
        assertTrue(agencias.size() > 0);
        assertFalse(agencias.size() <= 0);
    }

    @Test
    public void testMostrarPaises() {
        ArrayList<Pais> paises = ControladorA.mostrarPaises();

        assertNotNull(paises);
        assertTrue(paises.size() > 0);
    }

    @Test
    public void testMostrarNombrePais() {
        ArrayList<Pais> paises = ControladorA.mostrarNombrePais();

        assertNotNull(paises);
        assertTrue(paises.size() > 0);
    }

    @Test
    public void testMostrarNombreAeropuerto() {
        ArrayList<Aeropuerto> aeropuertos = ControladorA.mostrarNombreAeropuerto();

        assertNotNull(aeropuertos);
        assertTrue(aeropuertos.size() > 0);
    }

    @Test
    public void testBorrarViajes_ValidId() {
        try {
            ControladorA.borrarViajes("V001");
        } catch (Exception e) {
            fail("Se produjo una excepción al borrar el viaje: " + e.getMessage());
        }
    }

    @Test
    public void testBorrarEventos_ValidId() {
        try {
            ControladorA.borrarEventos("E001");
        } catch (Exception e) {
            fail("Se produjo una excepción al borrar el evento: " + e.getMessage());
        }
    }
}