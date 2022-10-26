public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador worker = new Trabajador();
        //Seccion cliente
        cliente.setAge(17);
        cliente.setPhone("5795879");
        cliente.setName("Manuel Cruz");
        cliente.setCredito(280000);
        //Seccion trabajador
        worker.setAge(37);
        worker.setPhone("58794565");
        worker.setName("Pedro Caballero");
        worker.setSalary(450000);

        System.out.println("El nombre del cliente es: " + cliente.getName());
        System.out.println("La edad de la persona es: " + cliente.getAge());
        System.out.println("El telefono de la persona es: " + cliente.getPhone());
        System.out.println("La persona tiene un credito de: " + cliente.getCredito() + "\n");

        System.out.println("El nombre del Trabajador es: " + worker.getName());
        System.out.println("La edad de la persona es: " + worker.getAge());
        System.out.println("El telefono de la persona es: " + worker.getPhone());
        System.out.println("La persona tiene un salario de: " + worker.getSalary());
    }
    public static int addNumbers(int number1, int number2, int number3){
        return number1 + number2 + number3;
    }
}
