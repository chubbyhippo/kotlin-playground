package com.example;

import com.example.classes.Course;
import com.example.classes.CourseCategory;
import com.example.classes.CourseUtils;

public class InvokeKotlinFromJava {
    public static void main(String[] args) {
        var course = new Course(
                1,
                "Webflux Course",
                "Hippo",
                CourseCategory.DEVELOPMENT
        );
        System.out.println("course : " + course);

        CourseUtils.print();
        Course.Companion.printInCompanion("test");
        Course.printInCompanion("ha ha ha");
    }
}
