
package veterinaria;

public class Veterinaria {
    private Cliente[] cliente;
    
    public Veterinaria(int cantidad){
        cliente=new Cliente[cantidad];
    }
    
    public void agregarCliente(Cliente c){
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i]==null) {
                
                cliente[i]=c;
                break;
            }
        }
    }
    public int cantidadClientes(){
        int cantidad_clientes=0;
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i]!=null) {
                
                cantidad_clientes++;
            }
        }
        return cantidad_clientes;
    }
    public double promedioEdadMascotas(){
        double sumaEdades=0;
        int contador_masc=0;
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i]!=null) {
                
                sumaEdades+=cliente[i].getEdad_mascota();
                contador_masc++;
            }
        }
        double promEdad=sumaEdades/contador_masc;
        return promEdad;
    } 
    public int cantidadClientesMayorAnti(){
        int contadorAnti=0;
        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i]!=null) {
                if (cliente[i].getAntiguedad()>=5) {
                    
                    contadorAnti++;
                }
            }
        }
        return contadorAnti;
    }
    
}
