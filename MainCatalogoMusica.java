import java.util.InputMismatchException;

public class MainCatalogoMusica {

    static int optmenu;
    static Funciones mlp = new Funciones();

    public static void main(String[] args) {

        // * Objeto de inicio de sesion
        Login lg = new Login();
        lg.Logger();

        // * Menu principal
        MenuPrincipal mp = new MenuPrincipal();
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

                mlp.agregarCancion();
                break;

            // * 2) Consultar cancion
            case 2:

                mlp.consultarCancion();
                break;

            // * 3) Mostrar catalogo
            case 3:

                mlp.mostrarCatalogo();
                break;

            // * 4) Actualizar cancion
            case 4:

                mlp.actualizarCancion();
                break;

            // * 5) Eliminar cancion
            case 5:

                mlp.eliminarCancion();
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