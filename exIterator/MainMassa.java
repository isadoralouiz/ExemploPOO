package exIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainMassa {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
        Massa m1 = new Massa("vermelho", 50.00, "spaguette");
        Massa m2 = new Massa("branco", 45.00, "fetuccini");
        Massa m3 = new Massa("bolonhesa", 35.90, "penne");
        Massa m4 = new Massa("polmodoro", 30.50, "raviolli");

        ArrayList<Massa> listMassa = new ArrayList<Massa>();
        listMassa.add(m1);
        listMassa.add(m2);
        listMassa.add(m3);
        listMassa.add(m4);

        Iterator<Massa> i = listMassa.iterator();
        while(i.hasNext()){
            for (Massa massa : listMassa) {
                i.next();
                System.out.println("----------------- Massas ---------------------");
                System.out.println("Tipo Massa: " + massa.getTipoMassa());
                System.out.println("Molho Massa: " + massa.getMolhoMassa());
                System.out.println("Valor Massa: " + massa.getMolhoMassa());
            }
        }
    }
}
