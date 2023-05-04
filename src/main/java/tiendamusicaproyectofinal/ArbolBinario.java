
package tiendamusicaproyectofinal;

public class ArbolBinario <T extends Comparable<T>> {

    private NodoBinario<T> raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void insertar(T dato) {
        if (raiz == null) {
            raiz = new NodoBinario<>(dato);
        } else {
            insertarAux(raiz, dato);
        }
    }

    private void insertarAux(NodoBinario<T> nodo, T dato) {
        if (dato.compareTo(nodo.getDato()) < 0) {
            if (nodo.getIzquierdo() == null) {
                nodo.setIzquierdo(new NodoBinario<>(dato));
            } else {
                insertarAux(nodo.getIzquierdo(), dato);
            }
        } else {
            if (nodo.getDerecho() == null) {
                nodo.setDerecho(new NodoBinario<>(dato));
            } else {
                insertarAux(nodo.getDerecho(), dato);
            }
        }
    }

    public NodoBinario<T> buscar(T dato) {
        return buscarAux(raiz, dato);
    }

    private NodoBinario<T> buscarAux(NodoBinario<T> nodo, T dato) {
        if (nodo == null) {
            return null;
        }
        if (dato.compareTo(nodo.getDato()) == 0) {
            return nodo;
        }
        if (dato.compareTo(nodo.getDato()) < 0) {
            return buscarAux(nodo.getIzquierdo(), dato);
        } else {
            return buscarAux(nodo.getDerecho(), dato);
        }
    }
}
