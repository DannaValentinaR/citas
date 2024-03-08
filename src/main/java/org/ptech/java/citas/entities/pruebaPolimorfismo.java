package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class pruebaPolimorfismo {
public static void main(String[] args) {
    Medico m = new Medico (1, "danna", "cardozo", TipoDocumento.CC, 12345678L, 6543219L, Especialidad.DERMATOLOGIA);
    System.out.println(m.toString());

    Consultorio c = new Consultorio(1, "calle 123", 12345678 );
    System.out.println(c.toString());

    Enfermero e = new Enfermero(1, "carolina", "ramirez", TipoDocumento.CC, 9876543L);
    e.addProcedure("vacuna");
    System.out.println(e.toString());

    Usuario u = new Usuario(1, "juana", "arias", TipoDocumento.CC, 7644757459L);
    System.out.println(u.toString());

    Paciente p = new Paciente(7, "danner", "orostegui", TipoDocumento.CC, 12323432L, "asdjhkjd@gmail.com", 83927489372L, LocalDate.now(), 1.60, 69.09, TipoSangre.O, '+');
}
}
