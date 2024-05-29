import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Funciones {

    Scanner sn = new Scanner(System.in);
    private String nombreCan, artista, genero;
    private int id = 1, i = 0;
    private static String opt, opt2;
    ArrayList<CatalogoMusica> Lista = new ArrayList<>();

    // * Metodo constructor 
    public Funciones() {}

    // * Metodo para agregar cancion (opciones 1 del menu)
    public void agregarCancion() {
        do {
            System.out.print("Ingresa el nombre de la cancion: ");
            nombreCan = sn.nextLine();
            System.out.print("Ingresa el artista de la cancion: ");
            artista = sn.nextLine();
            System.out.print("Ingresa el genero de la cancion: ");
            genero = sn.nextLine();

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
            opt = sn.nextLine();

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
                idsearch = sn.nextInt();
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
            sn.nextLine();
            opt2 = sn.nextLine();

        } while (!(opt2.equals("n")));
    }

    // * Metodo de mostrar catalogo (opcion 3 del menu)
    public void mostrarCatalogo() {
        do {
            System.out.println("-------------------------------");
            System.out.println("Catalogo de canciones");
            System.out.println("Luna");
            System.out.print("Salir del catalogo y/n: ");
            opt = sn.nextLine();
        } while ((opt.equals("n")));

    }

    // * Metodo para actualizar una cancion ya asignada (opcion 4 del menu)
    public void actualizarCancion() {
        do {
            int idsearch;

            try {
                System.out.print("Ingresa la ID de la cancion que deseas modificar: ");
                idsearch = sn.nextInt();
                idsearch = idsearch - 1;
                sn.nextLine();

                if (idsearch >= 0 && idsearch < id - 1) {

                    System.out.print("Ingresa el nombre de la cancion: ");
                    nombreCan = sn.nextLine();
                    System.out.print("Ingresa el artista de la cancion: ");
                    artista = sn.nextLine();
                    System.out.print("Ingresa el genero de la cancion: ");
                    genero = sn.nextLine();

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
                sn.nextLine();
            }

            System.out.print("Quieres actualizar otra cancion y/n: ");
            opt = sn.nextLine();

        } while (!(opt.equals("n")));
    }

    // * Metodo para eliminar una cancion (opcion 5 del menu)
    // ! ALPHA
    public void eliminarCancion() {
        do {
            try {

                System.out.print("Ingresa la ID de la cancion que quieres eliminar: ");
                int idsearch = sn.nextInt();
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
            sn.nextLine();
            opt = sn.nextLine();

        } while (!(opt.equals("n")));
    }
}