package oopsfeature;
/*Create abstract class vaccine.Create two variables age(int),nationality(String).create 2 concrete methods 
firstDose() and secondDose(). 
Scenario 1:user can take the first dose if the user is Indian and age is 18.After vaccination the user has to 
pay 250rs(which will be displayed on the console). 
Scenario 2: Users are eligible to take the second dose only after completing the first dose. 
Scenario 3: create abstract method boosterDose() in abstract class Vaccine.Create one implementation class 
vaccinationSuccessful, where implement boosterDose() method. Create main class vaccination and invoke all methods 
accordingly. 
[Hint:Create constructor to initializevariables age and nationality,Use flow control(Ifelse) to check condition]
 */
abstract class Vaccine //abstract class
{
    int age;
    String nationality;
    boolean firstDoseCompleted = false;

    // Constructor
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Method for first dose
    public void firstDose() {
        if (age >= 18 && nationality.equals("Indian")) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("First dose taken. Please pay 250 Rs.");
            firstDoseCompleted = true;
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Method for second dose
    public void secondDose() {
        if (firstDoseCompleted) {
            System.out.println("You are eligible for the second dose.");
            System.out.println("Second dose taken successfully.");
        } else {
            System.out.println("You are not eligible for the second dose. Please take the first dose first.");
        }
    }

    // Abstract method for booster dose
    public abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {
    // Constructor
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    // Implement booster dose method
 
    public void boosterDose() {
        if (firstDoseCompleted) {
            System.out.println("You are eligible for the booster dose.");
            System.out.println("Booster dose taken successfully.");
        } else {
            System.out.println("You are not eligible for the booster dose. Please complete previous doses first.");
        }
    }
}
public class Vaccination {

	public static void main(String[] args) {
		VaccinationSuccessful v = new VaccinationSuccessful(20, "Indian");

        // Call methods
        System.out.println("First Dose ---");
        v.firstDose();

        System.out.println("\nSecond Dose ---");
        v.secondDose();

        System.out.println("\nBooster Dose ---");
        v.boosterDose();

	}

}
