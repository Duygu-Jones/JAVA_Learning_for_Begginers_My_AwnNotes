package p26_Lambda.Lessons_Lambda;

public class Course {
     /*
    Icinde
    1) private variablelar
    2) parametreli ve parametresiz constructorlar
    3) getterlar
    4) setterlar
    5) toString() methodu barindiran classlara POJO class denir
    POJO==>Plain Old Java Object
     */



//variable-degisken-field olustur
    private String season;
    private String courseName;
    private int avarageScore;
    private int numberOfStudent;

//parametreli const


    public Course(String season, String courseName, int avarageScore, int numberOfStudent) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudent = numberOfStudent;
    }

    //Parametresiz const

    public Course() {
    }


//Getter=Setterlar ====> java beans de denir

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }


//toString


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
}//
