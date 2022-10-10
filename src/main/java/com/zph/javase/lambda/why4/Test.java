package com.zph.javase.lambda.why4;



import com.zph.javase.lambda.why.Student;
import com.zph.javase.lambda.why2.StudentFilter;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("zhangsan",14,67));
        list.add(new Student("lisi",13,89));
        list.add(new Student("wangwu",15,97));
        list.add(new Student("maliu",12,63));
        list.add(new Student("zhaoqi",17,75));

        getByFilter(list,(e)->e.getAge()>14 );
        getByFilter(list, (e)->e.getScore()>75);
        System.out.println("-------------------");
        getByFilter(list, (e)->e.getName().length()>5);
    }

    public static void getByFilter(ArrayList<Student> students, StudentFilter filter){
        ArrayList<Student> list = new ArrayList<>();
        for(Student student:students){
            if(filter.compare(student)){
                list.add(student);
            }
        }
        printStudent(list);
    }

    public static void printStudent(ArrayList<Student> students){
        for(Student student:students){
            System.out.println(student);
        }
    }
}
