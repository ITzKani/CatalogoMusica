import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCatalogoMusica{
    public static void main(String[] args) {
        String nombreCan, artista, genero;
        int id=0, i=0;
        String opt;
        ArrayList<CatalogoMusica> Lista = new ArrayList<>();
        Scanner fn = new Scanner(System.in);

        do{
            System.out.print("Ingresa el nombre de la cancion: ");
            nombreCan = fn.nextLine();
            System.out.print("Ingresa el artista de la cancion: ");
            artista = fn.nextLine();
            System.out.print("Ingresa el genero de la cancion: ");
            genero = fn.nextLine();
        
            
            Lista.add(i, new CatalogoMusica(id, nombreCan, artista, genero));
            System.out.println(Lista.toString());
            
            
            System.out.print("Quieres agregar otra cancion si/no: ");
            opt = fn.nextLine();

            id++;
            i++;
        }while(!(opt.equals("no")));
    }
}