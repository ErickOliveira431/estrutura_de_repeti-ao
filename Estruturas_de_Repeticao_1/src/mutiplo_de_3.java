import static java.lang.IO.*;

void main() {
    int soma = 0;

    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0) {
            soma += i;
        }
    }

    println("A soma de todos os múltiplos de 3 entre 1 e 100 é: " + soma);
}
