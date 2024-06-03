class LoginFuncion {
    private String user, password;

    public LoginFuncion() {

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void validacion() {
        if (user.equals("root") && password.equals("12345a") || user.equals("user") && password.equals("12345b")) {

        }

        else {
            System.out.println("Error: informacion incorrecta.");
        }

    }
}