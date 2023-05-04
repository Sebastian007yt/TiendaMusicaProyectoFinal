
package tiendamusicaproyectofinal;


public class ListaDobleEnlazada<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public void insertarInicio(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = ultimo = nuevoNodo;
        } else {
            nuevoNodo.siguiente = primero;
            primero.anterior = nuevoNodo;
            primero = nuevoNodo;
        }
    }

    public void insertarFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            primero = ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.anterior = ultimo;
            ultimo = nuevoNodo;
        }
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public int contarElementos() {
        int contador = 0;
        Nodo<T> nodoActual = primero;
        while (nodoActual != null) {
            contador++;
            nodoActual = nodoActual.siguiente;
        }
        return contador;
    }

    public T obtenerPrimero() {
        return estaVacia() ? null : primero.dato;
    }

    public T obtenerUltimo() {
        return estaVacia() ? null : ultimo.dato;
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= contarElementos()) {
            return null;
        }
        Nodo<T> nodoActual = primero;
        for (int i = 0; i < indice; i++) {
            nodoActual = nodoActual.siguiente;
        }
        return nodoActual.dato;
    }
}