import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {

    Scanner fn2 = new Scanner(System.in);
    private String nombreCan, artista, genero;
    private int id = 1, i = 0;
    private static String opt, opt2;
    ArrayList<CatalogoMusica> Lista = new ArrayList<>();

    public Funciones() {}

    // * Metodo para agregar cancion (opciones 1 del menu)
    public void agregarCancion() {
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
    }

    // * Metodo para consultar canciones (opcion 2 del menu)
    public void consultarCancion() {
        int idsearch;
        do {
            try {
                System.out.println("Consultorio de canciones");
                System.out.println("-------------------------------");
                System.out.println("*Escribe la ID de la cancion que deseas buscar*");
                idsearch = fn2.nextInt();
                idsearch = idsearch - 1;

                System.out.println("-------------------------------");
                System.out.println("ID: " + Lista.get(idsearch).getId());
                System.out.println("Cancion: " + Lista.get(idsearch).getNombreCan());
                System.out.println("Artista: " + Lista.get(idsearch).getArtista());
                System.out.println("Genero: " + Lista.get(idsearch).getGenero());
                System.out.println("-------------------------------");

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Esa ID no existe.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Esa ID no existe.");
            }

            System.out.print("Buscar otra cancion y/n: ");
            fn2.nextLine();
            opt2 = fn2.nextLine();

        } while (!(opt2.equals("n")));
    }

    // * Metodo de mostrar catalogo (opcion 3 del menu)
    public void mostrarCatalogo() {
        do {
            System.out.println("-------------------------------");
            System.out.println("Catalogo de canciones");
            System.out.println("Luna");
            System.out.print("Salir del catalogo y/n: ");
            opt = fn2.nextLine();
        } while ((opt.equals("n")));

    }

    // * Metodo para actualizar una cancion ya asignada (opcion 4 del menu)
    public void actualizarCancion() {
        do {
            int idsearch;

            try {
                System.out.print("Ingresa la ID de la cancion que deseas modificar: ");
                idsearch = fn2.nextInt();
                idsearch = idsearch - 1;
                fn2.nextLine();

                if (idsearch >= 0 && idsearch < id - 1) {

                    System.out.print("Ingresa el nombre de la cancion: ");
                    nombreCan = fn2.nextLine();
                    System.out.print("Ingresa el artista de la cancion: ");
                    artista = fn2.nextLine();
                    System.out.print("Ingresa el genero de la cancion: ");
                    genero = fn2.nextLine();

                    if (nombreCan.equals("") || artista.equals("") || genero.equals("")) {
                        System.out.println("Error: No puedes dejar espacios en blanco.");
                    }

                    else {
                        Lista.remove(idsearch);
                        Lista.add(idsearch, new CatalogoMusica(idsearch + 1, nombreCan, artista, genero));

                        System.out.println("-------------------------------");
                        System.out.println("Se actualizo la cancion con ID: " + Lista.get(idsearch).getId());
                        System.out.println("-------------------------------");
                        System.out.println("ID: " + Lista.get(idsearch).getId());
                        System.out.println("Cancion: " + Lista.get(idsearch).getNombreCan());
                        System.out.println("Artista: " + Lista.get(idsearch).getArtista());
                        System.out.println("Genero: " + Lista.get(idsearch).getGenero());
                        System.out.println("-------------------------------");

                    }
                } else {
                    System.out.println("Error: Esa ID no existe");
                }

            } catch (Exception e) {
                System.out.println("Error: Esa ID no existe");
                fn2.nextLine();
            }

            System.out.print("Quieres actualizar otra cancion y/n: ");
            opt = fn2.nextLine();

        } while (!(opt.equals("n")));
    }

    // * Metodo para eliminar una cancion (opcion 5 del menu)
    // ! ALPHA
    public void eliminarCancion() {
        do {
            try {

                System.out.print("Ingresa la ID de la cancion que quieres eliminar: ");
                int idsearch = fn2.nextInt();
                idsearch = idsearch - 1;

                if (idsearch >= 0 && idsearch < id - 1) {
                    Lista.remove(idsearch);
                    System.out.println("Se elimino la cancion con ID: " + (idsearch + 1));
                }

                else {
                    System.out.println("Error: Esa ID no existe.");
                }
            } catch (Exception e) {
                System.out.println("Error: Esa ID no existe.");
            }
            System.out.print("Quieres eliminar otra cancion y/n: ");
            fn2.nextLine();
            opt = fn2.nextLine();

        } while (!(opt.equals("n")));
    }
}