package University;

public class Teacher extends Person {
    private AcademicDegree academicDegree;
    private String speciality;

    public Teacher(String name, String faculty, Sex sex, AcademicDegree academicDegree, String speciality) {
        super(name, faculty, sex);
        setAcademicDegree(academicDegree);
        setSpeciality(speciality);
    }


    public void setAcademicDegree(AcademicDegree academicDegree) {
        this.academicDegree = academicDegree;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void print() {
          if (this.getSex().equals(Sex.MALE)) {
            System.out.println("This is " + getName() + ". He " + "teaches at " + getFaculty());
            System.out.println("He has " + getAcademicDegree() + " degree in " + getSpeciality());
          }
          else {
            System.out.println("This is " + getName() + ". She " + "teaches at " + getFaculty());
            System.out.println("She has " + getAcademicDegree()+" degree in " + getSpeciality());
          }
    }

}
