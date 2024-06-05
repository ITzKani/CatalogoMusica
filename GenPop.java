import java.util.ArrayList;

class GenPop {

    ArrayList<CatalogoMusica> genPop = new ArrayList<>();

    public GenPop() {
    }

    public void arrayList() {

        genPop.add(0, new CatalogoMusica(1, "1", "1", "1"));
        genPop.add(1, new CatalogoMusica(2, "2", "2", "2"));
        genPop.add(2, new CatalogoMusica(3, "3", "3", "3"));
        genPop.add(3, new CatalogoMusica(4, "4", "4", "4"));
        genPop.add(4, new CatalogoMusica(5, "5", "5", "5"));
    }

    public void lista() {

        System.out.println("**Catalogo pop**");
        System.out.println("---------------------------");
        for (int i = 0; i < genPop.size(); i++) {
            System.out.println("ID: " + genPop.get(i).getId());
            System.out.println("Cancion: " + genPop.get(i).getNombreCan());
            System.out.println("Artista: " + genPop.get(i).getArtista());
            System.out.println("Genero: " + genPop.get(i).getGenero());
            System.out.println("-------------------------------");
        }
    }
}