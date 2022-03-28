public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("НСВ", 30, 1992);
        Person p2 = new Person("ВИЛ", 25, 1997);
        Person p3 = new Person("АСП", 15, 2007);
        Person p4 = new Person("ЛНТ", 42, 1980);
        PersonFilter personFilter = age -> {
            if ((age > 16) && (age < 41)) return true;
            return false;
        };
        PersonConverter personConverter = person -> {
            if (person.yearOfBirth < 1995) return new Student(person.fio, person.age, "УбИН-01-22");
            return new Student(person.fio, person.age, "УбИН-02-22");
        };
        if (personFilter.adultFilter(p1.age)) System.out.println(personConverter.personToStudent(p1));
        if (personFilter.adultFilter(p2.age)) System.out.println(personConverter.personToStudent(p2));
        if (personFilter.adultFilter(p3.age)) System.out.println(personConverter.personToStudent(p3));
        if (personFilter.adultFilter(p4.age)) System.out.println(personConverter.personToStudent(p4));
    }
}
