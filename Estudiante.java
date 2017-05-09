
package Persona;

public class Estudiante extends Persona {
    public static int status = 4;
    
    public Estudiante () {}
    
    public Estudiante (int status,String nombre,String direccion,String telefono,String email){
           super (nombre,direccion,telefono,email);
           this.status = status;
    }

    public static int getStatus() {
        return status;
    }
    public static void setStatus(int aStatus) {
        status = status;
    }
    
}
