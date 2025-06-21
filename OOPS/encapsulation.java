package encapsulation;
import java.util.Scanner;
class student {
    private String name;
    private int age;
    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    } 
    public void setAge(int newAge){
        if(newAge>0){
            age=newAge;
        }
    }
    public int getAge(){
        return age;
    }
}
public class studentExample{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        student s1=new student();
        System.out.println("Enter your name : ");
        String nameInput =input.nextLine();
        s1.setName(nameInput);
        System.out.println("Ster your age : ");
        int ageInput=input.nextInt();
        s1.setAge(ageInput);
        System.out.println("----------------STUDENT DETAILS-------------");
        System.out.println("name : "+s1.getName());
        System.out.println("age : "+s1.getAge());
        input .close();
    }
}
