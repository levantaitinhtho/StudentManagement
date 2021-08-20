package studentmanagement;
import java.util.Scanner;

public class Student extends Person{
    String rollNo;
    float mark;
    String email;

    public Student() {
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(";rollNo:  "+rollNo+"; mark; "+ mark+"; email: "+email);
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter rollNo: ");
        while(true){
            String rollNoInput = input.nextLine();
            boolean check = setRollNo(rollNoInput);
            if(check){
                break;
            }
        }
        System.out.println("Enter Mark: ");
        while(true){
            float markInput  = Integer.parseInt(input.nextLine());
            boolean check = setMark(markInput);
            if(check){
                break;
            }
        }
        System.out.println("Enter Email: ");
        while(true){
            String emailInput = input.nextLine();
            boolean check = setEmail(emailInput);
            if(check){
                break;
            }
        }
    }

    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo != null && rollNo.length()==8){
            this.rollNo = rollNo;
            return true;
        } else{
            System.err.println("Enter Again: ");
            return false;
        }


    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if(mark >=0 && mark <=10){
            this.mark = mark;
            return true;
        }else{
            System.err.println("Enter Again: ");
            return false;
        }
    }
    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@")&& !email.contains(" ")){
            this.email = email;
            return true;
        }else{
            System.err.println("Enter Again: ");
            return false;
        }
    }
    public boolean checkScholarship(){
        if(mark >=8){
            return true;
        }else{
            return false;
        }
    }
}
