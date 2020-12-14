package simpleFactory;

public class CourseFactory {
    public CourseI create(String className) {
        try {
            return (CourseI) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
    public CourseI create(Class<?> clazz){
        try {
            return (CourseI) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
