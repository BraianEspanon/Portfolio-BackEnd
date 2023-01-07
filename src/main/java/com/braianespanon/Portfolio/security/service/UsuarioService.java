package com.braianespanon.Portfolio.security.service;

import com.braianespanon.Portfolio.security.entity.Usuario;
import com.braianespanon.Portfolio.security.repository.IUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    IUsuarioRepository usuarioRepo;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return usuarioRepo.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return usuarioRepo.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return usuarioRepo.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        usuarioRepo.save(usuario);
    }
}
