package principal3;

public class Jugador {
   private String nombre;
   private int posicion,num_ca,cantPartJuga,porcEst;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNum_ca() {
        return num_ca;
    }

    public void setNum_ca(int num_ca) {
        this.num_ca = num_ca;
    }

    public int getCantPartJuga() {
        return cantPartJuga;
    }

    public void setCantPartJuga(int cantPartJuga) {
        this.cantPartJuga = cantPartJuga;
    }
    
    public int getPorcEst() {
        return porcEst;
    }

    public void setPorcEst(int porcEst) {
        this.porcEst = porcEst;
    }

    public Jugador(String nombre, int posicion, int num_ca, int cantPartJuga, int porcEst) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.num_ca = num_ca;
        this.cantPartJuga = cantPartJuga;
        this.porcEst = porcEst;
    }
    public Jugador() {
        nombre="";
        posicion=0;
        num_ca=0;
        cantPartJuga=0;
        porcEst=0;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", num_ca=" + num_ca + ", cantPartJuga=" + cantPartJuga + ", porcEst=" + porcEst + '}';
    }
    

}
