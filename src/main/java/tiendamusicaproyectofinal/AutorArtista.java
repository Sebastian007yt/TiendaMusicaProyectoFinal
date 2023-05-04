
package tiendamusicaproyectofinal;

import java.io.Serializable;
import java.util.UUID;


public class AutorArtista implements Comparable<AutorArtista>, Serializable {
    
    private String codigo;
    private String nombre;
    private String nacionalidad;
    private boolean esGrupo;
    private ListaDobleEnlazada<Cancion> canciones;

    public AutorArtista(String nombre, String nacionalidad, boolean esGrupo) {
        this.codigo = UUID.randomUUID().toString(); // Generar código único aleatorio
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.esGrupo = esGrupo;
        this.canciones = new ListaDobleEnlazada<>();
    }
  
     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isEsGrupo() {
        return esGrupo;
    }

    // Getters y setters
    public void setEsGrupo(boolean esGrupo) {
        this.esGrupo = esGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public ListaDobleEnlazada<Cancion> getCanciones() {
        return canciones;
    }

    @Override
    public int compareTo(AutorArtista o) {
        return this.nombre.compareTo(o.nombre);
    }
}