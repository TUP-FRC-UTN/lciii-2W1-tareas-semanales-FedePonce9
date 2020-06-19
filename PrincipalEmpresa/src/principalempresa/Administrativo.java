package principalempresa;

public class Administrativo extends Empleado {

    private boolean presentismo;

    public Administrativo(boolean presentismo, int legajo, String nombre, float sueldoBasico) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }
    
    @Override
    public float calcularSueldo(){
        float montoCobrar = 0;
        if(presentismo){
            montoCobrar = sueldoBasico*1.13f;//o double montoCobrar (sueldoBasico*0.13)+sueldobasico
        }
        else{
            montoCobrar = sueldoBasico;
        }
        return montoCobrar;
    }

    @Override
    public String toString() {
        if(presentismo){
            return super.toString()+"Administrativo{" + "presentismo=" + "Si tuvo presentismo" +"Monto a cobrar: "+this.calcularSueldo() +'}';
        }else{
            return super.toString()+"Administrativo{" + "presentismo=" + "No tuvo presentismo" +"Monto a cobrar: "+this.calcularSueldo() +'}';
        }
        
    }
    
    
}
