package Statick;

public class Student implements StudetInterface {
    int age ;
    int psp;
    String batch;

    public Student(int age, int psp, String batch) {
        this.age = age;
        this.psp = psp;
        this.batch = batch;
        //CollegeName = " Shrikrishnan ";
                call();

    }
    public void call(){
        StudentsDetails(this.age,this.psp,this.batch);

    }
    @Override
    public void StudentsDetails(int age, int psp, String batch) {
        System.out.println(age + " Age "+ psp +" Psp "+ batch +"Batch"+ CollegeName);
        StudentMarks(psp*10);

        // CollegeName = " Shrikrishnan "
    }

    @Override
    public void StudentMarks(int marks) {
            System.out.println("Marks" + marks);
    }
}
