public class Mechanic {
    public static void main(String[] args) {

        int number;
        number = (int) (Math.random() * 100);

        if (number > 75) {
            System.out.println("Final boss attacks with sword");
        } else {
            System.out.println("You lose");
        }
        }
    }
