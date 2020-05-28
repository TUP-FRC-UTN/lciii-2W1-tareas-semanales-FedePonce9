package principal3;

public class Equipo {
    private String nombreEquipo;
    private int pts,partGan,partEmp,partPer,golRea,golRec,posTabla;
    private Jugador[] jugadores;
    
    public Equipo(int tamanio){
        jugadores=new Jugador[tamanio];
    }
    
    public Equipo(String nom_equip, int puntos_obt, int partGanados, int partEmpatados, int partPerdidos, int golesA, int golesR, int posTabla) {
        this.nombreEquipo=nom_equip;
        this.pts=puntos_obt;
        this.partGan=partGanados;
        this.partEmp=partEmpatados;
        this.partPer=partPerdidos;
        this.golRea=golesA;
        this.golRec=golesR;
        this.posTabla=posTabla;
        jugadores=new Jugador[0];
    }
    
    public void agregarJugador(Jugador jugador){
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i]==null) {
                jugadores[i]=jugador;
                break;
            }
        }
    }
    public int menos10Part(){
        int contMenos=0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getCantPartJuga()< 10) {
                contMenos++;
                
            }
        }
        return contMenos;
    }
    
    public String jugadorMasPart(){
        Jugador mayor= new Jugador();
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getCantPartJuga()>mayor.getCantPartJuga()) {
                mayor=jugadores[i];
            }
        }
        return mayor.toString();
    }
    public double promEstado(){
        double acum=0;
        double promedio=0;
        for (int i = 0; i < jugadores.length; i++) {
            acum+=jugadores[i].getPorcEst();
        }
        promedio= acum/jugadores.length;
        return promedio;
    }
    public Jugador buscarPorCamiseta(int nro_cam){
        Jugador banJug=null;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getNum_ca()==nro_cam) {
                banJug=jugadores[i];
                break;
            }
        }
        return banJug;
    }
    public double promJugArq(){
        int contJug1=0;
        double promedio=0,sumPart=0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getPosicion()==1) {
                contJug1++;
                sumPart+=jugadores[i].getCantPartJuga();
            }
        }if (contJug1>0) {
            promedio= sumPart/contJug1;
        }
        return promedio;
    }
    
    public double promDef(){
        int contJug2=0;
        double promedio=0,sumPart=0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getPosicion()==2) {
                contJug2++;
                sumPart+=jugadores[i].getCantPartJuga();
            }
        }if (contJug2>0) {
            promedio= sumPart/contJug2;
        }
        return promedio;
    }
    
    public double promMed(){
        int contJug3=0;
        double promedio=0,sumPart=0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getPosicion()==3) {
                contJug3++;
                sumPart+=jugadores[i].getCantPartJuga();
            }
        }if (contJug3>0) {
            promedio= sumPart/contJug3;
        }
        return promedio;
    }
    
    public double promAtac(){
        int contJug4=0;
        double promedio=0,sumPart=0;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i].getPosicion()==4) {
                contJug4++;
                sumPart+=jugadores[i].getCantPartJuga();
            }
        }if (contJug4>0) {
            promedio= sumPart/contJug4;
        }
        return promedio;
    }
    
    
    
    
}
