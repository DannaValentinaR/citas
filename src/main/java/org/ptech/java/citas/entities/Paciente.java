package org.ptech.java.citas.entities;

import java.time.LocalDate;

import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;
import org.ptech.java.citas.entities.enums.Motivo;

public class Paciente extends Usuario{
    
    private String correoElectronico;
    private long celular;
    private LocalDate fechaNacimientoDate;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;
    private Motivo motivo;


    
    @Override
    public String toString() {
        return "Paciente [correoElectronico=" + correoElectronico + ", celular=" + celular + ", fechaNacimientoDate="
                + fechaNacimientoDate + ", altura=" + altura + ", peso=" + peso + ", tipoSangre=" + tipoSangre
                + ", factorRH=" + factorRH + "]";
    }


    public Paciente(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento,
            String correoElectronico, long celular, LocalDate fechaNacimientoDate, Double altura, Double peso,
            TipoSangre tipoSangre, char factorRH, Motivo motivo) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimientoDate = fechaNacimientoDate;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
        this.motivo = motivo;
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

    public LocalDate getFechaNacimientoDate() {
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


    public Motivo getMotivo() {
        return motivo;
    }


    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
    
}