
public class praktikum2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 47; i++) {
            
            if (i == 10 || i == 15) {
                continue; 
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } 
            
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            } 
            
            else {
                System.out.print("* ");
            }
        }
        
        System.out.println();
    }
}