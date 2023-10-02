package com.example.almanaque10;

public class User {
    private String Usuario,contraseña;

    public User(String Usuario,String contraseña) {
        this.Usuario = Usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
