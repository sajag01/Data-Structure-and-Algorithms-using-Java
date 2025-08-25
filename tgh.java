public class tgh{
    public static void main(String[] args) {
        int n = 7;
        for(int i = 0; i < n/2; i++){
            System.out.print("*");
            for(int j = 0; j < n+2; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<n+3; i++){
            System.out.print("*");
        }
        for(int j = 0; j < n/2+1; j++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = n/2; i > 0; i--){
            System.out.print("*");
            for(int j = 0; j < n+2; j++){
                System.out.print(" ");
            }
            for(int k = 1; k < i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}