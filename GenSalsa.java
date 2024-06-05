import java.util.ArrayList;

class GenSalsa {

    ArrayList<CatalogoMusica> genSalsa = new ArrayList<>();

    public GenSalsa() {
    }

    public void arrayList() {

        genSalsa.add(0, new CatalogoMusica(1, "1", "1", "1"));
        genSalsa.add(1, new CatalogoMusica(2, "2", "2", "2"));
        genSalsa.add(2, new CatalogoMusica(3, "3", "3", "3"));
        genSalsa.add(3, new CatalogoMusica(4, "4", "4", "4"));
        genSalsa.add(4, new CatalogoMusica(5, "5", "5", "5"));
    }

    public void lista() {

        System.out.println("**Catalogo salsa**");
        System.out.println("---------------------------");
        for (int i = 0; i < genSalsa.size(); i++) {
            System.out.println("ID: " + genSalsa.get(i).getId());
            System.out.println("Cancion: " + genSalsa.get(i).getNombreCan());
            System.out.println("Artista: " + genSalsa.get(i).getArtista());
            System.out.println("Genero: " + genSalsa.get(i).getGenero());
            System.out.println("-------------------------------");
        }
    }
}