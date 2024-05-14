public class max_Two {
    public static void main(String[] args) 
        {
            int number1 = 10;
            int number2 = 20;
            int number3 = 15;
            System.out.println("The maximum among " + number1 + ", " + number2 + ", and " + number3 + " is: " + max(number1, number2, number3));
        }
        public static int max(int a, int b, int c) 
        {
            return max(max(a, b), c);
        }
    
        public static int max(int a, int b) 
        {
            return (a > b) ? a : b;
        }
    
        
    }
    

