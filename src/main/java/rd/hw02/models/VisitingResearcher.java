package rd.hw02.models;

import jakarta.persistence.Entity;

@Entity
public class VisitingResearcher extends Instructor{

    private double workingHours;
    private double hourlyRate;

    public VisitingResearcher() {
    }

    public VisitingResearcher(String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }
}
