
package tiendamusicaproyectofinal;

import java.io.Serializable;
import java.util.UUID;


public class Cancion implements Serializable {
    
private String codigo;
    private String nombre;
    private String album;
    private String caratula;
    private int anio;
    private int duracion;
    private String genero;
    private String urlYoutube;

    public Cancion(String nombre, String album, String caratula, int anio, int duracion, String genero, String urlYoutube) {
        this.codigo = UUID.randomUUID().toString(); // Generar código único aleatorio
        this.nombre = nombre;
        this.album = album;
        this.caratula = caratula;
        this.anio = anio;
        this.duracion = duracion;
        this.genero = genero;
        this.urlYoutube = urlYoutube;
    }

    // Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUrlYoutube() {
        return urlYoutube;
    }

    public void setUrlYoutube(String urlYoutube) {
        this.urlYoutube = urlYoutube;
    }
    
}
