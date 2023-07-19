package aula49;

public class TestandoFinallyPegadinha {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for(int i=0; i<numeros.length; i++) {
            try {
                double divisao = numeros[i] / denom[i];
                System.out.println("A divisão de " + numeros[i] + " por " + denom[i] + " é = " + divisao);
                System.exit(0);
            } catch (ArithmeticException exception) {
                System.out.println("Erro ao dividir por zero");
                System.exit(0);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Posição do array inválida");
                System.exit(0);

            } finally {
                System.out.println("Essa linha é sempre aparece depois de try e catch");
            }

        }
    }
    }
