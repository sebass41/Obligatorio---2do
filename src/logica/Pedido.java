package logica;

public class Pedido {
   private int numPedido, fechaPedido,cantArticulos,fechaPago;

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public int getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(int fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getCantArticulos() {
        return cantArticulos;
    }

    public void setCantArticulos(int cantArticulos) {
        this.cantArticulos = cantArticulos;
    }

    public int getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(int fechaPago) {
        this.fechaPago = fechaPago;
    } 
}
