package simpleFactory;

public class Client {
    public static void main(String[] args) {
        CourseI course1 = new CourseFactory().create("simpleFactory.CourseJava");
        course1.doSomething();
        CourseI courseI2 = new CourseFactory().create(CoursePython.class);
        courseI2.doSomething();
    }
}
