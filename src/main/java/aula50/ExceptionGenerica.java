package aula50;

public class ExceptionGenerica {

    public static void main(String[] args) {


        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++){
            try{
                int divisao = numeros[i]/denom[i];
                System.out.println("A divisão de " + numeros[i] + " por " + denom[i] + " é igual a " + divisao);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
