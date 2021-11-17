import java.util.Scanner;

class ex3_14 {
    public static void main(String[] args) {
        int n, m, p, x, y;
        Scanner teclat = new Scanner (System.in);
        System.out.println("CÀLCUL D'ÀREES \n ------------- \n 1. Quadrat \n 2. Cercles \n 3. Triangle equilàter");
        n = teclat.nextInt();
       System.out.println("BON DIA SOC EN STANISLAV DE 1 DAM");
        if (n == 1) {
            System.out.println("Escriu la mida del costat");
            m = teclat.nextInt();
            System.out.println("L'àrea del quadrat és: " + (m*m));
        }
        if (n == 2) {
            System.out.println("Escriu la mida del radi");
            p = teclat.nextInt();
            System.out.println("L'àrea del cercle és: " + (Math.PI*(Math.pow(p, 2))));
        }
        if (n == 3) {
            System.out.println("Escriu la mida de la base");
            x = teclat.nextInt();
            System.out.println("Escriu la mida de l'altura");
            y = teclat.nextInt();
            System.out.println("L'àrea del triangle és: " + (x*y/2));
        }
    }
}