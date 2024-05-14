public class Max {
    public static void main(String[] args)
     {
        int num_One = 10;
        int num_Two = 20;
        System.out.println("The maximum between " + num_One + " and " + num_Two + " is: " + max(num_One, num_Two));
    }
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    
}
    

