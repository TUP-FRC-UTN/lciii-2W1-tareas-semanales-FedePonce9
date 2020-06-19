package principalempresa;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado>listaEmpleado;

    public Empresa() {
        this.listaEmpleado = new ArrayList();
    }
    
    public void agregarEmpleado(Empleado empleado){
        listaEmpleado.add(empleado);
    }
    
    public float sueldoTotal(){
        float sueldoTotal=0;
        for (Empleado empleado : listaEmpleado) {
            sueldoTotal+=empleado.calcularSueldo();
        }
        return sueldoTotal;
    }
    
    public float tipoSueldo(int op){
        float sueldoTotal=0;
        for (Empleado empleado : listaEmpleado) {
            float sueldo=empleado.calcularSueldo();
            if (op==1&& empleado instanceof Obrero) {
                sueldoTotal+=sueldo;
            }else if(op==2&&empleado instanceof Administrativo){
                sueldoTotal+=sueldo;
            }else if(op==3&& empleado instanceof Vendedor){
                sueldoTotal+=sueldo;
            }
        }
        return sueldoTotal;
    }
    public String empleadoMenosPago(){
        String datosEmpleado="";
        float menorSueldo=0;
        for (Empleado empleado : listaEmpleado) {
            menorSueldo=empleado.calcularSueldo();
            datosEmpleado=empleado.toString();
            break;
        }
        for (Empleado empleado : listaEmpleado) {
            if (menorSueldo>empleado.calcularSueldo()) {
                menorSueldo=empleado.calcularSueldo();
                datosEmpleado=empleado.toString();
            }
        }
        return datosEmpleado;
    }
    
    public float promedioSueldoObrero(){
        float totalSueldos=0;
        float cantidadEmpleadosObreros=0;
        for (Empleado empleado : listaEmpleado) {
            if (empleado instanceof Obrero) {
                cantidadEmpleadosObreros++;
                totalSueldos+=empleado.calcularSueldo();
            }
        }
        float promedioSueldo=totalSueldos/cantidadEmpleadosObreros;
        return promedioSueldo;
    }
    
    
}
