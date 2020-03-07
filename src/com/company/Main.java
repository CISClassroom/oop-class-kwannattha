package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student kwan = new Student();
        Student make = new Student();
        Student waii = new Student();
        Student noonnin = new Student();
        Student cream = new Student();
        kwan.name = "นางสาวณัฏฐา ซ้อนศรี";
        kwan.id = "623410032-1";
        kwan.major = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ";
        kwan.sex = "ผู้หญิง";
        make.name = "นายอลงกรณ์ ประดิษฐวงษ์";
        make.id = "623410037-1";
        make.major = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ";
        make.sex = "ผู้ชาย";
        waii.name = "นายพุฒิพงศ์ สักแสน";
        waii.id = "623410008-8";
        waii.major = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ";
        waii.sex = "ผู้ชาย";
        noonnin.name = "นางสาวทิชาพร ลีดี";
        noonnin.id = "623410005-4";
        noonnin.major = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ";
        noonnin.sex = "ผู้หญิง";
        cream.name = "นางสาวเนตรนภา ทะอ่าง";
        cream.id = "623410069-8";
        cream.major = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ";
        cream.sex = "ผู้หญิง";

        System.out.println("1." + kwan.name + " " + kwan.major + " " + kwan.sex);
        System.out.println("2." + make.name + " " + make.major + " " + make.sex);
        System.out.println("3." + waii.name + " " + waii.major + " " + waii.sex);
        System.out.println("4." + noonnin.name + " " + noonnin.major + " " + noonnin.sex);
        System.out.println("5." + cream.name + " " + cream.major + " " + cream.sex);

        Student[] oopStudents = {kwan, make, waii, noonnin, cream};
        System.out.println("1." + oopStudents[0].name);
        System.out.println("2." + oopStudents[1].name);
        System.out.println("3." + oopStudents[2].name);
        System.out.println("4." + oopStudents[3].name);
        System.out.println("5." + oopStudents[4].name);

        Find_sex_Student(oopStudents);
    }

    //to fine sex Student
    private static void Find_sex_Student(Student[] students)
    {
        for (int i = 0; i < students.length; i++)
        {
            if (students[i].sex == "ผู้หญิง")
            {
                System.out.println(i+1 + ". " + students[i].name);
            }
        }
    }
}