public class Task {
    public static void main(String[] args){
/* TODO */
//Copy the Task from task 2 here and add experiences where the end years are not in order.
// Watch it print the resume with the dates in order from most recent to least.

  Person p = new Person("Kim Possible", "2000-01-01");
    p.setPosition("Associate", 34000);
    Resume r = new Resume(p);
    Resume.Education ed = r.new Education("NEIU", "Computer Science");
    r.addEducation(ed);
    Resume.Experience ex = new Resume.Experience("Barista", 2017, 2018);
    r.addExperience(ex);
    r.addExperience(new Resume.Experience("Cashier", 2018, 2019));
    r.addExperience(new Resume.Experience("Associate", 2019, 2021));
        System.out.println(r);

    }
}