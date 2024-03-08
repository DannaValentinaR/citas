package org.ptech.java.citas.entities;
import org.ptech.java.citas.entities.enums.*;
import org.ptech.java.citas.interfaces.IAgendable;

import java.time.LocalDateTime;

public class citaMedico extends Cita implements IAgendable{

    Medico medico;
    EstadoCita estado;
     public citaMedico(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente) {
        super(id, fecha, consultorio, paciente);

    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public EstadoCita getEstado() {
        return estado;
    }
    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }
    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        this.setFecha(fecha);
        this.setConsultorio(c);

        return true;
    }
    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {
        
        this.setFecha(nuevaFecha);
        this.setConsultorio(nuevoc);
        
        return true;
    }
    @Override
    public boolean cancelarCita() {
        this.estado = EstadoCita.CANCELADA;
         return true;      
    }


    }
     
