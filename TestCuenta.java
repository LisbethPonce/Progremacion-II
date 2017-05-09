
package Cuenta;

import java.util.GregorianCalendar;
import Cuenta.Cuenta;

public class TestCuenta {
    
    public static void main (String [] args){
        
    Cuenta c = new Cuenta (1122, 2000, 4.5, new GregorianCalendar(1993, 31, 03).getTime());
    c.retiro (2500);
    c.deposito (3000);
    System.out.println ("EL BALANCE ES :" +c.getSaldo());
    System.out.println ("EL INTERES MENSUAL ES: " +c.getInteresMensual());
    System.out.println ("LA FECHA DE CREACION ES : " +c.getFechaCreacion());
    }
}
