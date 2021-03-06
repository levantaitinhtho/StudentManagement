package studentmanagement;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        Scanner scan = new Scanner(System.in);
        do{
            showMenu();
            System.out.println("Enter choose: ");
            choose = Integer.parseInt(scan.nextLine());
            switch (choose){
                case 1:
                    int n;
                    System.out.println("Enter Number Student ");
                    n = Integer.parseInt(scan.nextLine());
                    for(int i=0;i<n;i++){
                        Student std = new Student();
                        std.inputInfo();

                        studentList.add(std);
                    }
                    break;
                case 2:
                    for(int i=0;i<studentList.size();i++){
                        studentList.get(i).showInfo();
                    }
                    break;
                case 3:
                    int maxIndex =0, minIndex=0;
                    float minMark,maxMark;
                    minMark = studentList.get(0).getMark();
                    maxMark = studentList.get(0).getMark();
                    for(int i=1;i<studentList.size();i++){
                        if(studentList.get(i).getMark()<minMark){
                            minIndex = i;
                            minMark = studentList.get(i).getMark();
                        }
                        if(studentList.get(i).getMark()>maxMark){
                            maxIndex = i;
                            maxMark = studentList.get(i).getMark();
                        }
                        System.out.println("Student MaxMark: ");
                        studentList.get(maxIndex).showInfo();
                        System.out.println("Student MinMark: ");
                        studentList.get(minIndex).showInfo();
                    }
                    break;
                case 4:
                    System.out.println("Enter rollNo: ");
                    String rollNoSearch = scan.nextLine();
                    int count =0;
                    for(Student student : studentList){
                        if(student.getRollNo().equalsIgnoreCase(rollNoSearch)){
                            student.showInfo();
                            count ++;
                        }
                        if(count==0){
                            System.err.println("No Student in List");
                        }
                    }
                    break;
                case 5:
                    //B1 Sort thong tin sinh vien theo thu tu A->Z
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student student, Student t1) {
                            int cmp = student.getName().compareTo(t1.getName());
                            if(cmp >=0){
                                return -1;
                            }else{
                                return 1;
                            }
                        }
                    });
                    //B2.Hien Thi
                    for(int i=0;i<studentList.size();i++){
                        studentList.get(i).showInfo();
                    }
                    break;
                case 6:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student student, Student t1) {
                            return student.getMark() >= t1.getMark()?-1:1;
                        }
                    });
                    for(int i=0;i<=studentList.size();i++){
                    if(studentList.get(i).checkScholarship()){
                        studentList.get(i).showInfo();
                    }
                }
                    break;
                case 7:
                    System.out.println("GoodBye !!!!");
                    break;
                default:
                    System.err.println("Enter Again");
            }
        }while (choose != 7);
    }
    static void showMenu(){
        System.out.println("1.Nh???p v??o n sinh vi??n: ");
        System.out.println("2.Hi???n th??? th??ng tin sinh vi??n: ");
        System.out.println("3.Hi???n th??? max v?? min theo ??i???m trung b??nh");
        System.out.println("4.T??m ki???m theo m?? sinh vi??n: ");
        System.out.println("5.Sort theo A->Z theo t??n sinh vi??n v?? hi???n th???");
        System.out.println("6.Hi???n th??? sinh vi??n ???????c h???c b???ng v?? sort theo th??? t??? gi???m d???n");
        System.out.println("7. Exit");
    }
}
