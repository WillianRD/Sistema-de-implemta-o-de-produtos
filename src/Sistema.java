import java.util.Scanner;

class Sistema {
    private static String login, nome_completo, password, cpf, nascimento;
    public static void main(String[] args) {
        setUser();
        setRegistro();
    }

    static void setUser() {
        Scanner in = new Scanner(System.in);

        System.out.print("Login: ");
        login = in.nextLine();


        System.out.print("Password: ");
        password = in.nextLine();
    }

    static void setRegistro() {

        Scanner in = new Scanner(System.in);

        System.out.print("nome: ");
        nome_completo = in.nextLine();

        System.out.print("CPF: ");
        cpf = in.nextLine();

        System.out.print("Data de nascimento: ");
        nascimento = in.nextLine();
    }

}
