package principal2;

public class Biblioteca {

    private Libro[] libros;

    public Biblioteca(int cantidad) {
        libros = new Libro[cantidad];
    }

    public void agregarLibro(Libro a) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = a;
                break;
            }
        }
    }

    public String listadoLibros() {
        String resultado = "";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                Libro l = libros[i];
                resultado += l.toString() + "\n";
            }
        }
        return resultado;
    }

     int[] cantidadLibrosPorEstado() {
        int[] resultado = new int[3];
        int estado1 = 0, estado2 = 0, estado3 = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getEstado() == 1) {
                estado1++;
            } else if (libros[i].getEstado() == 2) {
                estado2++;
            } else {
                estado3++;
            }
        }
        resultado[0]=estado1;
        resultado[1]=estado2;
        resultado[2]=estado3;
        return resultado;
    }

    public float sumaPrecioExtraviados() {
        float suma=0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]!=null && libros[i].getEstado()==3) {
                suma+=libros[i].getPrecio();
            }
        }
        return suma;
    }

    public String listadoDeSolicitantes(String titulo) {
        //recorro libros filtro por titulo y pido el listado de su solicitantes a cada libro
        String resultado="";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]!=null && libros[i].getTitulo().equals(titulo)) {
                resultado+=libros[i].listadoSolicitantes();
            }
            
        }
        return resultado;
    }

    public float promedioPrestamos() {
        float acum=0;
        int contador=0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i]!=null) {
                acum+=libros[i].cantidadPrestamos();
            }
        }
        //asumo que se cargan todos los libros
        contador=libros.length;
        
        return acum/contador;
    }

}
