
package tiendamusicaproyectofinal;


public class NodoBinario<T extends Comparable<T>> {
    private T dato;
    private NodoBinario<T> izquierdo;
    private NodoBinario<T> derecho;

  public NodoBinario(T dato) {
        this.dato = dato;
        izquierdo = null;
        derecho = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoBinario<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoBinario<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoBinario<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoBinario<T> derecho) {
        this.derecho = derecho;
    }

    public boolean esHoja() {
        return izquierdo == null && derecho == null;
    }
}
