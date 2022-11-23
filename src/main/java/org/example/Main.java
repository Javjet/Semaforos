package org.example;

import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    static Semaphore a_Semaforo= new Semaphore(1);
    public static void main(String [] args){
        ThreadPoolExecutor l_Executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        ConexionSemaforos l_ConexionSemaforos=new ConexionSemaforos(2);
        Semaforo l_Semaforo1= new Semaforo(a_Semaforo,l_ConexionSemaforos,1);
        Semaforo l_Semaforo2= new Semaforo(a_Semaforo,l_ConexionSemaforos,2);
    }
}