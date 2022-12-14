package com.tomster.design.pattern.build;

import java.util.List;

/**
 * @author meihewang
 * @date 2022/12/14  20:35
 */
public class ClassInfo {

    private String className;

    private List<Student> students;

    private List<Teacher> teachers;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public static Builder newBuilder() {
        return new ClassInfo.Builder();
    }

    public static class Builder {

        private String className;

        private List<Student> students;

        private List<Teacher> teachers;

        public Builder setClassName(String className) {
            this.className = className;
            return this;
        }

        public Builder setStudents(List<Student> students) {
            this.students = students;
            return this;
        }

        public Builder setTeachers(List<Teacher> teachers) {
            this.teachers = teachers;
            return this;
        }

        public ClassInfo build() {
            ClassInfo classInfo = new ClassInfo();
            classInfo.setClassName(className);
            classInfo.setStudents(students);
            classInfo.setTeachers(teachers);
            return classInfo;
        }
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "className='" + className + '\'' +
                ", students=" + students +
                ", teachers=" + teachers +
                '}';
    }

}
