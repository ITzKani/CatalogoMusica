import java.util.ArrayList;

class GenRap {

    ArrayList<CatalogoMusica> genRap = new ArrayList<>();

    public GenRap() {
    }

    public void arrayList() {

        genRap.add(0, new CatalogoMusica(1, "1", "1", "1"));
        genRap.add(1, new CatalogoMusica(2, "2", "2", "2"));
        genRap.add(2, new CatalogoMusica(3, "3", "3", "3"));
        genRap.add(3, new CatalogoMusica(4, "4", "4", "4"));
        genRap.add(4, new CatalogoMusica(5, "5", "5", "5"));
    }

    public void lista() {

        System.out.println("**Catalogo Rap**");
        System.out.println("---------------------------");
        for (int i = 0; i < genRap.size(); i++) {
            System.out.println("ID: " + genRap.get(i).getId());
            System.out.println("Cancion: " + genRap.get(i).getNombreCan());
            System.out.println("Artista: " + genRap.get(i).getArtista());
            System.out.println("Genero: " + genRap.get(i).getGenero());
            System.out.println("-------------------------------");
        }
    }
}