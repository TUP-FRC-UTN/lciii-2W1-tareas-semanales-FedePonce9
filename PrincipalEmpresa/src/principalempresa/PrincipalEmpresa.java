package principalempresa;
import java.util.Scanner;

public class PrincipalEmpresa {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Empresa empresa=new Empresa();
        //Opcion con menú
        int op=-1;
        while(op!=0){
            System.out.println("Bienvenido al programa para añadir empleados");
            Empleado nuevoEmpleado = null;
            System.out.print("Ingrese 1 si el empleado es Obrero \n"
            +"Ingrese 2 si el empleado es Administrativo \n"
            +"Ingrese 3 si el empleado es Vendedor \n"
            +"Ingrese 0 si quiere seguir con el análisis del programa.\n");
            op=sc.nextInt();
            if (op==1) {
                System.out.print("Ingrese el legajo del Empleado: ");
                int legajo=sc.nextInt();
                System.out.print("Ingrese el nombre del Empleado: ");
                sc.nextLine();
                String nombre=sc.nextLine();
                System.out.print("Ingrese el sueldo básico del empleado; ");
                float sueldoBasico=sc.nextFloat();
                System.out.print("Ingrese los dias trabajados: ");
                int diasTrabajados=sc.nextInt();
                nuevoEmpleado=new Obrero(diasTrabajados,legajo,nombre,sueldoBasico);
            }
            if(op == 2){
                System.out.print("Ingrese el legajo del empleado: ");
                int legajo = sc.nextInt();
                System.out.print("Ingrese el nombre del empleado: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.print("Ingrese el sueldo basico: ");
                float sueldoBasico = sc.nextFloat();
                System.out.print("Ingrese 1 si tuvo presentismo o 2 si no tuvo presentismo: ");
                int Spresentismo = sc.nextInt();
                boolean presentismo = false;
                if(Spresentismo == 1){
                    presentismo = true;
                }
                
                nuevoEmpleado = new Administrativo(presentismo, legajo, nombre, sueldoBasico);
                
            }
            
            if(op == 3){
                System.out.print("Ingrese el legajo del empleado: ");
                int legajo = sc.nextInt();
                System.out.print("Ingrese el nombre del empleado: ");
                sc.nextLine();
                String nombre = sc.nextLine();
                System.out.print("Ingrese el sueldo basico: ");
                float sueldoBasico = sc.nextFloat();
                System.out.print("Ingrese el total de sus ventas: ");
                float totalVentas = sc.nextFloat();
                
                nuevoEmpleado = new Vendedor(totalVentas, legajo, nombre, sueldoBasico);
                
            }
            
            if(op == 0){
                break;
            }
            
            empresa.agregarEmpleado(nuevoEmpleado);
        }
        
        System.out.println("Ingrese el tipo de empleado del que quiere saber el sueldo: ");
        int opcionTipo = sc.nextInt();
        System.out.println(empresa.tipoSueldo(opcionTipo));
        System.out.println("El total general es de: " + empresa.sueldoTotal());
        System.out.println("Datos del empleado que menos cobra : \n"+ empresa.empleadoMenosPago());
        System.out.println("Promedio de sueldo de los obreros: " + empresa.promedioSueldoObrero());
        }
    }