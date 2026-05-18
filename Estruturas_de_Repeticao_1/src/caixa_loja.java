
import static java.lang.IO.*;

void main() {
    double totalCompra = 0;

    while (true) {
        double valor = Double.parseDouble(readln("Digite o valor do produto (ou 0 para finalizar): "));

        if (valor == 0) {
            break;
        }
        totalCompra += valor;
    }

    println("Valor total da compra: R$ " + totalCompra);
}
