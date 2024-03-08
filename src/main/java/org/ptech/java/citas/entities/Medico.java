package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

//clases que heredan:
//clases hijas
//subclases
//clase detalle
// clases especificas
public class Medico extends Usuario {

    //los atributos de una clase deben ser private
    
    private long registroMedico;
    private Especialidad especialidad;

    
    
    @Override
    public String toString() {
        return "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad  + ", nombre:"+ super.nombres + "]";
    }


    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento,
            long registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
   
    //constructor  por defecto 

    
  
    
   

    

}
