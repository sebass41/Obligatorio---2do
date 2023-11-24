package logica;

import java.sql.Date;

public class Pedido {
   private int numPedido,cantArticulos, cedula, numArt;
   private Date fechaPed, fechaPago;

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getCantArticulos() {
        return cantArticulos;
    }

    public void setCantArticulos(int cantArticulos) {
        this.cantArticulos = cantArticulos;
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumArt() {
        return numArt;
    }

    public void setNumArt(int numArt) {
        this.numArt = numArt;
    }

    public Date getFechaPed() {
        return fechaPed;
    }

    public void setFechaPed(Date fechaPed) {
        this.fechaPed = fechaPed;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
    
    
}
