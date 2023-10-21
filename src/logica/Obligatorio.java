
package logica;

import UGI.jfPrincipal;
import UGI.Registro;
import persistencia.Conexión;


public class Obligatorio {


    public static void main(String[] args) {
        jfPrincipal inisio = new jfPrincipal();
        Registro registro = new Registro();
        inisio.setVisible(true);
        registro.setVisible(true);
        
        System.out.println("Hola mundo");
       
    }
    
}
