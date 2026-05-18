import java.util.Scanner;
import static java.lang.IO.*;

void main() {

    Scanner sc = new Scanner(System.in);
    int n1, n2, n3, n4, nf;
    String nome;

    for (int i=1; i <= 4; i++) {
        System.out.println("nome do aluno: " +i);
        nome = sc.nextLine();

        n1 = Integer.parseInt(readln("digite a nota 1: "));
        n2 = Integer.parseInt(readln("digite a nota 2: "));
        n3 = Integer.parseInt(readln("digite a nota 3: "));
        n4 = Integer.parseInt(readln("digite a nota 4: "));
        nf = (n1 + n2 + n3 + n4) /4;
        System.out.println("media: " +nf);

        if(nf <=5){
            System.out.println("reprovado ");
        }
        else if(nf ==6){
            System.out.println("repureção");
        }else{
            System.out.println("aprovado");
        }
    }


}

