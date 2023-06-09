/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.practica03.danielnieves.dao;

import edu.ups.ec.practica03.danielnieves.idao.ICompositorDAO;
import edu.ups.ec.practica03.danielnieves.modelo.Compositor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CompositorDAO implements ICompositorDAO {

    List<Compositor> listaCompositores;

    public CompositorDAO() {
        listaCompositores = new ArrayList<>();
    }

    @Override
    public void create(Compositor compositor) {

        listaCompositores.add(compositor);
    }

    @Override
    public Compositor read(int codigo) {

        for (Compositor compositor : listaCompositores) {
            if (compositor.getCodigo() == codigo) {
                return compositor;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {

        for (int i = 0; i < listaCompositores.size(); i++) {
            Compositor c = listaCompositores.get(i);
            if (c.getCodigo() == compositor.getCodigo()) {
                listaCompositores.set(i, compositor);
                break;
            }
        }
    }

    @Override
    public void delete(Compositor compositor) {

        Iterator<Compositor> it = listaCompositores.iterator();
        while (it.hasNext()) {
            Compositor c = it.next();
            if (c.getCodigo() == compositor.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Compositor> findAll() {
        return listaCompositores;
    }

    @Override
    public List<Compositor> findALL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Compositor buscarPorTituloDeCancion(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
