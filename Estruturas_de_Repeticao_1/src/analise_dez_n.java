import static java.lang.IO.*;

void main() {
    double somaTotal = 0;
    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;
    double somaPares = 0;
    double somaImpares = 0;
    int qtdPares = 0;
    int qtdImpares = 0;

    for (int i = 1; i <= 10; i++) {
        double num = Double.parseDouble(readln("Digite o " + i + "º número: "));

        somaTotal += num;

        if (num > maior) {
            maior = num;
        }
        if (num < menor) {
            menor = num;
        }

        if (num % 2 == 0) {
            somaPares += num;
            qtdPares++;
        } else {
            somaImpares += num;
            qtdImpares++;
        }
    }

    double media = somaTotal / 10;

    println("\n--- Resultados ---");
    println("Soma total: " + somaTotal);
    println("Média: " + media);
    println("Maior número: " + maior);
    println("Menor número: " + menor);
    println("Soma dos pares: " + somaPares);
    println("Soma dos ímpares: " + somaImpares);
    println("Quantidade de pares: " + qtdPares);
    println("Quantidade de ímpares: " + qtdImpares);
}
