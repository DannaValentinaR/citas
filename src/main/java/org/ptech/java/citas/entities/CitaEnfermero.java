package org.ptech.java.citas.entities;
import org.ptech.java.citas.entities.enums.*;
import org.ptech.java.citas.interfaces.IAgendable;

import java.time.LocalDateTime;

public class CitaEnfermero extends Cita implements IAgendable{

    Enfermero enfermero;
    EstadoCita estado;
    public CitaEnfermero(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente , Enfermero enfermero, EstadoCita estado){
        super(id, fecha, consultorio, paciente);
        this.enfermero = enfermero;
        this.estado = EstadoCita.AGENDADA;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
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