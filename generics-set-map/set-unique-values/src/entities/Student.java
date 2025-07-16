package entities;

import java.util.Objects;

public class Student {
    public Integer code;

    public Student(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(code, student.code);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }
}
