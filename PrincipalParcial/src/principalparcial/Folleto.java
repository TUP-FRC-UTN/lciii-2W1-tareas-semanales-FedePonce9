package principalparcial;

public class Folleto {
    private String fecha;
    private Oferta[] ofertas;
    public Folleto(String fecha,int tamanio){
        this.fecha=fecha;
        this.ofertas=new Oferta[tamanio];
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Oferta[] getOfertas() {
        return ofertas;
    }

    @Override
    public String toString() {
        return "Folleto{" + "fecha=" + fecha + ", ofertas=" + ofertas + '}';
    }
    
    public void agregarOferta(Oferta oferta){
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]==null) {
                ofertas[i]=oferta;
                break;
            }
        }
    }
    
    public int cantidadArtMas5(){
        int cant=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!=null && ofertas[i].getCantidadDiasOferta()>5) {
                cant++;
            }
        }
        return cant;
    }
    
    public double cantTotalUnidades(){
        double acum=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!=null) {
                acum+=ofertas[i].getStock();
            }
        }
        return acum;
    }
    
    public int cantidadArtOfre20(){
        int contador=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!=null && (ofertas[i].getPrecioRegular()-ofertas[i].getPrecioOferta())>20) {
                contador++;
            }
        }
        return contador;
    }
    
    public double totalRecaudacion(int cod){
        double recTotal=0;
        double recUnit=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!=null && ofertas[i].getNumeroDelProducto()==cod) {
                recUnit=ofertas[i].getPrecioOferta()*ofertas[i].getStock();
                recTotal+=recUnit;
            }
        }
        return recTotal;
    }
    public double[] recaudacionTotal(){
        double[] recUnit=new double[ofertas.length];
        int pos=0;
        for (int i = 0; i < ofertas.length; i++) {
            recUnit[pos]=ofertas[i].getPrecioOferta()*ofertas[i].getStock();
            pos++;
        }
        return recUnit;
    }
    
    
    
    
}
