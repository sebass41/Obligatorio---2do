
package logica;


public class Articulo {
    private int numArticulo, stock, cantArticulo,fechaPago; //Se crean los atríbutos que son tipo enteros 
    private String nombFabricante;  //Se crean los atríbutos que son cadenas de texto

    //Encapsulamos los atributos
    public int getNumArticulo() {
        return numArticulo;
    }

    public void setNumArticulo(int numArticulo) {
        this.numArticulo = numArticulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCantArticulo() {
        return cantArticulo;
    }

    public void setCantArticulo(int cantArticulo) {
        this.cantArticulo = cantArticulo;
    }

    public int getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(int fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getNombFabricante() {
        return nombFabricante;
    }

    public void setNombFabricante(String nombFabricante) {
        this.nombFabricante = nombFabricante;
    }
    
    
}
