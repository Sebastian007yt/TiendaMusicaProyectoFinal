
package tiendamusicaproyectofinal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import java.io.Serializable;
import java.util.HashMap;

public class TiendaDeMusica implements Serializable {
  
  private HashMap<String, Usuario> usuarios;
  private ArbolBinario<AutorArtista> artistas;

  public TiendaDeMusica() {
    usuarios = new HashMap<>();
    artistas = new ArbolBinario<>();
  }

  public void agregarUsuario(Usuario usuario) {
    usuarios.put(usuario.getUsername(), usuario);
  }

public void agregarArtista(AutorArtista artista) {
    AutorArtista autorArtista = new AutorArtista(artista.getNombre(), artista.getNacionalidad(), artista.isEsGrupo());
    NodoBinario<AutorArtista> nodoArtista = artistas.buscar(autorArtista);
    if (nodoArtista != null) {
        ListaDobleEnlazada<Cancion> canciones = nodoArtista.getDato().getCanciones();
        if (!artista.getCanciones().estaVacia()) {
            canciones.insertarFinal(artista.getCanciones().obtenerPrimero());
        }
    } else {
        ListaDobleEnlazada<Cancion> canciones = autorArtista.getCanciones();
        if (!artista.getCanciones().estaVacia()) {
            canciones.insertarFinal(artista.getCanciones().obtenerPrimero());
        }
        artistas.insertar(autorArtista);
    }
}
  
}
