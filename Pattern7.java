
public class Pattern7{

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int start = (i % 2 == 1) ? 1 : 0; 

            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start = 1 - start; 
            }
            System.out.println();
        }
    }
}

    
    