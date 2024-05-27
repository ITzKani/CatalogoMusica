import java.util.Scanner;

class Login {

    public void Logger() {

        Scanner fn = new Scanner(System.in);
        String imputuser, imputpassword;
        LoginFuncion lg = new LoginFuncion();

        // Inicio del bucle do-while
        do {

            System.out.println("--Catalogo de musica Login--");
            System.out.print("Ingresa tu usuario: ");
            imputuser = fn.nextLine();

            System.out.print("Ingresa tu contraseña: ");
            imputpassword = fn.nextLine();

            lg.setUser(imputuser);
            lg.setPassword(imputpassword);

            lg.limpiarConsola();
            lg.validacion();

        } while (!(lg.getUser().equals("root") && lg.getPassword().equals("12345a")));

    }
}