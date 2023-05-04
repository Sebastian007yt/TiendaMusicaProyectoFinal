
package tiendamusicaproyectofinal;


   
      public class NodoCircular<T> {
    T elemento;
    NodoCircular<T> siguiente;

    public NodoCircular(T elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    public T getElemento() {
        return elemento;
    }

    public NodoCircular<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular<T> siguiente) {
        this.siguiente = siguiente;
    }
}
        /*
  public class NodoCircular {
     Cancion cancion;
     NodoCircular siguiente;

    public NodoCircular(Cancion cancion) {
        this.cancion = cancion;
        this.siguiente = null;
    }
/////////////////////////////////
   public class NodoCircular<T> {
      T valor;
         NodoCircular<T> siguiente;

        public NodoCircular(T valor) {
            this.valor = valor;
            this.siguiente = null;
        }
}
        */
    
