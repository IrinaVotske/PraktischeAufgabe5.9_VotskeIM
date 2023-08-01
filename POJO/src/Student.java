import java.util.Objects;
public final class Student {
    private final String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Student) obj;
        return Objects.equals(this.name, that.name) &&
                this.age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name=" + name + ", " +
                "age=" + age + ']';
    }
}
