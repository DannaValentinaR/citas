package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;


import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.Usuario;
import org.ptech.java.citas.entities.citaMedico;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;
import org.ptech.java.citas.entities.enums.Motivo;


public class Main {
public static void main(String[] args) {

       Medico m1 = new Medico(1,"Cristian", "Ramirez", TipoDocumento.CC, 12345678L, 34567L, Especialidad.CARDIOLOGIA);
       Medico m2 = new Medico(2,"Danna", "Arias", TipoDocumento.CC, 6217369L, 219873892L, Especialidad.DERMATOLOGIA);

       System.out.println("id del medico: " + m1.getId() +" | con nombre y apellido: "  + m1.getNombres() + " "+m1.getApellidos() + " | identificado con el numero de documento: " + m1.getNumeroDocumento() + " "+ m1.getTipoDocumento() + " | con el registro: " + m1.getRegistroMedico() + " |  con especialidad en " + m1.getEspecialidad());
       System.out.println("id del medico: " + m2.getId() +" | con nombre y apellido: "  + m2.getNombres() + " "+m2.getApellidos() + " | identificado con el numero de documento: " + m2.getNumeroDocumento() + " "+ m2.getTipoDocumento() + " | con el registro: " + m2.getRegistroMedico() + " |  con especialidad en " + m2.getEspecialidad());

       Paciente p1 = new Paciente(13, "Alexix", "Orostegui", TipoDocumento.TI, 98498237198L, "Alexix@gmail.com", 234543L, LocalDate.now(), 1.80, 80.2, TipoSangre.AB, '-', Motivo.GRIPE);
       Paciente p2 = new Paciente(4, "Andres", "Meza", TipoDocumento.TI, 911334498L, "Andres@gmail.com", 53454343L, LocalDate.now(), 1.58, 30.2, TipoSangre.O, '+', Motivo.ESCOPOLAMINA);
       Paciente p3 = new Paciente(5, "Jesus", " Narra", TipoDocumento.CC, 12232211L, "Jesus@gmail.com", 98933321L, LocalDate.now(), 1.60, 50.2, TipoSangre.AB, '+', Motivo.GRIPE);
       Paciente p4 = new Paciente(6, "Juan", "Perez", TipoDocumento.TI, 1233223L, "Juan@gmail.com", 78962L, LocalDate.now(), 1.80, 80.2, TipoSangre.AB, '-', Motivo.GRIPE);
       Paciente p5 = new Paciente(7, "Feid", "Silvestre", TipoDocumento.CC, 56754328L, "Feid@gmail.com", 33451221L, LocalDate.now(), 1.66, 45.2, TipoSangre.A, '-', Motivo.ESCOPOLAMINA);

       System.out.println("id del paciente: " + p1.getId() +" | con nombre y apellido: "  + p1.getNombres() + " "+p1.getApellidos() + " | identificado con el numero de documento: " + p1.getNumeroDocumento() + " "+ p1.getTipoDocumento() + " | con el correo: " + p1.getCorreoElectronico() + " |  con numero telefonico:  " + p1.getCelular() + " |  con fecha de nacimiento:  " + p1.getFechaNacimientoDate() + " |  con altura:  " + p1.getAltura() + " |  con peso:  " + p1.getPeso()  + " |  con tipo de sangre  " + p1.getTipoSangre() + p1.getFactorRH());
       System.out.println("id del paciente: " + p2.getId() +" | con nombre y apellido: "  + p2.getNombres() + " "+p2.getApellidos() + " | identificado con el numero de documento: " + p2.getNumeroDocumento() + " "+ p2.getTipoDocumento() + " | con el correo: " + p2.getCorreoElectronico() + " |  con numero telefonico:  " + p2.getCelular() + " |  con fecha de nacimiento:  " + p2.getFechaNacimientoDate() + " |  con altura:  " + p2.getAltura() + " |  con peso:  " + p2.getPeso()  + " |  con tipo de sangre  " + p2.getTipoSangre() + p2.getFactorRH());
       System.out.println("id del paciente: " + p3.getId() +" | con nombre y apellido: "  + p3.getNombres() + " "+p3.getApellidos() + " | identificado con el numero de documento: " + p3.getNumeroDocumento() + " "+ p3.getTipoDocumento() + " | con el correo: " + p3.getCorreoElectronico() + " |  con numero telefonico:  " + p3.getCelular() + " |  con fecha de nacimiento:  " + p3.getFechaNacimientoDate() + " |  con altura:  " + p3.getAltura() + " |  con peso:  " + p3.getPeso()  + " |  con tipo de sangre  " + p3.getTipoSangre() + p3.getFactorRH());
       System.out.println("id del paciente: " + p4.getId() +" | con nombre y apellido: "  + p4.getNombres() + " "+p4.getApellidos() + " | identificado con el numero de documento: " + p4.getNumeroDocumento() + " "+ p4.getTipoDocumento() + " | con el correo: " + p4.getCorreoElectronico() + " |  con numero telefonico:  " + p4.getCelular() + " |  con fecha de nacimiento:  " + p4.getFechaNacimientoDate() + " |  con altura:  " + p4.getAltura() + " |  con peso:  " + p4.getPeso()  + " |  con tipo de sangre  " + p4.getTipoSangre() + p4.getFactorRH());
       System.out.println("id del paciente: " + p5.getId() +" | con nombre y apellido: "  + p5.getNombres() + " "+p5.getApellidos() + " | identificado con el numero de documento: " + p5.getNumeroDocumento() + " "+ p5.getTipoDocumento() + " | con el correo: " + p5.getCorreoElectronico() + " |  con numero telefonico:  " + p5.getCelular() + " |  con fecha de nacimiento:  " + p5.getFechaNacimientoDate() + " |  con altura:  " + p5.getAltura() + " |  con peso:  " + p5.getPeso()  + " |  con tipo de sangre  " + p5.getTipoSangre() + p5.getFactorRH());

       Enfermero e1 = new Enfermero(8, "Danner", "Arias", TipoDocumento.CC, 8213789213L);
       Enfermero e2 = new Enfermero(9, "Julian", "Mondongo", TipoDocumento.TI, 9732647932L);
       Enfermero e3 = new Enfermero(10, "Daniel", "Gallo", TipoDocumento.PPT, 983274893);

       System.out.println("id del enfermero: " + e1.getId()+" | con nombre y apellido: " +e1.getNombres()+" "+e1.getApellidos() + " | identificado con el numero de documento: "  +e1.getNumeroDocumento() +" "+ e1.getTipoDocumento());
       System.out.println("id del enfermero: " + e2.getId()+" | con nombre y apellido: " +e2.getNombres()+" "+e2.getApellidos() + " | identificado con el numero de documento: "  +e2.getNumeroDocumento() +" "+ e2.getTipoDocumento());
       System.out.println("id del enfermero: " + e3.getId()+" | con nombre y apellido: " +e3.getNombres()+" "+e3.getApellidos() + " | identificado con el numero de documento: "  +e3.getNumeroDocumento() +" "+ e3.getTipoDocumento());

       Consultorio c1 = new Consultorio(11, " calle 123 ", 11 );
       Consultorio c2 = new Consultorio(12, " calle 433 ", 32 );
       Consultorio c3 = new Consultorio(13, " calle 563 ", 16 );

       citaMedico cm1 = new citaMedico(14, LocalDateTime.now(), c1 , p1 , m1 , EstadoCita.AGENDADA);
       citaMedico cm2 = new citaMedico(15, LocalDateTime.now(),c2, p2 , m2, EstadoCita.AGENDADA);

       e1.addProcedure("aplicar inyecciones");
              e2.addProcedure("vacuna");
              e3.addProcedure("limpiesa");

       System.out.println("id de la cita medico: " + cm1.getId()+ " " +" |  con fecha: " + cm1.getFecha()+" | en el consultorio: "+ c1.getNumero() + " | el estado de sus cita es: " + cm1.getEstado()+" nombre del paciente: " + p1.getNombres() + " " + p1.getApellidos() +" nombre del medico: " + m1.getNombres() + "" + m1.getApellidos() +" motivo cita: "+ p1.getMotivo());
       System.out.println("id de la cita medico: " + cm2.getId()+ " " +" |  con fecha: " + cm2.getFecha()+" | en el consultorio: "+ c2.getNumero() + " | el estado de sus cita es: " + cm2.getEstado()+" nombre del paciente: " + p2.getNombres() + " " + p2.getApellidos() +" nombre del medico: " + m2.getNombres() + "" + m2.getApellidos() +" motivo cita: "+ p2.getMotivo());

       CitaEnfermero ce1 = new CitaEnfermero(16, LocalDateTime.now(), c3, p3 , e1 , EstadoCita.AGENDADA);
       CitaEnfermero ce2 = new CitaEnfermero(17, LocalDateTime.now(), c2, p4 , e2 , EstadoCita.CANCELADA);

       ce1.cancelarCita();

       System.out.println("id de la cita enfermero: " + ce1.getId()+ " " +" |  con fecha: " + ce1.getFecha()+" | en el consultorio: "+ c3.getNumero() + " | el estado de sus cita es: " + ce1.getEstado()+" nombre del paciente: " + p3.getNombres() + " " + p3.getApellidos() +" nombre del enfermero: " + e1.getNombres() + "" + e1.getApellidos() +e1.getProcedimientos());

       System.out.println("id de la cita enfermero: " + ce2.getId()+ " " +" |  con fecha: " + ce2.getFecha()+" | en el consultorio: "+ c2.getNumero() + " | el estado de sus cita es: " + ce2.getEstado()+" nombre del paciente: " + p4.getNombres() + " " + p4.getApellidos() +" nombre del enfermero: " + e2.getNombres() + "" + e2.getApellidos() +e2.getProcedimientos());

}      
}      