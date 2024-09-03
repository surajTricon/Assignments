public class Student {
    String name;
    int id;
    int age;
    char grade;

    public Student(String name, int id, char grade, int age) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public char getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }
}


