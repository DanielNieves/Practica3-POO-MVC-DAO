/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ups.ec.practica03.danielnieves.controlador;

import edu.ups.ec.practica03.danielnieves.modelo.Persona;

/**
 *
 * @author Usuario
 */
public interface IControlador {

    // Metodos que pasan o trabajan solo con objetos
    public abstract void create(Object obj); //C

    public abstract Persona read(Persona obj); //R

    public abstract void update(Object obj); //U

    public abstract void delete(Object obj); //D
}
