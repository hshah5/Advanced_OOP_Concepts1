import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Resume {
/* TODO */
//Same two inner classes and member variables as in task 3.
    /* TODO */
//Same initialization of Person and the List of Education objects
 /* TODO */
//Initialize the priority queue in one line, without importing the Comparator interface.

/* TODO */
//The getter for experience and the methods to add education and experience objects stay the same, as well as the toString()
    /* TODO */
//The imports will self populate. You don't have to do anything.

        /* TODO */
//Copy the two inner classes of Resume exactly as they were in Task 2. Copy->paste.
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
//Create a member variable of type Person (exactly as in task 2)
        private Person p;
        /* TODO */
//Create a List to hold values of type Education (exactly as in task 2)
        private List<Education> ed;
        /* TODO */
//Create a Priority Queue that holds values of type Experience.
        private PriorityQueue<Experience> ex;
        public Resume(Person p) {

            /* TODO */
//Assign a value to the Person variable.
            this.p = p;
            /* TODO */
//Initialize the List with Education objects.
            ed = new ArrayList<>();
            /* TODO */
//Initialize the priority queue with a comparator defined in an anonymous inner class. Check the specs for the comparator.
            ex = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.toYear, o1.toYear));
        }

        public PriorityQueue<Experience> getExperience(){
            return this.ex;
        }

        /* TODO */
//Add a standard getter for the experiences. getExperience. it should return a priority queue.
        public void addEducation(Education e) {
            ed.add(e);
        }
        public void addExperience(Experience e) {
            ex.add(e);
        }
        public String toString(){
            String s = p.toString();
            s+= "\nExperience";
            for(Experience e : ex)
                s+="\n+e";
            s+= "\nEducation\n";
            for(Education e : ed)
                s+="\n+e";
            return s;
        }
        /* TODO */
//Implement the addEducation, addExperience and override the toString() methods exactly as you did in task 2 (Copy->Paste)


    }
