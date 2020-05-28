package principal4;

import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la descripción del producto: ");
        String descripcion=sc.nextLine();
        
        System.out.print("Ingrese la cantidad de materiales que posee el producto: ");
        int tamanio=sc.nextInt();
        
        Producto prod=new Producto(descripcion,tamanio);
        
        for (int i = 0; i < prod.materiales.length; i++) {
            System.out.print("Ingrese descripción del material: ");
            sc.nextLine();
            String desc=sc.nextLine();
            System.out.print("Ingrese el código del material: ");
            int cod_mat=sc.nextInt();
            System.out.print("Ingrese el precio unitario del material: ");
            float pre_mat=sc.nextFloat();
            
            Material m=new Material(desc,cod_mat,pre_mat);
            prod.agregarMaterial(m);
        }
        System.out.println(prod.toString());
        System.out.println("El costo es: "+prod.costoTotal());
        System.out.println("Ingrese el codigo del material a buscar: ");
        int codigo=sc.nextInt();
        if (prod.formaParte(codigo)) {
            System.out.println("Existe ese material en el producto");
        }else{
            System.out.println("Ese material no existe en este producto");
        }
        System.out.println("Ingrese un monto limite para el valor del material: ");
        float limit_mat=sc.nextFloat();
        Material menoresLimit[]=prod.menorLimite(limit_mat);
        for (int i = 0; i < menoresLimit.length; i++) {
            if (menoresLimit[i]!=null) {
                System.out.println(menoresLimit[i].toString());
            }else{
                break;
            }
        }
        int[] cantidad;
        cantidad=prod.cantidadPorPrecio();
        System.out.println("La cantidad de materiales con valor de $0 a $10 es: "+cantidad[0]);
        System.out.println("La cantidad de materiales con valor de $10 a $20 es: "+cantidad[1]);
        System.out.println("La cantidad de materiales con valor de $20 a $30 es: "+cantidad[2]);
        System.out.println("La cantidad de materiales con valor mayor a $30 es: "+cantidad[3]);
        
    }
    
}
