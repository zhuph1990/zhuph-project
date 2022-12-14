package com.zph.javase.lambda.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class LambdaTest {
    public static void main(String[] args) throws Exception {

        // -------------------------------------------------
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("running1 .....");
            }
        };
        runnable.run();

        Runnable runnable2 = () -> {
            System.out.println("running2....");
        };
        runnable2.run();

        Runnable runnable3 = () -> System.out.println("running3....");
        runnable3.run();

        // -------------------------------------------------

        Callable<String> c1 = new Callable() {
            @Override
            public String call() throws Exception {
                return "messi1";
            }
        };
        System.out.println(c1.call());

        Callable<String> c2 = () -> {
            return "messi3";
        };
        System.out.println(c2.call());

        Callable<String> c3 = () -> "messi3";
        System.out.println(c3.call());

        // -------------------------------------------------

        StudentDao sd1 = new StudentDao() {
            @Override
            public void insert(Student student) {
                System.out.println("student1: " + student);
            }
        };

        StudentDao sd2 = (student) -> {
            System.out.println("student2: " + student);
        };

        StudentDao sd3 = (Student student) -> System.out.println("student3: " + student);

        sd1.insert(new Student());
        sd2.insert(new Student());
        sd3.insert(new Student());

        // -------------------------------------------------

        TeacherDao td1 = new TeacherDao() {
            @Override
            public int get(Teacher teacher) {
                return 1;
            }
        };
        TeacherDao td2 = (teacher) -> {
            return 2;
        };
        TeacherDao td3 = (Teacher teacher) -> {
            return 3;
        };
        TeacherDao td4 = (teacher) -> 4;
        TeacherDao td5 = (Teacher teacher) -> 5;

        System.out.println(td1.get(new Teacher()));
        System.out.println(td2.get(new Teacher()));
        System.out.println(td3.get(new Teacher()));
        System.out.println(td4.get(new Teacher()));
        System.out.println(td5.get(new Teacher()));

        // -------------------------------------------------

        /*
         * ???Java???????????????????????????????????????????????????????????????????????????????????????????????????????????????
         *
         * */
        Function<String, Integer> f1 = (str) -> {
            return str.length();
        };
        System.out.println(f1.apply("messi1"));

        Supplier<String> s1 = () -> {
            return "messi2";
        };
        Supplier<String> s2 = () -> "messi3";
        System.out.println(s1.get());
        System.out.println(s2.get());

        Consumer<String> c11 = (str) -> System.out.println(str);
        c11.accept("beijing");

        BiFunction<String, String, Integer> bf = (a, b) -> a.length() + b.length();
        System.out.println(bf.apply("??????", "?????????"));

        // -------------------------------------------------

        Runnable runnable4 = () -> get();
        Runnable runnable5 = () -> exec();
        //   Runnable runnable6 = ()->100; //??????
        //   Runnable runnable7 = ()->"";  //??????
        runnable4.run();

        LamabdInterface li1 = () -> get();
//        LamabdInterface li2 = ()->find();
        LamabdInterface li3 = () -> 100;
//        LamabdInterface li4 = ()->"abc";
        LamabdInterface li5 = () -> true ? 1 : 0;
        System.out.println(li1.get());

        List<String> list = Arrays.asList("a", "b", "c");
//        for (String s : list) {
//            System.out.println(s);
//        }
        list.forEach(System.out::println);
    }

    static int get() {
        return 1;
    }

    static String find() {
        return "find";
    }

    static void exec() {
        find();
    }
}
