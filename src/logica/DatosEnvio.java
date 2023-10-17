
package logica;


public class DatosEnvio {
    private String direccion;
    private int fecha, peso, costo;

    public DatosEnvio(String direccion, int fecha, int peso, int costo) {
        this.direccion = direccion;
        this.fecha = fecha;
        this.peso = peso;
        this.costo = costo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}
