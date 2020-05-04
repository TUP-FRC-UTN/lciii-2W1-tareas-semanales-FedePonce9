package programaequipoej1;

import java.util.Scanner;

public class ProgramaEquipoEj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Jugador[] equipo;
        System.out.println("Ingrese la cantidad de jugadores: ");
        
        int cantidad=sc.nextInt();
        
        equipo= new Jugador[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del jugador " + i + ":");
            sc.nextLine();
            String nombre = sc.nextLine();
            System.out.print("Ingrese la posicion del jugador " + i + ":");
            int posicion = sc.nextInt();
            
            System.out.print("Ingrese el Número de camiseta del jugador " + i + ":");
            int nroCamiseta = sc.nextInt();
            
            System.out.print("Ingrese la cantidad de part jugados del jugador " + i + ":");
            int cantPartJugados = sc.nextInt();
            
            System.out.print("Ingrese el porcentaje del estado fisico del jugador " + i + ":");
            int estadoFisico = sc.nextInt();
            
            equipo[i] = new Jugador(nombre, posicion, nroCamiseta, cantPartJugados, estadoFisico);
        }
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
        }
        
        int cantMenos10Partidos = 0;
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getCantPartJugados()<10)
            {
                cantMenos10Partidos++;
            }
            
        }
        System.out.println("Jugadores con menos de 10 partidos jugados: " + cantMenos10Partidos);
        
        Jugador jugadorMasPart = equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getCantPartJugados()>jugadorMasPart.getCantPartJugados())
            {
                 jugadorMasPart= equipo[i];
                        
            }
        }
        int acumPorcEstFis = 0, contEstFis = 0;
        for (int i = 0; i < equipo.length; i++) {
            acumPorcEstFis += equipo[i].getEstadoFisico();
            contEstFis++;
        }
        double promEstFis = (double)acumPorcEstFis / contEstFis;
        System.out.println("El promedio del estado físico de todo el equipo es de: " + promEstFis + "%");
        
        System.out.println("El jugador con mas partidos jugados es: " + jugadorMasPart);
        
        System.out.println("Ingrese el nro de camiseta del jugador: ");
        int nroCamiseta = sc.nextInt();
        
        Jugador jug = equipo[0];
        
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getNroCamiseta() == nroCamiseta)
            {
                jug = equipo[i];
                break;
            }
        }
        
        System.out.println("Estado fisico de ese jugador es de: " + jug.getEstadoFisico() + "%");
        
        int contPos1=0,contPos2=0,contPos3=0,contPos4=0,acumPos1=0,acumPos2=0,acumPos3=0,acumPos4=0;
        
        for (int i = 0; i < equipo.length; i++) {
            switch(equipo[i].getPosicion())
            {
                case 1: contPos1++;
                    acumPos1+=contPos1;
                    break;
                case 2: contPos2++;
                    acumPos2+=contPos2;
                    break;
                case 3:contPos3++;
                    acumPos3+=contPos3;
                    break;
                case 4:contPos4++;
                    acumPos4+=contPos4;
                    break;
            }
        }
        double promPos1=(double)acumPos1/contPos1;
        double promPos2=(double)acumPos2/contPos2;
        double promPos3=(double)acumPos3/contPos3;
        double promPos4=(double)acumPos4/contPos4;
        System.out.println("Promedio de partidos jugados por los Arqueros : " + promPos1);
        System.out.println("Promedio de partidos jugados por los Defensores : " + promPos2);
        System.out.println("Promedio de partidos jugados por los Medio Campistas : " + promPos3);
        System.out.println("Promedio de partidos jugados por los Delanteros : " + promPos4);
        
    }
}
