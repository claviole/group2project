

public class main {

    //Elijah's Function
    public static void elijah(int n){
        for(int i = 0; i < n; ++i){
            System.out.println(":D");
        }
  
    
    
    public static  char convertToAscii (int a){
    char ascii = (char)a;
    return ascii;
    }
    
    //Christian Laviolette
    public static void christian(String[] args) {
        System.out.println("Hello, World!");

        int luckyNumber = davidsFunction();
    }

    public static int add(int x, int y) {
        return x+y;
    }


    static void davidsFunction() {
        int rand_x,rand_y;
        Random rand = new Random(); 
        rand x = rand.nextInt(rand_x);
        rand y = rand.nextInt(rand_y);

        System.out.println("Your lucky number is: " + (x + y));
    }
    
}
