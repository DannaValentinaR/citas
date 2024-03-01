package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.Usuario;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {
   Medico m1 = new Medico(1,"Cristian", "Ramirez", TipoDocumento.CC, 12345678L, 34567L, Especialidad.CARDIOLOGIA);
   System.out.println("id del medico: " + m1.getId() +" | "  );
   
   Enfermero e1 = new Enfermero(3, "danner", "arias", TipoDocumento.CC, 8213789213L);
   

   e1.addProcedure("aplicar inyecciones");
   e1.addProcedure("vacuna");
   e1.addProcedure("limpiesa");
   
   for( String p : e1.getProcedimientos()){
          System.out.println("Procedimiento: " + p );

   }
}
}