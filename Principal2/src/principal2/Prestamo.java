package principal2;

public class Prestamo {
    private String solicitante;
    private int cantidadDias;
    private boolean devuelto;

    public String getSolicitante() {
        return solicitante;
    }
    public boolean getDevuelto(){
        return this.devuelto;
    }
    public int getCantidadDias(){
        return this.cantidadDias;
    }
    
    public Prestamo(String solicitante, int cantidadDias, boolean devuelto) {
        this.solicitante = solicitante;
        this.cantidadDias = cantidadDias;
        this.devuelto = devuelto;
    }
}
