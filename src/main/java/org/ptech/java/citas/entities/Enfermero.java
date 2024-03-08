package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

import java.util.ArrayList;
import java.util.List;


public class Enfermero extends Usuario{

private List<String> procedimientos;

@Override
public String toString() {
    return "Enfermero [procedimientos=" + procedimientos + "]";
}



    public Enfermero(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, long numeroDocumento) {

        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);

        this.procedimientos = new ArrayList<String>();

    }
    

public void addProcedure(String procedure){
    //añadir el string procedimiento a la lista procedimiento
    this.procedimientos.add(procedure);
}


public List<String> getProcedimientos() {
    return procedimientos;
}






}
