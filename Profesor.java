
package Persona;

import Persona.Empleado;
import java.util.Date;

public class Profesor extends Empleado {
    
    public Profesor () {}
     
    public Profesor (double salario, Date fechaEntrega,String nombre,String direccion,String telefono,
                   String email){
                super (salario,fechaEntrega,nombre,direccion,telefono,email);

    } 
}
