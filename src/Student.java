public class Student {
    String fio;
    int age;
    String group;

    public Student(String fio, int age, String group) {
        this.fio = fio;
        this.age = age;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}
