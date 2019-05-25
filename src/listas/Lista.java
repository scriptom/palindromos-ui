/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

public class Lista {
    
    private Nodo cabeza;
    
    private int tamaño = 0;

    public int getTamaño() {
        return tamaño;
    }

    public Lista(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Lista() {
    }
    
    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    public Nodo getLastNodo() {
        Nodo actual = cabeza;
        while ( actual != null && actual.getProx() != null ) {
            actual = actual.getProx();
        }
        
        return actual;
    }
    
    public boolean estaVacia() {
        return cabeza == null;
    }
    
    public Nodo getNodo(int indice) {
        if (estaVacia()) 
            return null;
        
        if (indice >= tamaño) 
            return null;
        
        Nodo actual = cabeza;
        for(; indice > 0; indice--)
            actual = actual.getProx();
        
        return actual;
    }
    
    public void insertar(Nodo nuevo) {
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            getLastNodo().setProx(nuevo);
        }
        tamaño++;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tamaño; i++) {
            stringBuilder.append(getNodo(i).getValor());
        }
        return stringBuilder.toString();
    }
}
