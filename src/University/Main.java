package University;


public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Teacher("Ronald Turner", "Computer science", Sex.MALE, AcademicDegree.PhD, "Programming paradigms"),
                new Teacher("Ruth Hollings", "Jurisprudence", Sex.FEMALE, AcademicDegree.MSc, "Domestic Arbitration"),
                new Student("Leo Wilkinson", "Computer science", Sex.MALE, StudyLevel.BACHELOR, 3),
                new Student("Anna Cunningham", "World economy", Sex.FEMALE, StudyLevel.BACHELOR, 1),
                new Student("Jill Lundqvist", "Jurisprudence", Sex.FEMALE, StudyLevel.MASTER, 1),
                new Student("Ronald Correa", "Computer science", Sex.MALE, StudyLevel.POSTGRADUATE, "Design of a functional programming language."),
        };
        Person.printAll(persons);

    }
}
