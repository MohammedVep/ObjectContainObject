//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Car car = new Car();
        person.name = "Mohammed";
        car.model = "Hyundai Elantra";
        car.owner = person;
        System.out.println("Car model is " + car.model);
        System.out.println("Car owner name is " + car.owner.name);
    }
}