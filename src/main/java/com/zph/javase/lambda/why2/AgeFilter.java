package com.zph.javase.lambda.why2;


import com.zph.javase.lambda.why.Student;


public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge()>14;
    }
}
