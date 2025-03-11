class Student {
    int rollnumber;
    String name;
    int[]marks=new int[5];
    int calculateTotalMarks(){
        int total=0;
        for(int mark:marks){
            total=total+mark;
        }
        return total;
    }
    double calculatepercentage(){
        int marks=calculateTotalMarks();
        return marks/5.0;
    }
    void displaydetails(){
        System.out.println("Roll Number: "+rollnumber);
        System.out.println("Name: "+name);
        System.out.println("Total Marks: "+calculateTotalMarks());
        System.out.println("Percentage: "+calculatepercentage()+"%");
    }
}
public class studentapp{
    public static void main(String[] agrs){
        Student student=new Student();
        student.rollnumber=101;
        student.name="Rakib";
        student.marks=new int[]{85,90,78,88,92};
        student.displaydetails();
    }
}
