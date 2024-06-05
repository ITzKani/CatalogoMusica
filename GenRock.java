import java.util.ArrayList;

class GenRock {

    ArrayList<CatalogoMusica> genRock = new ArrayList<>();

    public GenRock() {
    }

    public void arrayList() {

        genRock.add(0, new CatalogoMusica(1, "1", "1", "1"));
        genRock.add(1, new CatalogoMusica(2, "2", "2", "2"));
        genRock.add(2, new CatalogoMusica(3, "3", "3", "3"));
        genRock.add(3, new CatalogoMusica(4, "4", "4", "4"));
        genRock.add(4, new CatalogoMusica(5, "5", "5", "5"));
    }

    public void lista() {

        System.out.println("**Catalogo rock**");
        System.out.println("---------------------------");
        for (int i = 0; i < genRock.size(); i++) {
            System.out.println("ID: " + genRock.get(i).getId());
            System.out.println("Cancion: " + genRock.get(i).getNombreCan());
            System.out.println("Artista: " + genRock.get(i).getArtista());
            System.out.println("Genero: " + genRock.get(i).getGenero());
            System.out.println("-------------------------------");
        }
    }
}