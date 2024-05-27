public class CatalogoMusica {

    private String nombreCan, artista, genero;
    private int id;

    // * Metodo constructor
    public CatalogoMusica(int id, String nombreCan, String artista, String genero) {
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

    public String mostrarCatalogo() {
        return "Cancion: " + getNombreCan() + "\n" + "Artista: " + getArtista() + "\n" + "Genero: " + getGenero() + "\n"
                + "ID: " + getId();
    }

    @Override
    public String toString() {
        return "CatalogoMusica Cancion: " + getNombreCan() + " Artista: " + getArtista() + " Genero: "
                + getGenero() + " ID: " + getId() + " \n";
    }

}
