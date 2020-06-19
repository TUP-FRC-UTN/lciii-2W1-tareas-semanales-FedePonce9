package principalempresa;

public class Vendedor extends Empleado {
    private float totalVentas;

    public Vendedor(float totalVentas, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }
    
    @Override
    public float calcularSueldo(){
        float montoCobrar = sueldoBasico + (totalVentas*0.1f);
        return montoCobrar;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Vendedor{" + "totalVentas=" + totalVentas +"Monto a cobrar:"+this.calcularSueldo() +'}';
    }
}
