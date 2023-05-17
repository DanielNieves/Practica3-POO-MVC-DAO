/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ups.ec.practica03.danielnieves.idao;

import edu.ups.ec.practica03.danielnieves.modelo.Cantante;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ICantanteDAO {

    public void create(Cantante cantante);

    public Cantante read(int codigo);

    public void update(Cantante cantante);

    public void delete(Cantante cantante);

    public List<Cantante> findAll();

    public List<Cantante> findALL();

    public Cantante buscarPorNombreDeDisco(String valor);

}
