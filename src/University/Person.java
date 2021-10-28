package University;

enum Sex {MALE, FEMALE}
enum StudyLevel {BACHELOR, MASTER, POSTGRADUATE}
enum AcademicDegree {CANDIDATE, DOCTOR, PhD, MSc}

public abstract class Person {
    private String name;
    private String faculty;
    private Sex sex;

    public Person(String name, String faculty, Sex sex) {
        setName(name);
        setFaculty(faculty);
        setSex(sex);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public Sex getSex() {
        return sex;
    }

    public abstract void print();

    public static void printAll(Person[] persons) {
        for(Person person : persons) {
            person.print();
            System.out.println();
        }
    }
}
