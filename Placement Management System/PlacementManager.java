import java.util.ArrayList;
 class PlacementManager {
    ArrayList<student> students =new ArrayList<>();
    ArrayList<Company> companies=new ArrayList<>();
    void addStudent(student s){
        students.add(s);
        System.out.println("Student Added Successfully");
    }
    //add a company
    void addCompany(Company c){
        companies.add(c);
        System.out.println("companies added successfully");
    }
    //display all students
    void displayStudents(){
        if(students.isEmpty()){
            System.out.println("No Student List");
            return;
        }
        
        System.out.println("\n------Student List---------");
        for(student s: students ){
            s.print();
            System.out.println();
        }
    }
    void displayCompanies(){
        if(companies.isEmpty()){
            System.out.println("No Companies Found. ");
            return;
        }
        System.out.println("\n--------Company list-----");
        for(Company c: companies){
            c.print();
            System.out.println();
        }
    }
    void searchStudent(int id){
        for(student s: students){
            if(s.ID==id){
                System.out.println("Student found!");
                s.print();
                return;
            }
            else{
                System.out.println("Student not found !");
            }
        }
    }
    void searchCompany(int id){
        for(Company c: companies){
            if(c.companyId==id){
                System.out.println("Company found!");
                c.print();
                return;
            }
            else{
                System.out.println("company not found!");
            }
        }
    }
    void deleteStudent(int id){
        for(int i=0;i<students.size();i++){
            if(students.get(i).ID==id){
                students.remove(i);
                System.out.println("Student removed succesfully");
                return;
            }
            else System.out.println("student not found");
        }
    }
    void deleteCompany(int id){
        for (int i=0;i<companies.size();i++){
            if(companies.get(i).companyId==id){
                companies.remove(i);
                System.out.println("company removed successfully");
                return;
            }
            else System.out.println("Company not found!");
        }

    }
    void checkEligibility(Student s,Company c){
        if(student.CGPA>=)
    }
}
