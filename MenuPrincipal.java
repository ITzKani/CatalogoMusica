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
            System.out.println("3. Mostrar catalogo");
            System.out.println("4. Actualizar cancion");
            System.out.println("5. Eliminar");
            System.out.println("6. Cerrar sesion");
            System.out.println("---------------------------");
            System.out.print("Selecciona una opcion: ");

            optmenu = snmenu.nextInt();
        while(!(optmenu > 0 && optmenu <= 4)){
            System.out.println("---------------------------");
            System.out.println("Catalogo de musica");
            System.out.println("---------------------------");
            System.out.println("1. Agregar cancion");
            System.out.println("2. Consultar cancion");
            System.out.println("3. Consultar todas las canciones");
            System.out.println("5. Actualizar cancion");
            System.out.println("6. Eliminar");
            System.out.println("7. Cerrar sesion");
            System.out.println("---------------------------");
            System.out.println("*Error: Tienes que elegir un numero del 1 al 4*");
            System.out.print("Selecciona una opcion: ");
            optmenu = snmenu.nextInt();
        }
            
    }

    public int getOptmenu() {
        return optmenu;
    }

    public void setOptmenu(int optmenu) {
        this.optmenu = optmenu;
    }

}