import java.util.ArrayList;

public class CatalogoMusica {

    private String nombreCan, artista, genero;
    private int id;
    ArrayList<CatalogoMusica> Lista2 = new ArrayList<CatalogoMusica>();

    // * Metodo constructor
    public CatalogoMusica(int id, String nombreCan, String artista, String genero) {
        this.id = id;
        this.nombreCan = nombreCan;
        this.artista = artista;
        this.genero = genero;
    }

    public void catalogo() {
        Lista2.add(0, new CatalogoMusica(1, "Luna", "Dagan", "Pop"));
        Lista2.add(1, new CatalogoMusica(2, "Luna", "Dagan", "Pop"));
        Lista2.add(2, new CatalogoMusica(3, "Luna", "Dagan", "Pop"));
        Lista2.add(3, new CatalogoMusica(4, "Luna", "Dagan", "Pop"));
        Lista2.add(4, new CatalogoMusica(5, "Luna", "Dagan", "Pop"));
        Lista2.add(5, new CatalogoMusica(6, "Luna", "Dagan", "Pop"));
        Lista2.add(6, new CatalogoMusica(7, "Luna", "Dagan", "Pop"));
    }

    // * Metodo para mostrar el catalogo de canciones
    public void mostrarCatalogo() {

        catalogo();
        for (int in3 = 0; in3 < 7; in3++) {
            System.out.println("ID: " + Lista2.get(in3).getId());
            System.out.println("Cancion: " + Lista2.get(in3).getNombreCan());
            System.out.println("Artista: " + Lista2.get(in3).getArtista());
            System.out.println("Genero: " + Lista2.get(in3).getGenero());
            System.out.println("-------------------------------");
        }

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
        return "CatalogoMusica Cancion: " + getNombreCan() + " Artista: " + getArtista() + " Genero: "
                + getGenero() + " ID: " + getId() + " \n";
    }

}
