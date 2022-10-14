public class Main {
    public static void main(String[] args) {

        System.out.println("The sum of the numbers is: " + addNumbers(5 , 4 , 9));

        Car car = new Car();
        car.getDoor();
        System.out.println("The number of doors is: " + car.door);
    }
    public static int addNumbers(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }
}
