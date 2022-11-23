package org.example;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class Semaforo implements Runnable {
    //private String[] a_Estados={"Verde","Amarillo","Rojo"};
    private String a_Estado;

    private int a_Numero;

    private static ConexionSemaforos a_ConexionSemaforos;
    private static Semaphore a_Semaforo;

    /*public String[] getA_Estados() {
        return a_Estados;
    }

    public void setA_Estados(String[] a_Estados) {
        this.a_Estados = a_Estados;
    }*/

    public String getA_Estado() {
        return a_Estado;
    }

    public void setA_Estado(String a_Estado) {
        this.a_Estado = a_Estado;
    }

    public Semaforo(Semaphore p_Semaforo,ConexionSemaforos p_ConexionSemaforos,int p_Numero){
        a_ConexionSemaforos=p_ConexionSemaforos;
        a_Numero=p_Numero;
        a_Semaforo=p_Semaforo;
        a_Estado=p_ConexionSemaforos.getA_Conexiones()[p_Numero];

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <9 ; i++) {
                
            }
            //if (a_ConexionSemaforos.getA_Conexiones())
            a_Semaforo.acquire();
            System.out.println("Estado: ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
