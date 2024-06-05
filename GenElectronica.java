import java.util.ArrayList;

class GenElectronica {

    ArrayList<CatalogoMusica> genElectronica = new ArrayList<>();

    public GenElectronica() {
    }

    public void arrayList() {

        genElectronica.add(0, new CatalogoMusica(1, "1", "1", "1"));
        genElectronica.add(1, new CatalogoMusica(2, "2", "2", "2"));
        genElectronica.add(2, new CatalogoMusica(3, "3", "3", "3"));
        genElectronica.add(3, new CatalogoMusica(4, "4", "4", "4"));
        genElectronica.add(4, new CatalogoMusica(5, "5", "5", "5"));
    }

    public void lista() {

        System.out.println("**Catalogo electronica**");
        System.out.println("---------------------------");
        for (int i = 0; i < genElectronica.size(); i++) {
            System.out.println("ID: " + genElectronica.get(i).getId());
            System.out.println("Cancion: " + genElectronica.get(i).getNombreCan());
            System.out.println("Artista: " + genElectronica.get(i).getArtista());
            System.out.println("Genero: " + genElectronica.get(i).getGenero());
            System.out.println("-------------------------------");
        }
    }
}