package org.ptech.java.citas.entities;

public class Medico {
    //los atributos de una clase deben ser private
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private long numeroDocumento;
    private long registroMedico;
    private Especialidad especialidad;

    //constructor por defecto 

    public Medico() {
    }

    //constructor parametrisado

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento,
            long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }
    //Getter y setter
    //debe ser publicos
    //Firma de un Getter:
    //Tipo de dato de retorno:
    // es el t.d del atributo
    //Nombre del metodo:
    //   get seguido del nombre del nombre del atributo
    //Parametro: 0
    //retorna: 
    public String getNombres() {
        //return sirve para retonar el valor al invocante
        return this.nombres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

//sirve para asignar un valor a un atributo privado 
//Firma de un setter:
// - Tipo de dato de retorno: void 
//- Nombre: set seguido nombre del atributo 
//-Parametros: 1, input del valor a asignar al atributo 
//-Retorna:


    
   

    

}
