# รายงานผลการทดลอง

<นางสาวณัฏฐา ซ็อนศรี> <623410032-1>

## Student Class

สร้างคลาสสำหรับนักศึกษาประกอบไปด้วยข้อมูล

- ชื่อ-นามสกุล
- รหัสนักศึกษา
- สาขา

```java
public class Student {
    // ประกาศตัวแปรของ class
    public String name;
    public String id;
    public String major;
}
```

## Student Object

สร้างวัตถุจากคลาสนักศึกษา และใส่ข้อมูลขอตนเองลงไป

```java
Student kwan = new Student();
kwan.name = "นางสาวณัฏฐา ซ้อนศรี";
kwan.id = "623410032-1";
kwan.major = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ";
```

แสดงข้อมูลวัตถุนักศึกษา ออกทาง console

```java
System.out.println("1." + kwan.name + " " + kwan.major);
Student[] oopStudents = {kwan};
System.out.println("1." +oopStudents[0].name);
```

## Data collection

สร้าง Data collection สำหรับเก็บข้อมูลนักศึกษา และแสดงการเก็บข้อมูล

```java
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
```

## Student Selection

ให้สร้างเมธอทสำหรับแสดงข้อมูลเฉพาะนักศึกษาชาย หรือหญิง จากข้อมูลนักศึกษาที่ได้สร้างขึ้น

```java
//to fine sex Student
    private static void Find_sex_Student(Student[] students)
    {
        for (int i = 0; i < students.length; i++)
        {
            if (students[i].sex == "ผู็หญิง")
            {
                System.out.println(i+1 + ". " + students[i].name);
            }
        }
    }
```
