import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCatalogoMusica{
    public static void main(String[] args) {
        Scanner fn2 = new Scanner(System.in);
        String nombreCan, artista, genero;
        int id=1, i=0;
        String opt;
        ArrayList<CatalogoMusica> Lista = new ArrayList<>();

        // * Objeto de inicio de sesion
        Login lg = new Login();
        lg.Logger();

        // * Menu principal
        int opt2;
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
                do{
                    System.out.print("Ingresa el nombre de la cancion: ");
                    nombreCan = fn2.nextLine();
                    System.out.print("Ingresa el artista de la cancion: ");
                    artista = fn2.nextLine();
                    System.out.print("Ingresa el genero de la cancion: ");
                    genero = fn2.nextLine();
        
            
                    Lista.add(i, new CatalogoMusica(id, nombreCan, artista, genero));
                    
                    System.out.println(Lista.toString());
                    //System.out.println(Lista.get(i));
                    
                    
                    System.out.print("Quieres agregar otra cancion si/no: ");
                    opt = fn2.nextLine();

                    id++;
                    i++;
                }while(!(opt.equals("no")));
                break;

            default:
                break;

            

                
    }
        
        fn2.close();
    }
}