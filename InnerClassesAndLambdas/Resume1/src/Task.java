public class Task {
    public static void main(String[] args){
        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        /* TODO */
//Create an education object. Schoo is NEIU, major is Computer Science.
        Resume.Education ed = r.new Education("NEIU", "Computer Science");
        /* TODO */
//add this education object to the resume "r"
        r.addEducation(ed);
        /* TODO */
//Create a new Experience object and add it to the resume.
        Resume.Experience ex = new Resume.Experience("Barista ", 2017, 2018);
        r.addExperience(ex);

        /* TODO */
//Create a new experience object on the fly, inside the addExperiece call.
        r.addExperience(new Resume.Experience("Cashier ", 2018, 2019));

        /* TODO */
//Add another experience object on the fly as you add it.

        r.addExperience(new Resume.Experience("Associate ", 2019,2021));
                System.out.println(r); //watch the resume print.

    }
}