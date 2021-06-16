import java.util.ArrayList;

public class AdultPatient  extends Person implements Diagnosable, Employable {
    double temperature;
    int systolic;
    int diastolic;
    ArrayList<String> jobs;

    @Override
    public double getTemperature(){
        return this.temperature;}

    @Override
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    @Override
    public int getSystolic(){
        return this.systolic;
    }
    @Override
    public void setSystolic(int systolic){
        this.systolic = systolic;
    }
    @Override
    public int getDiastolic(){
        return this.diastolic;
    }
    @Override
    public void setDiastolic(int diastolic){
        this.diastolic = diastolic;
    }
    @Override
    public  ArrayList<String> getPreviousJobs(){
        return this.jobs;
    }
    @Override
    public void addJob(String J){
        if(this.jobs == null){
            this.jobs = new ArrayList<String>();

        }

        this.jobs.add(J);
    }
}
