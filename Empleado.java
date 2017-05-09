
package Persona;

import java.util.Date;

public class Empleado extends Persona {
    private double salario;
    private Date fechaEntrega;
    
    public Empleado () {}
    
    public Empleado (double salario, Date fechaEntrega,String nombre,String direccion,String telefono,
                   String email ){
        super (nombre,direccion,telefono,email);
        this.salario = salario ;
        this.fechaEntrega = fechaEntrega;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
}
