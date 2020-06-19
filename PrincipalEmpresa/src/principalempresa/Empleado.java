package principalempresa;

public abstract class Empleado {
    protected int legajo;
    protected String nombre;
    protected float sueldoBasico;

    public Empleado(int legajo, String nombre, float sueldoBasico) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + ", nombre=" + nombre + ", sueldoBasico=" + sueldoBasico + '}';
    }
    
    public abstract float calcularSueldo();
}
