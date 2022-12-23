package com.braianespanon.Portfolio.service;

import com.braianespanon.Portfolio.model.TarjetaPerfil;

public interface IPerfilService {
    public TarjetaPerfil verPerfil();
    
    public void editarPerfil(TarjetaPerfil perfil);
}
