import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero1");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o numero2");
        int numero2 = scanner.nextInt();

        try{
            contar(numero1, numero2);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException{
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        } else {
            int repeticao = param2 - param1;

            for (int i = 0; i < repeticao; i++) {
                System.out.println(i + 1);
            }

            System.out.println("O total de repetições foi: " + repeticao);
        }
    }
}