import java.util.InputMismatchException;

public class MainCatalogoMusica {

    static int optmenu;
    static Funciones fnMaster = new Funciones();
    static Login lg = new Login();
    static MenuPrincipal mp = new MenuPrincipal();

    public static void main(String[] args) {

        // * Objeto de inicio de sesion
        lg.Logger();

        // * Menu principal
        do {
            try {

                mp.mostrarMenu();

            } catch (NullPointerException e) {
                System.out.println("Error: Elige una opcion valida.");
                optmenu = 0;
            } catch (InputMismatchException e) {
                System.out.println("Error: Elige una opcion valida.");
                optmenu = 0;
            }

            optmenu = mp.getOptmenu();
            if (optmenu > 0 && optmenu <= 6) {
                // * Switch del menu principal
                menuSwitch();
            } else {
                System.out.println("Error: Elige una opcion valida.");
            }
        } while (!(optmenu == 6));
    }


    // * Metodo switch del menu principal
    public static void menuSwitch() {
        switch (optmenu) {

            // * 1) Agregar cancion
            case 1:

                fnMaster.agregarCancion();
                break;

            // * 2) Consultar cancion
            case 2:

                fnMaster.consultarCancion();
                break;

            // * 3) Mostrar catalogo
            case 3:

                fnMaster.mostrarCatalogo();
                break;

            // * 4) Actualizar cancion
            case 4:

                fnMaster.actualizarCancion();
                break;

            // * 5) Eliminar cancion
            case 5:

                fnMaster.eliminarCancion();
                break;

            // * 6) Cerrar sesion
            case 6:

                System.out.println("Cerrando sesion...");
                break;

            // * Opcion default
            default:
                break;
        }
    }
}