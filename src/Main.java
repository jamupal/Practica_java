public class Main {
    public static void main(String[] args) {

        Tema4 tems4 = new Tema4();

        System.out.println("The sum of the numbers is: " + addNumbers(5 , 4 , 9));

        Car car = new Car();
        car.getDoor();
        System.out.println("The number of doors is: " + car.door);

        //Condicionales
        tems4.ifTest(747);
        tems4.whileTest(0);
        tems4.doWhileTest(4);
        tems4.forTest();
        tems4.switchTest("Cama");
    }
    public static int addNumbers(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }
}
