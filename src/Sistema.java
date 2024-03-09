import java.util.Scanner;

class Sistema {
    public static void main(String[] args) {

        String login ="";
        String password ="";
        String nome_completo ="";
        String data_de_nascimento = "";
        String cpf ="";
        var verificacao ="";

        Scanner Verificacao = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        nome_completo = Verificacao.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        System.out.println("Ex: xx/xx/xxxx");
        data_de_nascimento =Verificacao.nextLine();

        System.out.println("Digite sem CPF com pontos e traços");
        System.out.println("Ex: 123.456.789-00");
        cpf = Verificacao.nextLine();

        System.out.println("Verificação concluida com sucesso");
        System.out.println("Aguarde para os proximos passos");
    }
}

