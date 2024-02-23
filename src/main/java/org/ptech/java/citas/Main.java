package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoDocumento;
import org.ptech.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {
      //Crear un objeto medico
      //instancia un medico
      // Una manera de dar valor
      //a tributos privados en una clase
      //es a traves de el constructor 
      //parametrizado

 
        //instanciar otro medico               
        Medico m2 = new Medico(  );
        //se debe utilizar primero el setter
        //del atributo a asignar 
        m2.setNombres( "Danna");
        m2.setApellidos("Ramirez");
        m2.setNumeroDocumento(1081810878);
        m2.setTipoDocumento(TipoDocumento.TI);
        m2.setRegistroMedico(28137981273L);
        m2.setEspecialidad(Especialidad.CARDIOLOGIA);
        System.out.println("medico: "+m2.getNombres() +" "+ m2.getApellidos() +" "+ m2.getNumeroDocumento() +" "+ m2.getTipoDocumento()+" "+ m2.getRegistroMedico()+" "+ m2.getEspecialidad());


        Cita c =new Cita();

        c.setId(1);
        c.setFecha(LocalDateTime.of(2024, Month.APRIL, 2 , 7, 30, 00));

        System.out.println("fecha: "+c.getFecha());

        Consultorio Co = new Consultorio();

        Co.setDireccion("calle 26");
        Co.setNumero(291637);

        System.out.println("direccion: "+Co.getDireccion()+" "+ Co.getNumero());

        Paciente p = new Paciente(0, "andres", "suarez", TipoDocumento.TI, 1006582987L, "andres@info.com", 3002589647L, LocalDate.of(2006, Month.FEBRUARY, 10), 169.0, 70.5, TipoSangre.O, '+');

 

        System.out.println("paciente: "+p.getNombres()+" "+p.getApellidos()+" "+p.getTipoDocumento()+" "+p.getCorreoElectronico()+" "+ p.getCelular()+" "+p.getFechaNacomientoDate()+" "+p.getAltura()+" "+p.getPeso()+" "+ p.getTipoSangre()+" "+p.getFactorRH());
    }
}