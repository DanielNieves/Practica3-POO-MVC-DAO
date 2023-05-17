/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.practica03.danielnieves.idao;

import edu.ups.ec.practica03.danielnieves.modelo.Compositor;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ICompositorDAO {

    public void create(Compositor compositor);

    public Compositor read(int codigo);

    public void update(Compositor compositor);

    public void delete(Compositor compositor);

    public List<Compositor> findAll();

    public List<Compositor> findALL();

    public Compositor buscarPorTituloDeCancion(String valor);
}
