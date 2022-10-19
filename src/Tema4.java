public class Tema4 {

    public void ifTest(int numberIf){
        System.out.println("\nInicio If \n");
        if(numberIf > 0){
            System.out.println("El número ingresado es positivo");
        } else if (numberIf < 0) {
            System.out.println("El numero ingresado es negativo");
        }else {
            System.out.println("El numero ingresado es 0");
        }
    }

    public void whileTest(int numeroWhile){
        System.out.println("\nInicio ciclo while \n");
        while (numeroWhile < 3){
            System.out.println("El valor que tiene la variable es "+ numeroWhile);
            numeroWhile ++;
        }
    }

    public void  doWhileTest(int numeroWhile){
        System.out.println("\nInicio ciclo do while \n");
        do {
            System.out.println("El valor que tiene la variable es "+ numeroWhile);
        }while (false);
    }

    public void forTest(){
        System.out.println("\nInicio ciclo for \n");
        for (int numeroFor = 0; numeroFor < 3; numeroFor ++){
            System.out.println("El valor de numeroFor es: "+numeroFor);
        }
    }

    public void switchTest(String season){
        System.out.println("\nInicio ciclo switch \n");
        switch (season.toLowerCase()){
            case "spring":
                System.out.println("It's in "+ season);
                break;
            case "fall":
                System.out.println("It's in "+ season);
                break;
            case "winter":
                System.out.println("It's in "+ season);
                break;
            case "summer":
                System.out.println("It's in  "+ season);
                break;
            default:
                System.out.println("The word entered is not a season: " + season);

        }

    }


}
