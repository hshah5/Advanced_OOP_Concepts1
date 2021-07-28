import java.time.LocalDate;
import java.time.Period;
/* TODO */
//Import the java.time.LocalDate and java.time.Period classes.
//You will need them later.

/* TODO */
//Declare the class
public class Person {

    private String name;
    private LocalDate birthDate;

    private class Position {
        String name;
        double salary;

        Position(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + " : " + salary;
        }
    }

    /* TODO */
//Create two private member variables to hold the name and the birthDate of the employee. The birthdate has to be a LocalDate

    /* TODO */
/*Create a member inner class called Position with two member variables: a name and
a salary. Override the toString() method as specified in the instructions*/

    /* TODO */
    //Create a member variable(of Person) of type Position.
    private Position position;


    /* TODO */
    //Create a constructor for Person that takes in two Strings.
    //A name and a birthdate in ISO format(yyyy-mm-dd) and sets the corresponding memeber variables correctly
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    /* TODO */
    //Create a getAge method that returns the age in years of this person.
    //You need to use the Period class here.
    public int getAge() {
        return -1 * Period.between(LocalDate.now(), this.birthDate).getYears();
    }
    /* TODO */
    //Code the setPosition method.
    //This should take one String and one double for the title and the salary respectively.
    public void setPosition(String name, double salary) {
        this.position = new Position (name,salary);
    }

    /* TODO */
    //A getter for position .
    public Position getPosition() {
        return this.position;
    }

    /* TODO */
    //Override the toString() method to display the person's name, age and position (with salary and title).
    public String toString() {
        return name + " - " + getAge() + " : " + this.position;
    }
    /* TODO */
    //Finish closing curly braces and the class.
}


/* TODO */
//Copy the Person class from Task 2 here. Copy->Paste
