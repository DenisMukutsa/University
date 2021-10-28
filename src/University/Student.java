package University;

public class Student extends Person {

    private StudyLevel studyLevel;
    private int courseNumber;
    private String subjectOfDissertation;
    private Person[] persons;

    public Student(String name, String faculty, Sex sex, StudyLevel studyLevel, int courseNumber) {
        super(name, faculty, sex);
        setStudyLevel(studyLevel);
        setCourseNumber(courseNumber);
    }

    public Student(String name, String faculty, Sex sex, StudyLevel studyLevel, String subjectOfDissertation) {
        super(name, faculty, sex);
        setStudyLevel(studyLevel);
        setSubjectOfDessertation(subjectOfDissertation);
    }

    public void setStudyLevel(StudyLevel studyLevel) {
        this.studyLevel = studyLevel;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setSubjectOfDessertation (String subjectOfDissertation) {
        this.subjectOfDissertation = subjectOfDissertation;
    }

    public StudyLevel getStudyLevel() {
        return studyLevel;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getSubjectOfDissertation() {
        return subjectOfDissertation;
    }

    public void print() {
        if (this.getSex().equals(Sex.MALE)) {
            System.out.println("This is " + getName() + ". He " + "studies at " + getFaculty());
            if (this.getStudyLevel().equals(StudyLevel.BACHELOR) || this.getStudyLevel().equals(StudyLevel.MASTER)) {
                    System.out.println("He is " + getCourseNumber() + "'th year " + getStudyLevel()+ " student.");
            }
            else
            {
                System.out.println("His thesis title is \"" + getSubjectOfDissertation() + "\"");
            }
        }
        else {
                System.out.println("This is " + getName() + ". She " + "studies at " + getFaculty());
                if (this.getStudyLevel().equals(StudyLevel.BACHELOR) || this.getStudyLevel().equals(StudyLevel.MASTER)) {
                    System.out.println("She is " + getCourseNumber() + "'th year " + getStudyLevel()+ " student.");
                } else {
                    System.out.println("Her thesis title is \"" + getSubjectOfDissertation() + "\"");
                }
            }
        }

}
