package org.ptech.java.citas.entities;

import java.time.LocalDate;

public class Paciente {
    int id;
    String nombres;
    String apellidos;
    TipoDocumento tipoDocumento;
    long numeroDocumento;
    String correoElectronico;
    long celular;
    LocalDate fechaNacimientoDate;
    Double altura;
    Double peso;
    TipoSangre tipoSangre;
    char factorRH;

    public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento,
            String correoElectronico, long celular, LocalDate fechaNacomientoDate, Double altura, Double peso,
            TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimientoDate = fechaNacomientoDate;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;


        
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacomientoDate() {
        return fechaNacimientoDate;
    }

    public void setFechaNacimientoDate(LocalDate fechaNacimientoDate) {
        this.fechaNacimientoDate = fechaNacimientoDate;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }


    
}
