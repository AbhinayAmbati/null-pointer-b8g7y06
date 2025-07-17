class Student {
    public int roll;
    public String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    

}

public class ArrayOfObject {

    public static void main(String[] args) {
        Student[] arr;

        arr = new Student[5];

        arr[0] = new Student(1, "Abhi");
        arr[1] = new Student(1, "Abhi");
        arr[2] = new Student(1, "Abhi");
        arr[3] = new Student(1, "Abhi");
        arr[4] = new Student(1, "Abhi");

        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx].roll + " " + arr[idx].name);
        }
    }

}
