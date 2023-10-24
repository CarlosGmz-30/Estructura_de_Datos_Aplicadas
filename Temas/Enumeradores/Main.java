package Enumeradores;

import Enumeradores.EnumPrueba.Dias;

public class Main {

    enum coloresPrimarios {
        ROJO,
        AZUL,
        AMARILLO
    }

    public static void main(String[] args) {

        Dias hoy = Dias.MIERCOLES;

        switch (hoy) {
            case LUNES:
                System.out.println("Hoy es un día pesado");
                break;
            case MARTES:
                System.out.println("Martes 2x1");
                break;
            case MIERCOLES:
                System.out.println("Ombliguito de semana");
                break;
            case JUEVES:
                System.out.println("Ya casi es viernes");
                break;
            case VIERNES:
                System.out.println("Ya es viernes");
                break;
            case SABADO:
                System.out.println("Inicia fin de semana");
                break;
            case DOMINGO:
                System.out.println("El peor día de la semana");
                break;
        }

        coloresPrimarios color = coloresPrimarios.AMARILLO;
        System.out.println(color);
    }
}