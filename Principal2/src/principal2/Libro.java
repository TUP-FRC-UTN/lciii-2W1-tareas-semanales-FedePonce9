package principal2;

public class Libro {

    private String titulo;
    private int precio;
    private int estado;
    private Prestamo[] prestamos;

    public Libro(String titulo, int precio,int cantidadPrestamos) {
        this.titulo = titulo;
        this.precio = precio;
        this.estado = 1;//disponible
        this.prestamos=new Prestamo[cantidadPrestamos];
    }
    public void agregarPrestamo(Prestamo p){
        for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = p;
                break;
            }
        }
    }

    //setter para cambiar de estado
    public void cambiarEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return this.estado;
    }
    public int getPrecio(){
        return this.precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", estado=" + estado + '}';
    }

    public String getTitulo() {
        return this.titulo;
    }
    public String listadoSolicitantes(){
        String resultado="";
        //recorro lista de prestamos y devuelvo todos los solicitantes
        for (int i = 0; i < prestamos.length; i++) {
           String solicitante=prestamos[i].getSolicitante();
           resultado+=solicitante+ "-";
        }
        return resultado;
    }
    public int cantidadPrestamos(){
        return prestamos.length;
    }

}
