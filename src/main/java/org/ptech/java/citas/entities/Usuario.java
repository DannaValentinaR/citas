package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

//clase padre
//clase maestra
//superclase
//clase base
public abstract class Usuario {
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected TipoDocumento tipoDocumento;
    protected long numeroDocumento;
    
    public Usuario(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    
}
