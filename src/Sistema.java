import java.util.Scanner;

class Sistema {
    private static String login, nome_completo, password, cpf, nascimento, confirmacao, produto;
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
                
                //System.out.println("Seu login deve conter 4 letras ou mais");
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
                    System.out.println("Seu Login dever ter no minimo 4 letras");
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
//MÉTODO PARA VALIDAR A SENHA APENAS COM NÚMERO

    //int erro = 0;
    //boolean senhaValida = false;
    //int password = 0;

        try {
            do {

        //Scanner senhaDoUsuario = new Scanner(System.in);
        //int senhaDoLogin;
        //System.out.println("Digite sua senha");
        //senhaDoLogin = senhaDoUsuario.nextInt();

                System.out.println("Sua senha de acesso: ");
                password = in.nextLine();
                
                if (password.length() >= 4) {
                    break;
                }

                if(password.length() < 4){
                    erro++;
                }

                if(erro >= 3){
                    return true;
                }

            } while (true);
            
        } 
        catch (Exception e) {
            System.out.println("Sua senha não deve conter caracteres: " + e);
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

        //PROXIMOS PASSOS PARA ESTAR ADICIONANDO UM PRODUTO
        //EX:ID DO PRODUTO/ NOME DO PRODUTO/ MARCA DO PRODUTO EX: COCA COLA/CATEGORIA DO PRODUTO EX: BEBIDAS// QUANTOS KG OU ML O PRODUTO TEM
        //VALIDADE DO PRODUTO EX: 22/02/2025/ QUANTIDADE/ PREÇO/ FORNECEDOR

        //VALIDAR  O PRODUTO 
        try{
            do{
                System.out.println("Adicionar um produto");
                System.out.println("ID DO PRODUTO");
                produto = in.nextLine();

                if(produto.length() >=1){
                    break;
                }
                else{
                    System.out.println("O produto precisa ter pelo menos um número no ID DO PRODUTO");
                }
                    
            }while(true);
        }catch(Exception e){
            System.out.println("O produto precisa ter pelo menos um número no ID DO PRODUTO");
        }
        //NOME DO PRODUTO
        try{
            do{
                System.out.println("NOME DO PRODUTO");
                produto = in.nextLine();
                if(produto.length() >1){
                    break;
                }
                else{
                    System.out.println("NOME DO PRODUTO PRECISA TER MAIS DE 1 CARACTERE ");
                }

            }while(true);
        }catch(Exception e){
            System.out.println("ERRO AO INSERIR O NOME DO PRODUTO");
        }

            //MARCA DO PRODUTO
            try{
                do{
                    System.out.println("MARCA DO PRODUTO");
                    produto = in.nextLine();
                    if(produto.length()>=2){
                        break;
                    }

                }while(true);
            }catch(Exception e){
                System.out.println("Erro ao adicionar a marca do produto: ");
            }
            //O PRODUTO E KG OU ML
            try{
                do{
                    System.out.println("QUANTOS KGS OU ML O PRODUTO TEM");
                    System.out.println("Siga o exemplo. 1.2KG ou 250ML");
                    produto = in.nextLine();

                    if(produto.length() >= 2){
                        break;
                    }
                    else{
                        System.out.println("Siga o exemplo. 1.2KG ou 250ML");
                    }
                }while (true);
            }catch (Exception e){
                System.out.println("Formato errado, tente novamente");
            }
            //CATEGORIA DO PRODUTO
            //EX: BEBIDA, DOCE, VAREJO
        System.out.println("CATEGORIA DO PRODUTO");
        produto = in.nextLine(); 


            //VALIDAR A DATA DE VALIDADE DO PRODUTO
            try{
                do{
                    System.out.println("VALIDADE DO PRODUTO");
                    produto = in.nextLine();

                    if(produto.length() >= 3){
                        break;
                    }

                    else{
                        System.out.println("Erro ao adicionar a validade do produto, tente novamente");
                    }
            
                }while (true);
            }catch(Exception e){
                System.out.println("Erro ao adicionar a validade do produto, tente novamente");
            }
            //QUANTIDADE DO PRODUTO EX: QUANTIDADE 5
            try{
                do{
                    System.out.println("QUANTIDADE DO PRODUTO");
                    produto = in.nextLine();
                    if(produto.length()>= 1){
                        break;
                    }   
                }while (true);
            }catch(Exception e){
                System.out.println("Erro ao adicionar a quantidade do produto, tente novamente");
            }
            //VERIFICAR O PREÇO DO PRODUTO
            
            try{
                do{
                    System.out.println("PREÇO DO PRODUTO EM REAL");
                    produto = in.nextLine();
                    if(produto.length() >= 4){
                        break;
                    }

                }while (true);
            }catch(Exception e){
                System.out.println("O NÚMERO TEM QUE SER EM REAL EX: R$ 3.99");

            }
            //VALIDAR O NOME DO FORNECEDOR
            try{
                do{
                    System.out.println("FORNECEDOR");
                    produto = in.nextLine();
                    if(produto.length() >= 5){
                        break;
                    }

                }while(true);
            }catch(Exception e){
                System.out.println("INSIRA DE FORMA CORRETA. EX: FORNECEDOR DE ROUPAS DA EMPRESA XXXX");
            }
            System.out.println("Produto adicionado no Sistema");
            //PRODUTO ADICIONADO/SALVO NO BANCO DE DADOS
        return true;
        

    }
}