public class CatalogoMusica{

    private String nombreCan, artista, genero;
    private int id;
    
    // * Metodo constructor
    public CatalogoMusica(int id, String nombreCan, String artista, String genero){
        this.id = id;
        this.nombreCan = nombreCan;
        this.artista = artista;
        this.genero = genero;
    }
    
    // * Metodos getter y setters
    public String getNombreCan() {
        return nombreCan;
    }
    public void setNombreCan(String nombreCan) {
        this.nombreCan = nombreCan;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CatalogoMusica [getNombreCan()=" + getNombreCan() + ", getArtista()=" + getArtista() + ", getGenero()="
                + getGenero() + ", getId()=" + getId() + "]";
    }

    

    
    

    

    
}
