/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package edu.ups.ec.practica03.danielnieves.test;

import edu.ups.ec.practica03.danielnieves.controlador.ControladorCantante;
import edu.ups.ec.practica03.danielnieves.controlador.ControladorCompositor;
import edu.ups.ec.practica03.danielnieves.controlador.ControladorPersona;
import edu.ups.ec.practica03.danielnieves.dao.CompositorDAO;
import edu.ups.ec.practica03.danielnieves.modelo.Cantante;
import edu.ups.ec.practica03.danielnieves.modelo.Compositor;
import edu.ups.ec.practica03.danielnieves.modelo.Persona;
import edu.ups.ec.practica03.danielnieves.vista.VistaCantante;
import edu.ups.ec.practica03.danielnieves.vista.VistaCompositor;
import java.util.Scanner;
import edu.ups.ec.practica03.danielnieves.dao.CantanteDAO;
import edu.ups.ec.practica03.danielnieves.controlador.ControladorCantante;
import edu.ups.ec.practica03.danielnieves.controlador.ControladorCompositor;
import edu.ups.ec.practica03.danielnieves.controlador.ControladorPersona;

/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
// Creación de una instancia de VistaCantante
        VistaCantante CantanteC = new VistaCantante();
        // Creación de una instancia de VistaCompositor
        VistaCompositor vistaD = new VistaCompositor();
        
        // Creación de una instancia de CantanteDAO

        CantanteDAO cantanteDAO = new CantanteDAO();
        CompositorDAO compositorDAO = new CompositorDAO();

        ControladorCantante controladorCantante = new ControladorCantante(CantanteC, cantanteDAO);
        ControladorCompositor controladorCompositor = new ControladorCompositor(vistaD, compositorDAO);
        ControladorPersona controladorPersona = new ControladorPersona();
        
        // Llamada al método registrar() del controladorCantante
        controladorCantante.registrar();

        controladorCantante.eliminarCantante();
        controladorCantante.actualizarCantante();
        controladorCantante.verCantante();

        controladorCompositor.registrar();
        controladorCompositor.actualizarCompositor();
        controladorCompositor.agregarCliente();
        controladorCompositor.eliminarCompositor();
        controladorCompositor.verCompositores();

        controladorPersona.buscarCompositorCodigo(0);
        controladorPersona.buscarCantanteCodigo(0);
        controladorPersona.buscarPorNombreDeDisco("");
        controladorPersona.buscarPorTituloDeCancion("");
        controladorPersona.create("");
        controladorPersona.imprimir();

    }

}
