class Student{
    private int studentId;
    private String name;
    private int age;
    private int GPA;
    public Student(int studentId, String name, int age, int GPA){
        this.studentId=studentId;
        this.name=name;
        this.age=age;
        this.GPA=GPA;
    }
    public int getStudentID(){
        return studentId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getGPA(){
        return GPA;
    }
    public String toString(){
        return studentId+" "+name+" "+age+" "+GPA;
    }
}

class School{
    private int totalStudentsEnrolled;
    private Student[] students;
    public School(int totalStudentsEnrolled){
        this.totalStudentsEnrolled=totalStudentsEnrolled;
        this.students=new Student[totalStudentsEnrolled];
    }
    int i=0;
    public void enrollStudents(Student stud){
        if(i<=totalStudentsEnrolled){
            students[i]=stud;
            i++;
        }
    }
    public void displayAllStudents(){
        for(int i=0;i<totalStudentsEnrolled-1;i++)
            for(int j=i+1;j<totalStudentsEnrolled;j++)
                if(students[i].getName().compareTo(students[j].getName())>0){
                    Student aux;
                    aux=students[i];
                    students[i]=students[j];
                    students[j]=aux;
                }
        for(int i=0;i<totalStudentsEnrolled;i++)
            System.out.println(students[i]);
    }
    public double calculateAverageGPA(){
        double avg=0;
        for(int i=0;i<totalStudentsEnrolled;i++)
            avg=avg+(double)students[i].getGPA();
        avg=avg/totalStudentsEnrolled;
        return avg;
    }
    public int getTotalStudentsEnrolled(){
        return totalStudentsEnrolled;
    }
}



class Partial{
    public static void main(String[] args){
        Student stud1=new Student(1,"John",18,10);
        Student stud2=new Student(2,"Michael",19,9);
        Student stud3=new Student(3,"Gabriel",20,10);
        Student stud4=new Student(4,"Alex",18,8);
        Student stud5=new Student(5,"Daniel",19,9);
        School sch=new School(5);
        sch.enrollStudents(stud1);
        sch.enrollStudents(stud2);
        sch.enrollStudents(stud3);
        sch.enrollStudents(stud4);
        sch.enrollStudents(stud5);
        sch.displayAllStudents();
        System.out.println(sch.calculateAverageGPA());
        System.out.println(sch.getTotalStudentsEnrolled());
    }
}