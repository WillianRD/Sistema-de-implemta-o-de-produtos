import java.util.Scanner;

class Sistema {
    @SuppressWarnings("unused")
    private static String login, nome_completo, password, cpf, nascimento;
    public static void main(String[] args) {
        setUser();
        setRegistro();
    }

    static void setUser() {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("Seu Login: ");
        login = in.nextLine();


        System.out.println("Sua senha de acesso: ");
        System.out.println("Senha de 4 digitos: ");
        password = in.nextLine();
    }

    static void setRegistro() {

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("Nome completo: ");
        nome_completo = in.nextLine();

        System.out.println("Seu CPF: ");
        System.out.println("Ex: 123.456.789-00");
        cpf = in.nextLine();

        System.out.println("Data de nascimento: ");
        System.out.println("Ex: xx/xx/xxxx ");
        nascimento = in.nextLine();

        System.out.println("Verifição concluida com sucesso");
        System.out.println("Aguarde para os proximos passos");
    }

}