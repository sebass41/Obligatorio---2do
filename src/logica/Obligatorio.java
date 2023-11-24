
package logica;

import UGI.jfPrincipal;
import UGI.jfInicioSesion;
import com.formdev.flatlaf.FlatDarkLaf;
import persistencia.Modificar;

public class Obligatorio {


    public static void main(String[] args) {      
        FlatDarkLaf.setup();
        jfInicioSesion registro = new jfInicioSesion();
        registro.setVisible(true);
}
    
}
