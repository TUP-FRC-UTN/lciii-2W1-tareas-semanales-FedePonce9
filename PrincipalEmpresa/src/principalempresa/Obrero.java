package principalempresa;

public class Obrero extends Empleado {
    private int diasTrabajados;

    public Obrero(int diasTrabajados, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
    }
    
    @Override
    public float calcularSueldo(){
        float montoCobrar = (sueldoBasico / 22) * diasTrabajados;
        return montoCobrar;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Obrero{" + "diasTrabajados=" + diasTrabajados +"Monto a cobrar: "+ this.calcularSueldo() +'}';
    }
}
