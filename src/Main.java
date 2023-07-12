import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher ishita = new Teacher(1, "Ishita", 5000);
        Teacher darshita = new Teacher(2, "Darshita", 9000);
        Teacher yash = new Teacher(3, "Yash", 6000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ishita);
        teacherList.add(darshita);
        teacherList.add(yash);

        Student tanmay = new Student(1, "Tanmay", 40);
        Student ajay = new Student(2, "Ajay", 70);
        Student urva = new Student(3, "Urva", 40);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tanmay);
        studentList.add(ajay);
        studentList.add(urva);

        School abc = new School(teacherList, studentList);
        tanmay.payFees(60000);
        ajay.payFees(50000);
        Teacher meena = new Teacher(6, "Meena", 9000);
        abc.addTeacher(meena);
        System.out.println("School has earned Rs." + abc.getTotalMoneyEarned());

        System.out.println("--------- School's Pay Salary ------");
        ishita.receiveSalary(ishita.getSalary());
        System.out.println("School has spent for salary to " + ishita.getName() + " and now has Rs." + abc.getTotalMoneyEarned());
        darshita.receiveSalary(darshita.getSalary());
        System.out.println("School has spent for salary to " + darshita.getName() + " and now has Rs." + abc.getTotalMoneyEarned());
        meena.receiveSalary(meena.getSalary());
        System.out.println("School has spent for salary to " + meena.getName() + " and now has Rs." + abc.getTotalMoneyEarned());

        System.out.println(tanmay);
        System.out.println(ajay);
        System.out.println(urva);
    }
}

