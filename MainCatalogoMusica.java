import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCatalogoMusica {

    Scanner fn2 = new Scanner(System.in);
    String nombreCan, artista, genero;
    int id = 1, i = 0;
    int opt2;
    static String opt;
    ArrayList<CatalogoMusica> Lista = new ArrayList<>();
    static int optmenu;
    public static void main(String[] args) {

            // * Objeto de inicio de sesion
            Login lg = new Login();
            lg.Logger();
            
            // * Menu principal

            MenuPrincipal mp = new MenuPrincipal();
            MainCatalogoMusica mlp = new MainCatalogoMusica();
            do{
            mp.mostrarMenu();
            optmenu = mp.getOptmenu();

            // * Switch del menu principal

            mlp.menuSwitch();
            }while((opt.equals("n")));
        }
    


    // * Metodo switch del menu principal

    public void menuSwitch(){
        switch (optmenu) {
            case 1:
                do {
                    System.out.print("Ingresa el nombre de la cancion: ");
                    nombreCan = fn2.nextLine();
                    System.out.print("Ingresa el artista de la cancion: ");
                    artista = fn2.nextLine();
                    System.out.print("Ingresa el genero de la cancion: ");
                    genero = fn2.nextLine();

                    Lista.add(i, new CatalogoMusica(id, nombreCan, artista, genero));

                    System.out.println("-------------------------------");

                    for (int in = 0; in <= i; in++) {
                        System.out.println("ID: " + Lista.get(in).getId());
                        System.out.println("Cancion: " + Lista.get(in).getNombreCan());
                        System.out.println("Artista: " + Lista.get(in).getArtista());
                        System.out.println("Genero: " + Lista.get(in).getGenero());
                        System.out.println("-------------------------------");
                    }

                    System.out.print("Quieres agregar otra cancion y/n: ");
                    opt = fn2.nextLine();

                    id++;
                    i++;
                } while (!(opt.equals("n")));

                break;

            default:
                break;
        }
    }

}
