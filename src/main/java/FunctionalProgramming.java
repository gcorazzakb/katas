import java.util.function.Function;

public class FunctionalProgramming {
    public static Function<Student, Boolean> f = student -> (student.getFullName().equals("John Smith") &&
            student.studentNumber.equals("js123"));//Make me a function; remember to set the types!
}