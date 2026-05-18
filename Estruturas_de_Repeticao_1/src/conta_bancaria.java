import static java.lang.IO.*;

void main() {
    double saldo = 500.00;
    boolean rodando = true;

    while (rodando) {
        println("\n--- Menu (Saldo Atual: R$ " + saldo + ") ---");
        println("1 - Saque");
        println("2 - Depósito");
        println("3 - Saldo");
        println("0 - Sair");
        int opcao = Integer.parseInt(readln("Escolha uma opção: "));

        if (opcao == 1) {
            double valorSaque = Double.parseDouble(readln("Valor do saque: "));
            if (valorSaque <= 0) {
                println("Operação cancelada: Valor inválido.");
            } else if (valorSaque > saldo) {
                println("Operação cancelada: Saldo insuficiente.");
            } else {
                saldo -= valorSaque;
                println("Saque realizado com sucesso!");
            }
        } else if (opcao == 2) {
            double valorDeposito = Double.parseDouble(readln("Valor do depósito: "));
            if (valorDeposito <= 0) {
                println("Operação cancelada: Valor inválido.");
            } else {
                saldo += valorDeposito;
                println("Depósito realizado com sucesso!");
            }
        } else if (opcao == 3) {
            println("Seu saldo atual é: R$ " + saldo);
        } else if (opcao == 0) {
            println("Sistema encerrado. Até logo!");
            rodando = false;
        } else {
            println("Opção inválida!");
        }
    }
}
