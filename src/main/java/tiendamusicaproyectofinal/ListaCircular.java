
package tiendamusicaproyectofinal;

public class ListaCircular<T> {
    private NodoCircular<T> primero;
    private NodoCircular<T> ultimo;
    private int tamaño;

    public ListaCircular() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public void agregarCancion(T cancion) {
        NodoCircular<T> nuevoNodo = new NodoCircular<>(cancion);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.siguiente = primero;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
            ultimo.siguiente = primero;
        }
        tamaño++;
    }

    public void eliminarCancion(T cancion) {
        if (primero == null) {
            return;
        }
        NodoCircular<T> nodoActual = primero;
        NodoCircular<T> nodoAnterior = null;
        do {
            if (nodoActual.elemento.equals(cancion)) {
                if (nodoActual == primero) {
                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                } else if (nodoActual == ultimo) {
                    ultimo = nodoAnterior;
                    ultimo.siguiente = primero;
                } else {
                    nodoAnterior.siguiente = nodoActual.siguiente;
                }
                tamaño--;
                return;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        } while (nodoActual != primero);
    }

    public boolean buscarCancion(T cancion) {
        if (primero == null) {
            return false;
        }
        NodoCircular<T> nodoActual = primero;
        do {
            if (nodoActual.elemento.equals(cancion)) {
                return true;
            }
            nodoActual = nodoActual.siguiente;
        } while (nodoActual != primero);
        return false;
    }

    public void imprimirListaCanciones() {
        if (primero == null) {
            System.out.println("La lista está vacía");
        } else {
            NodoCircular<T> actual = primero;
            do {
                System.out.println(actual.elemento);
                actual = actual.siguiente;
            } while (actual != primero);
        }
    }
}


    /*
     private NodoCircular primero;
    private NodoCircular ultimo;
    private int tamaño;

    public ListaCircular() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public void agregarCancion(Cancion cancion) {
        NodoCircular nuevoNodo = new NodoCircular(cancion);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.setSiguiente(primero);
        } else {
            ultimo.setSiguiente(nuevoNodo);
            ultimo = nuevoNodo;
            ultimo.setSiguiente(primero);
        }
        tamaño++;
    }

    public void eliminarCancion(Cancion cancion) {
        if (primero == null) {
            return;
        }
        NodoCircular nodoActual = primero;
        NodoCircular nodoAnterior = null;
        do {
            if (nodoActual.getCancion().equals(cancion)) {
                if (nodoActual == primero) {
                    primero = primero.getSiguiente();
                    ultimo.setSiguiente(primero);
                } else if (nodoActual == ultimo) {
                    ultimo = nodoAnterior;
                    ultimo.setSiguiente(primero);
                } else {
                    nodoAnterior.setSiguiente(nodoActual.getSiguiente());
                }
                tamaño--;
                return;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSiguiente();
        } while (nodoActual != primero);
    }

    public boolean buscarCancion(Cancion cancion) {
        if (primero == null) {
            return false;
        }
        NodoCircular nodoActual = primero;
        do {
            if (nodoActual.getCancion().equals(cancion)) {
                return true;
            }
            nodoActual = nodoActual.getSiguiente();
        } while (nodoActual != primero);
        return false;
    }

    public void imprimirLista() {
        if (primero == null) {
            System.out.println("La lista está vacía");
        } else {
            NodoCircular actual = primero;
            do {
                System.out.println(actual.getCancion());
                actual = actual.getSiguiente();
            } while (actual != primero);
        }
    }
    /////////////////////////////////////
    public class ListaCircular {
    private NodoCircular primero;
    private NodoCircular ultimo;
    private int tamaño;

    public ListaCircular() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public void agregarCancion(Cancion cancion) {
        NodoCircular nuevoNodo = new NodoCircular(cancion);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.siguiente = primero;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
            ultimo.siguiente = primero;
        }
        tamaño++;
    }

    public void eliminarCancion(Cancion cancion) {
        if (primero == null) {
            return;
        }
        NodoCircular nodoActual = primero;
        NodoCircular nodoAnterior = null;
        do {
            if (nodoActual.cancion.equals(cancion)) {
                if (nodoActual == primero) {
                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                } else if (nodoActual == ultimo) {
                    ultimo = nodoAnterior;
                    ultimo.siguiente = primero;
                } else {
                    nodoAnterior.siguiente = nodoActual.siguiente;
                }
                tamaño--;
                return;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        } while (nodoActual != primero);
    }

    public boolean buscarCancion(Cancion cancion) {
        if (primero == null) {
            return false;
        }
        NodoCircular nodoActual = primero;
        do {
            if (nodoActual.cancion.equals(cancion)) {
                return true;
            }
            nodoActual = nodoActual.siguiente;
        } while (nodoActual != primero);
        return false;
    }

    public void imprimirLista() {
        if (primero == null) {
            System.out.println("La lista está vacía");
        } else {
            NodoCircular actual = primero;
            do {
                System.out.println(actual.cancion);
                actual = actual.siguiente;
            } while (actual != primero);
        }
    }
}
////////////////////////////////
public class ListaCircular<T> {
    private NodoCircular<T> primero;
    private NodoCircular<T> ultimo;
    private int tamaño;

    public ListaCircular() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public void agregarCancion(Cancion cancion) {
        NodoCircular<> nuevoNodo = new NodoCircular<>(cancion);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.siguiente = primero;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
            ultimo.siguiente = primero;
        }
        tamaño++;
    }

    public void eliminarCancion(Cancion cancion) {
        if (primero == null) {
            return;
        }
        NodoCircular<T> nodoActual = primero;
        NodoCircular<T> nodoAnterior = null;
        do {
            if (nodoActual.cancion.equals(cancion)) {
                if (nodoActual == primero) {
                    primero = primero.siguiente;
                    ultimo.siguiente = primero;
                } else if (nodoActual == ultimo) {
                    ultimo = nodoAnterior;
                    ultimo.siguiente = primero;
                } else {
                    nodoAnterior.siguiente = nodoActual.siguiente;
                }
                tamaño--;
                return;
            }
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        } while (nodoActual != primero);
    }

    public boolean buscarCancion(Cancion cancion) {
        if (primero == null) {
            return false;
        }
        NodoCircular<T> nodoActual = primero;
        do {
            if (nodoActual.cancion.equals(cancion)) {
                return true;
            }
            nodoActual = nodoActual.siguiente;
        } while (nodoActual != primero);
        return false;
    }

    public void imprimirLista() {
        if (primero == null) {
            System.out.println("La lista está vacía");
        } else {
            NodoCircular<T> actual = primero;
            do {
                System.out.println(actual.cancion);
                actual = actual.siguiente;
            } while (actual != primero);
        }
    }
}
/////////////////////////////

public class ListaCircular<T> {
    private NodoCircular<T> primero;
    private NodoCircular<T> ultimo;
    private int tamaño;

    public ListaCircular() {
        primero = null;
        ultimo = null;
        tamaño = 0;
    }

    public void agregarCancion(Cancion cancion) {
        NodoCircular<T> nuevoNodo = new NodoCircular<>(cancion);
        if (primero == null) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            nuevoNodo.siguiente = primero;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
            ultimo.siguiente = primero;
        }
        tamaño++;
    }

    // Resto del código
}
*/
