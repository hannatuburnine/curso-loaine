package aula52;

public class UsandoMinhaException {

    public static void main(String[] args) throws DivisaoNaoExata {

        int[] numeros = {4, 8, 16, 21, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i<numeros.length; i++){
            try {
                if (numeros[i] % 2 != 0){
                    throw new DivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i]/denom[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }
        }
    }
}
