import static java.lang.IO.*;
void main() {

    int senha = 1234;
    boolean acesso = false;

            for (int i = 1; i <= 3; i++) {
                int tentativa = Integer.parseInt(readln("digite a sua senha"));

                if (tentativa == senha) {
                    System.out.println("acesso liberado");
                    acesso = true;
                    break;
                } else {
                    System.out.println("Senha incorreta! Tentativa " + i + " de 3.");
                }
            }

            if (!acesso) {
                System.out.println("conta bloqueada");
            }
        }


