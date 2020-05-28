package principalparcial;

import java.util.Scanner;
public class PrincipalParcial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese fecha del folleto: ");
        String fecha=sc.nextLine();
        System.out.println("Ingrese la cantidad de ofertas en el folleto: ");
        int tamanio=sc.nextInt();
        Folleto folleto=new Folleto(fecha,tamanio);
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese numero de productos: ");
            int numProd=sc.nextInt();
            System.out.println("Ingrese el nombre del producto: ");
            String nomProd=sc.nextLine();
            sc.nextLine();
            System.out.println("Ingrese el precio regular: ");
            double preReg=sc.nextDouble();
            System.out.println("Ingrese el precio de la oferta: ");
            double preOfer=sc.nextDouble();
            System.out.println("Ingrese duración de la oferta: ");
            int dur=sc.nextInt();
            System.out.println("Ingrese el stock: ");
            int stock=sc.nextInt();
            
            Oferta oferta=new Oferta(numProd,nomProd,preReg,preOfer,dur,stock);
            
            folleto.agregarOferta(oferta);
        }
        System.out.print("Ofertas con más de 5 dias de vigencia: "+folleto.cantidadArtMas5());
        System.out.print("Total de stock: "+folleto.cantTotalUnidades());
        System.out.print("Productos con descuentos superior a 20: "+folleto.cantidadArtOfre20());
        System.out.print("Ingrese código del producto para calcular el total recaudado: ");
        int codigo=sc.nextInt();
        System.out.print("Total recaudado por el producto con numero igual a "+codigo+": "+folleto.totalRecaudacion(codigo));
        double[] recaudacion =new double[(folleto.recaudacionTotal().length)];
        for (int i = 0; i < recaudacion.length; i++) {
            recaudacion[i]=folleto.recaudacionTotal()[i];
        }
        for (int i = 0; i < recaudacion.length; i++) {
            System.out.println(recaudacion[i]);
        }
    }
    
}
