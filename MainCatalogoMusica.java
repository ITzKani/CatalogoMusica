import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCatalogoMusica {
    public static void main(String[] args) {
        Scanner fn2 = new Scanner(System.in);
        String nombreCan, artista, genero;
        int id = 1, i = 0;

        try{
        String opt;
        int opt2;
        ArrayList<CatalogoMusica> Lista = new ArrayList<>();

        // * Objeto de inicio de sesion
        Login lg = new Login();
        lg.Logger();

        // * Menu principal
        
            System.out.println("---------------------------");
            System.out.println("Catalogo de musica");
            System.out.println("---------------------------");
            System.out.println("1. Agregar cancion");
            System.out.println("2. Consultar cancion");
            System.out.println("3. Actualizar cancion");
            System.out.println("4. Eliminar");
            System.out.println("---------------------------");
            System.out.print("Selecciona una opcion: ");
        
    
            opt2 = fn2.nextInt();
            fn2.nextLine();
        
            
            // * Switch del menu principal

        switch (opt2) {
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

                    System.out.print("Quieres agregar otra cancion si/no: ");
                    opt = fn2.nextLine();

                    id++;
                    i++;
                } while (!(opt.equals("no")));
                break;

            default:
                break;
        }
    } catch(Exception e){
        System.out.println("Error: No puedes hacer eso!!");
    }

        fn2.close();
    }

}
