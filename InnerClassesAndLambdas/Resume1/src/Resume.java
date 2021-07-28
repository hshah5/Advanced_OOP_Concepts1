import java.util.ArrayList;
import java.util.List;

public class Resume {
/* TODO */
//Create a public member inner class Education according to the specifications.
    public class Education{
        String school;
        String major;

    public String getSchool() {return school;}

    public String getMajor() {return major;}
    public void setSchool(String school){
        this.school = school;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public Education(String school, String major) {
        this.school = school;
        this.major = major;
    }
    @Override
    public String toString() {
        return major + " at " + school;
    }
}

/* TODO */
//Create a public static inner class called Experience, according to the specifications.
    public static class Experience{
        int fromYear;
        int toYear;
        String title;

        public Experience(String title, int from, int to) {
            this.title = title;
            this.fromYear = from;
            this.toYear = to;
        }
    @Override
    public String toString() {
            return fromYear + "-" + toYear + ":" + title;
    }
}

/* TODO */
//Create the Person and List of Education and List of experience objects. They should be private.
   private Person p;
   private List<Education> ed;
   private  List<Experience> ex;


/* TODO */
//This constructor should initialize the person and do all necessary initializations for the other methods to work.
public Resume(Person p){
    this.p = p;
    ed = new ArrayList<>();
    ex = new ArrayList<>();}


/* TODO */
//Create the addEducation, addExperience and override the toString methods as specified.
public void addEducation(Education e) {
    ed.add(e);
}
    public void addExperience(Experience e) {
        ex.add(e);
    }
    @Override
    public String toString() {
        String s = p.toString();
        s+= "\nExperience\n";
        for(Experience e : ex)
            s+= e.toString() + "\n";
        s+= "Education\n";
        for(Education e : ed)
            s+= e.toString() + "\n";
        return s;
    }
}
