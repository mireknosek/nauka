package nauka;

public class Tablice {

    public static void main(String[] args) {

        int[][] tab = new int[4][];
        tab[0] = new int[4];
        tab[1] = new int[3];
        tab[2] = new int[2];
        tab[3] = new int[1];
        int licznik = 1;
        int i = 0;
        int j = 0;
        while (i < tab.length) {
            System.out.println("przebieg: " + i);
            while (j < tab[i].length) {
                System.out.println("wpis: " + j);
                tab[i][j] = licznik;
                licznik++;
                j++;
            }
            i++;
        }
        System.out.println(licznik);
        System.out.println("==============");
        i = 0;
        j = 0;
        while (i < tab.length) {
            while (j < tab[i].length) {
                System.out.println(tab[i][j]);
                j++;
            }
            i++;
        }
    }
}


