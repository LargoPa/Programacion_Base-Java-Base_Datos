package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();


    void eliminarUsuario(int id);

    void registrar(Usuario usuario);

    Usuario obtenerUsuarioCredenciales(Usuario usuario);
}
