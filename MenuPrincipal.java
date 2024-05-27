import java.util.Scanner;

class MenuPrincipal{

    int optmenu;
    String palapabra;
    
    public MenuPrincipal(){
        
    }

    public void mostrarMenu(){
        try {
            do{
            
            
            Scanner snmenu = new Scanner(System.in);
            System.out.println("---------------------------");
            System.out.println("Catalogo de musica");
            System.out.println("---------------------------");
            System.out.println("1. Agregar cancion");
            System.out.println("2. Consultar cancion");
            System.out.println("3. Mostrar catalogo"); // Enrique 
            System.out.println("4. Actualizar cancion");
            System.out.println("5. Eliminar"); // Enrique
            System.out.println("6. Cerrar sesion");
            System.out.println("---------------------------");
            System.out.print("Selecciona una opcion: ");
            
            optmenu = snmenu.nextInt();
        }while(optmenu==6);
        } catch (Exception e) {
            System.out.println("*Error: Tienes que elegir un numero del 1 al 6*");
            
        }
    }

    public int getOptmenu() {
        return optmenu;
    }

    public void setOptmenu(int optmenu) {
        this.optmenu = optmenu;
    }

}