package factoryMethod;

public class CourseFactoryPython implements CourseFactoryI{
    @Override
    public CourseI create() {
        return new CoursePython();
    }
}
