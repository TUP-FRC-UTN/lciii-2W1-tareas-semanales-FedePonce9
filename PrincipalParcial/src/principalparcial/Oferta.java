package principalparcial;

public class Oferta {
    private int numeroDelProducto,cantidadDiasOferta,stock;
    private String nombreDelProducto;
    private double precioRegular,precioOferta;

    public int getNumeroDelProducto() {
        return numeroDelProducto;
    }

    public void setNumeroDelProducto(int numeroDelProducto) {
        this.numeroDelProducto = numeroDelProducto;
    }

    public int getCantidadDiasOferta() {
        return cantidadDiasOferta;
    }

    public void setCantidadDiasOferta(int cantidadDiasOferta) {
        this.cantidadDiasOferta = cantidadDiasOferta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public Oferta(int numeroDelProducto,String nombreDelProducto,double precioRegular, double precioOferta, int cantidadDiasOferta, int stock) {
        this.numeroDelProducto=numeroDelProducto;
        this.nombreDelProducto=nombreDelProducto;
        this.precioRegular=precioRegular;
        this.precioOferta=precioOferta;
        this.cantidadDiasOferta=cantidadDiasOferta;
        this.stock=stock;
    }
    

    @Override
    public String toString() {
        return "Oferta{" + "numeroDelProducto=" + numeroDelProducto + ", cantidadDiasOferta=" + cantidadDiasOferta + ", stock=" + stock + ", nombreDelProducto=" + nombreDelProducto + ", precioRegular=" + precioRegular + ", precioOferta=" + precioOferta + '}';
    }
    
    
}
