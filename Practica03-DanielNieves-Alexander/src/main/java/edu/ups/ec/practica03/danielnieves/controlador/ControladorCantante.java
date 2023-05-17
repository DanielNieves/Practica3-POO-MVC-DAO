/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.practica03.danielnieves.controlador;

import edu.ups.ec.practica03.danielnieves.idao.ICantanteDAO;
import edu.ups.ec.practica03.danielnieves.modelo.Cantante;
import edu.ups.ec.practica03.danielnieves.vista.VistaCantante;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladorCantante {
    private VistaCantante vistaCantante;
    
    private Cantante cantante;
    
    private ICantanteDAO cantanteDAO;


    public ControladorCantante(VistaCantante vistaCantante, ICantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.cantanteDAO = cantanteDAO;
    }


    
    public void registrar(){
        cantante = vistaCantante.ingresarCantante();
        cantanteDAO.create(cantante);
    }
    
    public void verCantante(){
        int id = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(id);
        vistaCantante.verCantante(cantante);
    }
    
    public void actualizarCantante(){
        cantante = vistaCantante.actualizarCantante();
        cantanteDAO.update(cantante);
    }
    
    public void eliminarCantante(){
        cantante = vistaCantante.eliminarCantante();
        cantanteDAO.delete(cantante);
    }
    
    public void verCantantes(){
        List<Cantante> cantantes;
        cantantes = cantanteDAO.findALL();
        vistaCantante.verCantantes(cantantes);
    }
    
    public void buscarPorNombreDeDisco(){
        String valor = vistaCantante.buscarPorDisco();
        cantante = cantanteDAO.buscarPorNombreDeDisco(valor);
        vistaCantante.verNombreyApellido(cantante);
    }
}
