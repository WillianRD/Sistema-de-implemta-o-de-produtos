import java.util.Scanner;

class Sistema {
    private static String login, nome_completo, password, cpf, nascimento, confirmacao;
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
            do {
                
                System.out.println("Seu login deve conter 4 letras ou mais");
                System.out.println("Seu Login: ");
                login = in.nextLine();
                
                if (login.length() >= 4) {
                    break;
                }

                if (login.length() == 0 ) {
                    erro++;
                }

                // limite minino
                if(login.length() <= 3){
                    erro++;
                }

                if(erro == 3){
                    return false;
                }

            }while(true);

        } catch (Exception e){
         
            System.out.println("Erro" + e);
        
        }

// VALIDAÇÃO DA SENHA DO USUARIO
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

        //Validação do nome completo
        try{
            do{
                System.out.println("Digite seu nome completo: ");
                nome_completo = in.nextLine();

                if(nome_completo.length() >= 10){
                    break;
                }

                if(nome_completo.length() < 10){
                    erro++;
                }

                if(erro >= 3){
                    return true;
                }

            } while (true);
        }catch (Exception e) {
            System.out.println("Seu nome deve contém no minimo 10 caracteres");
        }
        
        //VALIDAÇÃO DO CPF
        try{
            do{
                System.out.println("Digite seu CPF ");
                System.out.println("Siga o exemplo: 123.456.789-00");
                cpf = in.nextLine();

                if(cpf.length() >=9){
                   break;
                }
                
                else{
                    System.out.println("CPF inválido! Siga o exemplo e insira novamente.");
                }

            }while(true);

        }catch(Exception e){
            System.out.println("Algo deu errado, tente novamente!");
        }

        //VALIDAÇÃO DA DATA DE NASCIMENTO DO USUÁRIO
        try{
            do{
                System.out.println("Digite sua data de nascimento: ");
                System.out.println("Ex: xx/xx/xxxx ");
                nascimento = in.nextLine();

                if(nascimento.length() >= 8){
                    break;
                }
                else{
                    System.out.println("Formato errado");
                }

            }while(true);
        }catch(Exception e){
            System.out.println("Algo deu errado, tente novamente!");
        }

         //USUARIO DEVE COLOCAR SUA RESPOSTA FINAL SE SEU DADOS ESTÃO CORRETOS O MESMO COLOCA SIM, CASO CONTRARIO NÃO
        
        System.out.println("Digite 1 para confirmar seus dados");
        System.out.println("Digite NÃO para não confirmar seus dados");
        confirmacao = in.nextLine();
         
        switch (confirmacao.length()) {
            case 1:
                System.out.println("Você confirmou seus dados");
                break;
                
            case 3:
                System.out.println("Você não confirmou seus dados.");
                break;
            default:
        }

    //CONFERINDO OS DADOS SALVOS PELO USUÁRIO
    System.out.println("Abaixo estão seus dados");
        System.out.println(nome_completo);
        System.out.println(cpf);
        System.out.println(nascimento);


        System.out.println("Verifição concluida com sucesso");
        System.out.println("Aguarde para os proximos passos");
        return true;
    }
}