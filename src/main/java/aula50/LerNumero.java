package aula50;

import java.util.Scanner;

public class LerNumero {

    public static double lerNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
