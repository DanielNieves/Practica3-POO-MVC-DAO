/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.practica03.danielnieves.vista;

import edu.ups.ec.practica03.danielnieves.modelo.Persona;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaPersona {

    private Scanner teclado;

    public VistaPersona() {
        teclado = new Scanner(System.in);
    }

    public int buscarPersona() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo de la persona a eliminar: ");
        int codigo = teclado.nextInt();
        return codigo;
    }

    public void verPersona(Persona persona) {
        System.out.println("Datos de la persona: " + persona);
    }

    public void verPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println("Datos de la persona: " + persona);
        }
    }

    public String buscarPorDisco() {
        teclado = new Scanner(System.in);
        System.out.println("BUSQUEDA POR NOMBRE DE DISCO");
        System.out.println("Ingrese el nombre del disco a buscar: ");
        String valor = teclado.next();
        return valor;
    }

    public String buscarCancion() {
        teclado = new Scanner(System.in);
        System.out.println("BUSQUEDA POR TITULO DE CANCION");
        System.out.println("Ingrese el titulo de la cancion a buscar: ");
        String valorT = teclado.next();
        return valorT;
    }
}
