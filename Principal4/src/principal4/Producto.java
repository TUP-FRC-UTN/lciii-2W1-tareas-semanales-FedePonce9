package principal4;

public class Producto {
    protected String descripcion;
    protected Material[] materiales;
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public Producto(String descripcion,int tamanio) {
        this.descripcion = descripcion;
        materiales=new Material[tamanio];
    }
    
    public void agregarMaterial(Material material){
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i]==null) {
                materiales[i]=material;
                break;
            }
        }
    }
    
    public double costoTotal(){
        double acumCost=0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i]!=null) {
                acumCost+=materiales[i].getValorUnitario();
            }
            
        }
        return acumCost;
    }
    public boolean formaParte(int cod_material){
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i]!=null && materiales[i].getCodigo()==cod_material) {
                return true;
            }
        }
        return false;
    }
    public Material[] menorLimite(float limite){
        Material menoresAlLimite[]=new Material[materiales.length];
        int contMat=0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i]!=null && materiales[i].getValorUnitario()<limite) {
                menoresAlLimite[contMat]=materiales[i];
                contMat++;
            }
        }
        return menoresAlLimite;
    }
    
    public int[] cantidadPorPrecio(){
        int cantidades[]=new int[4];
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i]!=null) {
                if (materiales[i].getValorUnitario()>0 && materiales[i].getValorUnitario()<=10) {
                    cantidades[0]++;
                }else if(materiales[i].getValorUnitario()>10 && materiales[i].getValorUnitario()<=20){
                    cantidades[1]++;
                }else if (materiales[i].getValorUnitario()>20 && materiales[i].getValorUnitario()<=30) {
                    cantidades[2]++;
                }else{
                    cantidades[3]++;
                } 
            }else{
                break;
            }
        }
        return cantidades;
    }

    @Override
    public String toString() {
        
        String cadena="Producto{" + "descripcion=" + descripcion +"\nMateriales:\n" ;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i]!=null) {
                cadena+=materiales[i].toString()+"\n";
            }
        }
        return cadena;
    }
    
    
    
}
