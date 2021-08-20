package studentmanagement;

import java.util.Scanner;

public class Person {
    String name;
    String gender;
    String birthday;
    String address;

    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = input.nextLine();
        System.out.println("Enter Gender: ");
        gender = input.nextLine();
        System.out.println("Enter Birthday: ");
        birthday = input.nextLine();
        System.out.println("Enter Address: ");
        address = input.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println(toString());
    }
}
