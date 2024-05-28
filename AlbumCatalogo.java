import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumCatalogo {

    
    private int optalbum;
    
    public AlbumCatalogo(int id, String nombreCan, String artista, String genero) {
    }
    public void mostrarCatalogo(){
        Scanner obj = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("Catalogo de musica");
        System.out.println("***************************");
        System.out.println("1. Pop");
        System.out.println("2. Rock");
        System.out.println("3. Rock and Roll");
        System.out.println("4. Rancheras");
        System.out.println("5. Salsa");
        System.out.println("6. Salir");
        System.out.println("***************************");
        System.out.print("Selecciona una opcion: ");
        optalbum = obj.nextInt();
        switch (optalbum) {
            case 1:
            System.out.println("**********************************");
                System.out.println("Bienvenido al contenido de Pop");
                List<AlbumCatalogo> album = new ArrayList<AlbumCatalogo>();
                album.add(new AlbumCatalogo(1,"Amiga mia ", "Alejandro Sanz ", "Pop "));
                break;
                
                default:
                break;
            }
        }
    }