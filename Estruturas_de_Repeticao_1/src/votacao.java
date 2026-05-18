import static java.lang.IO.*;

void main() {
    int joao = 0;
    int maria = 0;
    int nulo = 0;

    for (int i = 1; i <= 10; i++) {
        int voto = Integer.parseInt(readln("Vote [1-João, 2-Maria, Outro-Nulo]: "));

        if (voto == 1) {
            joao++;
        } else if (voto == 2) {
            maria++;
        } else {
            nulo++;
        }
    }

    println("\n--- Resultado da Urna ---");
    println("João: " + joao + " votos");
    println("Maria: " + maria + " votos");
    println("Nulos: " + nulo + " votos");

    if (joao > maria) {
        println("Vencedor: João");
    } else if (maria > joao) {
        println("Vencedor: Maria");
    } else {
        println("Resultado: Empate");
    }
}
