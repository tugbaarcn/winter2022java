package lambda_functional_programming;

public class Courses {

    //POJO => Plain Old Java Object
    //variables
    //getters and setters
    //constructors
    //toString()

    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;

    //1)Constructor with no parameter
    public Courses() {
    }

    //2)Constructor with parameters
    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }

    //3)getters and setters
    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    //4)toString()


    @Override
    public String toString() {
        return "Courses{" +
                "Season='" + Season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", averageScore=" + averageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
