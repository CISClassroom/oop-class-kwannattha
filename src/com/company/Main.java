package com.company;

public class Main {

    public static void main(String[] args) {
	    //create Student object
        Student mark = new Student();
        Student tontan = new Student();
        Student dream = new Student();

        //input data to Object
        mark.name = "X Mark";
        mark.id = "001";
        mark.major = "CIS";
        tontan.name = "Ton Tan";
        tontan.id = "002";
        tontan.major = "CIS";
        dream.name = "Dream all night";
        dream.id = "003";
        dream.major = "CS";

        //get data from Object
        System.out.println("1. " + mark.name + " " + mark.major);
        System.out.println("2. " + tontan.name + " " + tontan.major);
        System.out.println("3. " + dream.name + " " + dream.major);

        //add student to array
        //array index              0      1       2
        Student[] oopStudents = {mark, tontan, dream};

        System.out.println("1. " + oopStudents[0].name);
        System.out.println("2. " + oopStudents[1].name);
        System.out.println("3. " + oopStudents[2].name);

        Fine_CIS_Student(oopStudents);
    }
    //To fine CIS Student
    public static void Fine_CIS_Student(Student[] students){
        //loop all student
        for(int i = 0; i < students.length; i++){
            //check student.major is "CIS"
            if (students[i].major == "CIS"){
                System.out.println(i+1 + ". " + students[i].name);
            }
        }
    }
}
