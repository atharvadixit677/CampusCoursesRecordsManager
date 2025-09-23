package edu.ccrm.io;

import edu.ccrm.domain.Student;
import edu.ccrm.domain.Courses;
import edu.ccrm.domain.Enrollment;
import java.util.List;
import java.util.ArrayList;

public class ImportExportServiceImpl implements ImportExportService {

    @Override
    public List<Student> importStudents(String filePath) {
        System.out.println("Importing students from " + filePath + " (prototype mode)");
        return new ArrayList<>(); // Return empty for prototype
    }

    @Override
    public List<Courses> importCourses(String filePath) {
        System.out.println("Importing courses from " + filePath + " (prototype mode)");
        return new ArrayList<>();
    }

    @Override
    public List<Enrollment> importEnrollments(String filePath) {
        System.out.println("Importing enrollments from " + filePath + " (prototype mode)");
        return new ArrayList<>();
    }

    @Override
    public void exportStudents(List<Student> students, String filePath) {
        System.out.println("Exporting students to " + filePath + " (prototype mode)");
    }

    @Override
    public void exportCourses(List<Courses> courses, String filePath) {
        System.out.println("Exporting courses to " + filePath + " (prototype mode)");
    }

    @Override
    public void exportEnrollments(List<Enrollment> enrollments, String filePath) {
        System.out.println("Exporting enrollments to " + filePath + " (prototype mode)");
    }
}
