package exeEnumDate;

import java.util.*;

public class Main {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Isadora", "45999136436");
        Cliente c2 = new Cliente("Rosane", "45999491510");

        System.out.println("digite a quantidade de pizza que sd");

    }

    public static int qtdPizza(){
        int qtdPizza = 0;

        qtdPizza = LER.nextInt();
        return qtdPizza;
    }
}
