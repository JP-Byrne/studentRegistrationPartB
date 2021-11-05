import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sampleTest {
    @Test
    public void test(){
        //Creating two modules list for two students
        ArrayList s1Modules = new ArrayList();
        ArrayList s2Modules = new ArrayList();
        //Creating 3 different course
        CourseProgramme ECE = new CourseProgramme("ECE", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 5, 1, 0, 0));
        CourseProgramme EEE = new CourseProgramme("EEE", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 5, 1, 0, 0));
        CourseProgramme Irish = new CourseProgramme("Irish", new DateTime(2021, 9, 1, 0, 0), new DateTime(2022, 5, 1, 0, 0));
        //Creating 5 different modules
        Modules SOC = new Modules("System on chip", "EE-452");
        Modules EMS = new Modules("Embedded Systems", "EE-347");
        Modules MAE = new Modules("Mobile Architecture Engineering", "EE-517");
        Modules SE = new Modules("Software Engineering", "CT-417");
        Modules IRE = new Modules("Irish language", "IRE-003");
        //Creating 2 courses lists for each student
        ArrayList s1Courses = new ArrayList();
        ArrayList s2Courses = new ArrayList();
        //Adding modules to student1's modules list
        s1Modules.add(SOC);
        s1Modules.add(EMS);
        s1Modules.add(MAE);
        s1Modules.add(SE);
        s1Modules.add(IRE);

        //Adding modules to student2's modules list
        s2Modules.add(SOC);
        s2Modules.add(EMS);
        s2Modules.add(MAE);
        //Adding modules to the courses
        ECE.addModule(SOC);
        ECE.addModule(EMS);
        ECE.addModule(MAE);
        ECE.addModule(SE);

        EEE.addModule(SOC);
        EEE.addModule(EMS);
        EEE.addModule(MAE);

        Irish.addModule(IRE);
        //Adding the courses to each students course list
        s1Courses.add(ECE);
        s1Courses.add(Irish);
        s2Courses.add(EEE);
        //Creating two students
        Student s1 = new Student("JP Byrne", new DateTime(1999, 12, 2, 0, 0), 18391636, s1Courses, s1Modules );
        Student s2 = new Student("Eoin Daly", new DateTime(2000, 1, 20, 0, 0), 12345678, s2Courses, s2Modules );
        //adding students to the modules
        SOC.addStudent(s1);
        SOC.addStudent(s2);
        EMS.addStudent(s1);
        EMS.addStudent(s2);
        MAE.addStudent(s1);
        MAE.addStudent(s2);
        SE.addStudent(s1);
        IRE.addStudent(s1);
        //This test will fail
        //assertEquals(SOC.getStudents().get(1).getUsername(), "EoinDaly 21");
        System.out.println("Courses that "+ s1.getName()+ " is registered for");
        System.out.println(s1.getCourses());
        System.out.println("Modules that "+ s1.getName()+ " is registered for");
        System.out.println(s1.getModules());
        System.out.println("Modules related to course programme"+ ECE.getName());
        System.out.println(ECE.getModules());
        System.out.println("Student that are registered for "+ SOC.getModuleName());
        System.out.println(SOC.getStudents());

    }
}
