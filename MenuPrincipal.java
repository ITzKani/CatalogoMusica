import java.util.Scanner;

class MenuPrincipal{

    int optmenu;
    
    public MenuPrincipal(){
        
    }

    public void mostrarMenu(){
        Scanner snmenu = new Scanner(System.in);
        System.out.println("---------------------------");
            System.out.println("Catalogo de musica");
            System.out.println("---------------------------");
            System.out.println("1. Agregar cancion");
            System.out.println("2. Consultar cancion");
            System.out.println("3. Actualizar cancion");
            System.out.println("4. Eliminar");
            System.out.println("---------------------------");
            System.out.print("Selecciona una opcion: ");

            optmenu = snmenu.nextInt();
            
    }

    public int getOptmenu() {
        return optmenu;
    }

    public void setOptmenu(int optmenu) {
        this.optmenu = optmenu;
    }

}