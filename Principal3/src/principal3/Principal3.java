package principal3;
import java.util.Scanner;
public class Principal3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            
            System.out.print("Ingrese nombre del Equipo: ");
            String nom_equip=sc.nextLine();
            System.out.print("Ingrese puntos obtenidos: ");
            int puntos_obt=sc.nextInt();
            System.out.print("Ingrese Cantidad de Partidos Ganados: ");
            int partGanados=sc.nextInt();
            System.out.print("Ingrese Cantidad de Partidos Empatados: ");
            int partEmpatados=sc.nextInt();
            System.out.print("Ingrese Cantidad de Partidos Perdidos: ");
            int partPerdidos=sc.nextInt();
            System.out.print("Ingrese Cantidad de goles anotados: ");
            int golesA=sc.nextInt();
            System.out.print("Ingrese Cantidad de goles recibidos: ");
            int golesR=sc.nextInt();
            System.out.print("Ingrese su Posición en la tabla: ");
            int posTabla=sc.nextInt();
            Equipo e = new Equipo(nom_equip,puntos_obt,partGanados,partEmpatados,partPerdidos,golesA,golesR,posTabla);
            
        System.out.print("Ingrese la cantidad de jugadores del equipo: ");
        int tamanio=sc.nextInt();
        Equipo equ=new Equipo(tamanio);
        
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese nombre del Jugador: ");
            sc.nextLine();
            String nom_jug=sc.nextLine();
            System.out.print("Ingrese posicion del Jugador(1: arquero, 2: defensor, 3: mediocampo, 4: delantero): ");
            int pos_jug=sc.nextInt();
            System.out.print("Ingrese el numero de camiseta del Jugador: ");
            int num_ca=sc.nextInt();
            System.out.print("Ingrese cantidad de partidos jugados: ");
            int cantPart=sc.nextInt();
            System.out.print("Ingrese Porcentaje de estado del Jugador(100 equivale a un jugador sano y 0 a uno imposibilitado de jugar por lesiones: ");
            int porcent_jug=sc.nextInt();
            Jugador j=new Jugador(nom_jug,pos_jug,num_ca,cantPart,porcent_jug);
            e.agregarJugador(j);
        }
        System.out.println("La Cantidad de jugadores con menos de 10 partidos jugados: "+e.menos10Part());
        System.out.println("Nombre del jugador con mayor cantidad de partidos jugados: "+equ.jugadorMasPart());
        System.out.println("Promedio de estado físico de todo el equipo: "+equ.promEstado());
        System.out.println("Ingrese el número de camiseta del jugador que desea obtener su estado físico: ");
        int num_cam_jug=sc.nextInt();
        equ.buscarPorCamiseta(num_cam_jug);
        System.out.println("Promedio de partidos jugados de los arqueros: "+equ.promJugArq());
        System.out.println("Promedio de partidos jugados de los defensores: "+equ.promDef());
        System.out.println("Promedio de partidos jugados de los medio campistas: "+equ.promMed());
        System.out.println("Promedio de partidos jugados de los delanteros: "+equ.promAtac());
    }
    
}
