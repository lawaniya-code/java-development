

public class Main {
    public static void main(String[] args) {
        student s1= new student(101,"lawaniya","ICT",8.2);
        student s2=new student (102,"himanshi","ICT",9);
        System.out.println();
        Company c1=new Company(12,"Microsoft",8);
        Company c2=new Company(13,"Google",9);
        PlacementManager pm=new PlacementManager();
        pm.addStudent(s1);
        pm.addStudent(s2);
        pm.addCompany(c1);
        pm.addCompany(c2);
        pm.displayCompanies();
        pm.displayStudents();
        // pm.searchStudent(101);
        // System.out.println();
        // pm.searchCompany(2);
        pm.deleteStudent(102);
        pm.displayStudents();
        pm.deleteCompany(4);

    }
}
