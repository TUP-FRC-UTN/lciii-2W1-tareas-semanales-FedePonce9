
package veterinaria;

public class Cliente {
    private int num,antiguedad,edad_mascota;
    private String nombre,nombre_mascota;

    Cliente(int num_cli, String nom_cli, int ant_cli, String nom_masc, int edad_masc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(int edad_mascota) {
        this.edad_mascota = edad_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(int num, int antiguedad, int edad_mascota, String nombre, String nombre_mascota) {
        this.num = num;
        this.antiguedad = antiguedad;
        this.edad_mascota = edad_mascota;
        this.nombre = nombre;
        this.nombre_mascota = nombre_mascota;
    }
    
    public Cliente(){
        num=0;
        antiguedad=0;
        nombre="";
        nombre_mascota="";
        edad_mascota=0;
    }
    
}
