package principal2;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de planes: ");
        int tamanio=sc.nextInt();
        Biblioteca bib =new Biblioteca(tamanio);
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese Título del libro: ");
            String titulo=sc.nextLine();
            System.out.print("Ingrese precio del libro: ");
            int precio=sc.nextInt();
            System.out.print("Ingrese estado del libro en número(1: disponible, 2: prestado, 3: extraviado): ");
            int estado=sc.nextInt();
            
            Libro l=new Libro(titulo,precio,estado);
            System.out.print("Ingrese cantidad de prestamos: ");
            int cantPrest=sc.nextInt();
            for (int j = 0; j < cantPrest; j++) {
                System.out.print("Ingrese solicitante del libro: ");
                String nom_sol=sc.nextLine();
                System.out.print("Ingrese cantidad de días: ");
                int cant_dias_sol=sc.nextInt();
                System.out.print("¿Fue devuelto?Ingrese true si fue devuelto o false si no fue devuelto: ");
                boolean devuelto=sc.nextBoolean();
            
                Prestamo p=new Prestamo(nom_sol,cant_dias_sol,devuelto);
                l.agregarPrestamo(p);
            }
            bib.agregarLibro(l);
        }
        
        System.out.println(bib.listadoLibros());
        System.out.println("Listado de libros por estado");
        int[] resultado=bib.cantidadLibrosPorEstado();
        //recorrido del resultado
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Libros de estado "+(i+1));
            System.out.println(resultado[i]);
        }
        
        System.out.println("Sumatoria de precio de reposición de extraviados: ");
        System.out.println(bib.sumaPrecioExtraviados());
        
        System.out.println("Listado de solicitantes por titulo es:");
        System.out.println(bib.listadoDeSolicitantes("Aaa"));
        
        System.out.println("Promedio de veces que fueron prestados los libros de la biblioteca: ");
        System.out.println(bib.promedioPrestamos());
        
    }
    
}
