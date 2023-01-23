package fixmeret;

public class Tombok {
    public static void main(String[] args) {
        
    int[] sorozat = {3, 5 , 1};
    kiirTomb(sorozat);
    valtoztatTomb(sorozat);
        kiirTomb(sorozat);
        
        
       int[][] negyzetes = new int[3][5];
       negyzetes[1][0] = 1;
        kiirTomb(negyzetes);
        
        // fűrészes
        int[][] fureszes = new int[5][];
        for (int i = 0; i < fureszes.length; i++) {
            fureszes[i] = new int[(int) (Math.random()*5)+2];
        }
        System.out.println("Fürészes");
        kiirTomb(fureszes);
    }
    // ez bárhány hosszú tömmbbel műdödik
    private static void kiirTomb(int[][] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                System.out.print(tomb[i][j] + " ");
            }
         System.out.println("");
        }
    }

    private static void kiirTomb(int[] tomb) {
        for (int i : tomb) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    private static void valtoztatTomb(int[] tomb) {
        tomb[0] = -11;
    }
    
}
