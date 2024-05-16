import java.util.Scanner;
class MainLogin{
    public static void main(String[] args) {
    
    Scanner fn = new Scanner(System.in);
    String imputuser, imputpassword;
    Login lg = new Login();

    //Inicio del bucle do-while
    do{

    System.out.print("Ingresa tu usuario: ");
    imputuser = fn.nextLine();

    System.out.print("Ingresa tu contraseña: ");
    imputpassword = fn.nextLine();

    lg.setUser(imputuser);
    lg.setPassword(imputpassword);

    lg.limpiarConsola();
    lg.validacion();


    

    }while(!(lg.getUser().equals("root") && lg.getPassword().equals("12345a")));
        
    }
}