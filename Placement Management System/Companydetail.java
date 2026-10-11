
class Company{
    int companyId;
    String companyName;
    double minimumCgpa;

    void print(){
        System.out.print(companyId+" "+companyName+" "+minimumCgpa);
    }
    Company(int a,String b,double c){
        companyId=a;
        companyName=b;
        minimumCgpa=c;
    }
}
