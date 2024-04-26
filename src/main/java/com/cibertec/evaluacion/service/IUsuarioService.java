package com.cibertec.evaluacion.service;
import com.cibertec.evaluacion.model.bd.Usuario;

import java.util.List;
public interface IUsuarioService {
    Usuario findUserByNomUsuario(String nomusuario);
    Usuario guardarUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    Usuario obtenerUsuarioxId(int id);
    void actualizarUsuario(Usuario usuario);
}