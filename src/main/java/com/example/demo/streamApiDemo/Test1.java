package com.example.demo.streamApiDemo;

import com.example.demo.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author yxc
 * @Date 2021/4/24 23:12
 */
public class Test1 {
    public static void main(String[] args) {
//        List<Student> list2 = Arrays.asList(
//                new Student("九天","男",5000,18,"天秤座"),
//                new Student("十夜","男",4000,16,"双鱼座"),
//                new Student("十一郎","男",3000,24,"水瓶座")
//        );
//
//        list2.stream().filter((e) -> e.getStar().equals("天秤座"))
//                .forEach(System.out::println);
//
//
//        List<String> list = new ArrayList<>();
//        Stream<String> stream = list.stream(); //获取一个顺序流
//        Stream<String> parallelStream = list.parallelStream(); //获取一个并行流
//        System.out.println(stream + ","  + parallelStream);
//
//        Pattern pattern = Pattern.compile(",");
//        Stream<String> stringStream = pattern.splitAsStream("a,b,c,d");
//        stringStream.forEach(System.out::println);


 /*       List<String> list = Arrays.asList("a,b,c", "1,2,3");
        //将每个元素转成一个新的且不带逗号的元素
        Stream<String> s1 = list.stream().map(s -> s.replaceAll(",", ""));
        s1.forEach(System.out::println); // abc  123
        Stream<String> s3 = list.stream().flatMap(s -> {
            //将每个元素转换成一个stream
            String[] split = s.split(",");
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        });
        s3.forEach(System.out::println); // a b c 1 2 3
        list.stream().flatMap(s -> {
            //将每个元素转换成一个stream
            String[] split = s.split(",");
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        });*/


/*        List<String> list = Arrays.asList("aa", "ff", "dd");
//String 类自身已实现Compareable接口
        list.stream().sorted().forEach(System.out::println);// aa dd ff

        Student s1 = new Student("aa", 10);
        Student s2 = new Student("bb", 20);
        Student s3 = new Student("aa", 30);
        Student s4 = new Student("dd", 40);
        List<Student> studentList = Arrays.asList(s1, s2, s3, s4);

      //自定义排序：先按姓名升序，姓名相同则按年龄升序
        studentList.stream().sorted(
                (o1, o2) -> {
                    if (o1.getName().equals(o2.getName())) {
                        return o1.getAge() - o2.getAge();
                    } else {
                        return o1.getName().compareTo(o2.getName());
                    }
                }
        ).forEach(System.out::println);*/

        Student s1 = new Student("aa", 10);
        Student s2 = new Student("bb", 20);
        List<Student> studentList = Arrays.asList(s1, s2);

        studentList.stream()
                .peek(o -> o.setAge(100))
                .forEach(System.out::println);














    }






}
