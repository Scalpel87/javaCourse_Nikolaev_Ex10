public class Person {
    String fio;
    int age;
    int yearOfBirth;

    public Person(String fio, int age, int yearOfBirth) {
        this.fio = fio;
        this.age = age;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
