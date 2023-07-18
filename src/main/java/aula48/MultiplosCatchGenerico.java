package aula48;

public class MultiplosCatchGenerico {

    public static void main (String[] args){

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4 , 8, 0};

        for(int i = 0; i<numeros.length; i++){
            try {
                double divisao = numeros[i]/denom[i];
                System.out.println("A divisão de " + numeros[i] + " por " + denom[i] + "é igual a " + divisao);
            } catch (ArithmeticException exception){
                System.out.println("Erro ao dividir por zero");
            } catch (Throwable exception){
                System.out.println("Houve um erro");
            }
        }
    }
}
