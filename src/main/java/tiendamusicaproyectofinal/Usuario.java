
package tiendamusicaproyectofinal;

import java.io.Serializable;


public class Usuario implements Serializable {
    
  private String username;
    private String contraseña;
    private String email;
    private ListaCircular<Cancion> canciones;

    public Usuario(String username, String contraseña, String email) {
        this.username = username;
        this.contraseña = contraseña;
        this.email = email;
        this.canciones = new ListaCircular<>();
    }

    // Getters y setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ListaCircular<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ListaCircular<Cancion> canciones) {
        this.canciones = canciones;
    }
     public void agregarCancion(Cancion cancion) {
        this.canciones.agregarCancion(cancion);
    }

    public void eliminarCancion(Cancion cancion) {
        this.canciones.eliminarCancion(cancion);
    }

    public boolean buscarCancion(Cancion cancion) {
        return this.canciones.buscarCancion(cancion);
    }

    public void imprimirCanciones() {
        this.canciones.imprimirListaCanciones();
    }
}
