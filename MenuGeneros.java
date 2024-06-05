import java.util.Scanner;

public class MenuGeneros extends Funciones {

    GenElectronica ge = new GenElectronica();
    GenPop gp = new GenPop();
    GenRap gr = new GenRap();
    GenRock grk = new GenRock();
    GenSalsa gs = new GenSalsa();
    int optmenu2;
    String opt;

    public MenuGeneros() {
    }

    public void mostrarMenu() {

        Scanner snmenu2 = new Scanner(System.in);
        do {
            System.out.println("---------------------------");
            System.out.println("Lista de catalogos");
            System.out.println("---------------------------");
            System.out.println("1. Canciones creadas");
            System.out.println("2. Electronica");
            System.out.println("3. Pop");
            System.out.println("4. Rap");
            System.out.println("5. Rock");
            System.out.println("6. Salsa");
            System.out.println("7. Salir");
            System.out.println("---------------------------");
            System.out.print("Selecciona una opcion: ");

            optmenu2 = snmenu2.nextInt();

            if (optmenu2 > 0 && optmenu2 <= 7) {
                switch (optmenu2) {

                    case 1:
                        if (Lista.size() > 0) {
                            System.out.println("**Lista de canciones creadas**");
                            System.out.println("-------------------------------");
                            for (int in2 = 0; in2 < Lista.size(); in2++) {
                                System.out.println("ID: " + Lista.get(in2).getId());
                                System.out.println("Cancion: " + Lista.get(in2).getNombreCan());
                                System.out.println("Artista: " + Lista.get(in2).getArtista());
                                System.out.println("Genero: " + Lista.get(in2).getGenero());
                                System.out.println("-------------------------------");
                            }
                        } else {
                            System.out.println("Error: No hay canciones creadas.");
                        }
                        break;

                    case 2:
                        limpiarConsola();
                        MostrarGenElectronica();
                        break;

                    case 3:
                        limpiarConsola();
                        MostrarGenPop();
                        break;

                    case 4:
                        limpiarConsola();
                        MostrarGenRap();
                        break;

                    case 5:
                        limpiarConsola();
                        MostrarGenRock();
                        break;

                    case 6:
                        limpiarConsola();
                        MostrarGenSalsa();
                        break;

                    case 7:
                        limpiarConsola();
                        break;

                    default:
                        System.out.println("Error: Ingresa una opcion valida.");
                        break;
                }
                System.out.print("Ver otro catalogo y/n: ");
                opt = sn.nextLine();
            }

            else {
                System.out.println("Error: Ingresa una opcion valida.   ");
            }
            limpiarConsola();
        } while (opt.equals("y") || optmenu2 > 0 && optmenu2 < 7);

    }

    // * Metodo para mostrar lista de electronica
    public void MostrarGenElectronica() {
        ge.arrayList();
        ge.lista();
    }

    // * Metodo para mostrar lista de pop
    public void MostrarGenPop() {
        gp.arrayList();
        gp.lista();
    }

    // * Metodo para mostrar lista de rap
    public void MostrarGenRap() {
        gr.arrayList();
        gr.lista();
    }

    // * Metodo para mostrar lista de rock
    public void MostrarGenRock() {
        grk.arrayList();
        grk.lista();
    }

    // * Metodo para mostrar lista de salsa
    public void MostrarGenSalsa() {
        gs.arrayList();
        gs.lista();
    }

}
