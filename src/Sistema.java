import java.util.Scanner;

class Sistema {
    @SuppressWarnings("unused")
    private static String login, nome_completo, password, cpf, nascimento;
    public static int erro = 0;
    public static void main(String[] args) {
        if (setUser()) {
            setRegistro();
        }
    }

    static boolean setUser() {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Seu Login: ");
            login = in.nextLine();
            if (login.length() == 0 ) {
                return false;
            }
        } catch (Exception e){
        //Todos 
        System.out.println("Erro" + e);
        }

        try {
            do {
                System.out.println("Sua senha de acesso: ");
                password = in.nextLine(); 
                
                if (password.length() >= 4) {
                    return true;
                }

                if(password.length() < 4){
                    erro++;
                }

                if(erro >= 3){
                    return false;
                }

            } while (true);
            
        } 
        catch (Exception e) {
            System.out.println("Senha deve conter 4 digitos no mínimo: " + e);
        }

        return true;
    }
    static boolean setRegistro() {

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
        return true;
    }

}