
package veterinaria;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de clientes: ");
        int cant=sc.nextInt();
        
        Veterinaria v=new Veterinaria(cant);
        
        for (int i = 0; i < cant; i++) {
            
            System.out.print("Ingrese Número del cliente: ");
            int num_cli=sc.nextInt();
            
            sc.nextLine();
            System.out.print("Ingrese nombre del Cliente: ");
            String nom_cli=sc.nextLine();
            
            System.out.print("Ingrese la antiguedad del Cliente: ");
            int ant_cli=sc.nextInt();

            System.out.print("Ingrese nombre de la Mascota: ");
            sc.nextLine();
            String nom_masc=sc.nextLine();
            
            System.out.print("Ingrese edad de la Mascota: ");
            int edad_masc=sc.nextInt();
            
            
            
            Cliente c =new Cliente(num_cli,ant_cli,edad_masc,nom_cli,nom_masc);
            
            v.agregarCliente(c);
        }
        System.out.println("La cantidad de clientes es de: "+v.cantidadClientes());
        System.out.println("El promedio de edad de las mascotas es de: "+v.promedioEdadMascotas());
        System.out.println("La canatidad de clientes con mayor antiguedad a 5 años es de: "+v.cantidadClientesMayorAnti());
    }
}
