package factoryMethod;

public class CourseFactoryJava implements CourseFactoryI{
    public CourseI create() {
        return new CourseJava();
    }
}
