import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCatalogoMusica {

    Scanner fn2 = new Scanner(System.in);
    String nombreCan, artista, genero;
    int id = 1, i = 0;
    // int opt2;
    static String opt, opt2;
    static int optmenu;
    ArrayList<CatalogoMusica> Lista = new ArrayList<>();
    static MainCatalogoMusica mlp = new MainCatalogoMusica();

    public static void main(String[] args) {

        // * Objeto de inicio de sesion
        Login lg = new Login();
        lg.Logger();

        // * Menu principal

        MenuPrincipal mp = new MenuPrincipal();
        do {
            mp.mostrarMenu();
            optmenu = mp.getOptmenu();

            // * Switch del menu principal

            mlp.menuSwitch();
        } while ((opt.equals("n") || optmenu == 3 && opt.equals("y")));
    }

    // * Metodo switch del menu principal

    public void menuSwitch() {
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

            case 2:
                int idsearch;
                do {
                    
                    System.out.println("Consultorio de canciones");
                    System.out.println("-------------------------------");
                    System.out.println("*Escribe la ID de la cancion que deseas buscar*");
                    idsearch = fn2.nextInt();
                    
                   // if (!(idsearch < 0 && idsearch < Lista.size() + 1)) {
                        System.out.println("-------------------------------");
                        System.out.println("ID: " + Lista.get(idsearch - 1).getId());
                        System.out.println("Cancion: " + Lista.get(idsearch - 1).getNombreCan());
                        System.out.println("Artista: " + Lista.get(idsearch - 1).getArtista());
                        System.out.println("Genero: " + Lista.get(idsearch - 1).getGenero());
                        System.out.println("-------------------------------");
                        
                        System.out.print("Buscar otra cancion y/n: ");
                        fn2.nextLine();
                        opt2 = fn2.nextLine();
                    //}

                   // else {
                       // System.out.println("*Error: Tienes que ingresar un numero.*");
                    //}
                    System.out.println(opt2);
                } while (!(opt2.equals("n")));
                break;
                
            case 3:
                
                mlp.mostrarCanciones();
                break;
                
            default:
                break;
        }
    }

    public void mostrarCanciones(){
        do{
        System.out.println("-------------------------------");
        System.out.println("Catalogo de canciones");
        System.out.print("Salir del catalogo y/n: ");
        opt = fn2.nextLine();
        }while((opt.equals("n")));
    
        
    }
}
