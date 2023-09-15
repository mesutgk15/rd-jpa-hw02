package rd.hw02.rd.hw02.clients;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import rd.hw02.models.Course;
import rd.hw02.models.Instructor;
import rd.hw02.models.Student;
import rd.hw02.models.VisitingResearcher;
import rd.hw02.utils.EntityManagerUtils;

public class SalaryTestClient {

    public static void main(String[] args) {
        EntityManager em =  EntityManagerUtils.getEntityManager("mysqlPU");

        //Set rate and hour for VisitingResearchers
        em.find(VisitingResearcher.class, 1).setHourlyRate(100);
        em.find(VisitingResearcher.class, 1).setWorkingHours(5);

        System.out.println(em.find(Instructor.class, 1).calculateSalary());
        System.out.println(em.find(Instructor.class, 2).calculateSalary());

    }
}
