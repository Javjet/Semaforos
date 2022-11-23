package org.example;

import java.util.Arrays;

public class ConexionSemaforos {
    private String[] a_Conexiones;
    private int a_NumConexiones;
    public ConexionSemaforos(int a_NumConexiones){
        a_Conexiones=new String[a_NumConexiones];
        Arrays.fill(a_Conexiones,"Amarillo");
    }

    public String[] getA_Conexiones() {
        return a_Conexiones;
    }

    public void setA_Conexiones(String[] a_Conexiones) {
        this.a_Conexiones = a_Conexiones;
    }
}
