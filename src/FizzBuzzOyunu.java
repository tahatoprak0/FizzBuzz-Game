public class FizzBuzzOyunu {
    public static void main(String[] args) {
        for (int i=1 ; i<=100 ; i++){

            if (i % 15 == 0) {
                System.out.println("Fizz Buzz");
                continue;
            }if (i % 3 == 0){
                System.out.println("Fizz");
                continue;
            } if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);

            }
        }
    }

