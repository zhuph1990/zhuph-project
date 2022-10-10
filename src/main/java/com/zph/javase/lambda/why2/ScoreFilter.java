package com.zph.javase.lambda.why2;


import com.zph.javase.lambda.why.Student;


public class ScoreFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getScore()>75;
    }
}
