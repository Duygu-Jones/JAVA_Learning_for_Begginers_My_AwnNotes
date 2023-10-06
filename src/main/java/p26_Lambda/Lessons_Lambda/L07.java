package p26_Lambda.Lessons_Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class L07 {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();

        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.

        String kursName =
                coursesList.                //courseList ele alindi ve String kursname sepetine atandi
                        stream().           //Lamda olarak fonctional yapildi
                        sorted(Comparator.comparing(Course::getAvarageScore).reversed()). //sorted ile k--> buyuge// sonra reversed ile b--> kucuge siraladik AvarageScore gore siralama yapildi
                        findFirst().        //ilk elemani yani en kucugu getir dedik
                        get().getCourseName(); // ve courseName ismini getir

        System.out.println(kursName);



        //2) Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde console'a yazdiriniz.
        List <Course> myList =
                coursesList.
                        stream().
                        sorted(Comparator.comparing(Course::getAvarageScore)).
                        skip(2).                       //ilk ikisi haric, length sayisi girilir;2
                        collect(Collectors.toList());     //liste halinde console'a yazdiriniz.  ==> toList seklinde collect et dedik
        System.out.println(myList);


        //3)Tum course object'lerini average score'a gore kucukten buyuge diziniz ve ilk ucunu liste halinde console'a yazdiriniz.
       List<Course> myList2 =
               coursesList.
                       stream().
                       sorted(Comparator.comparing(Course::getAvarageScore)).
                       limit(3).        // ilk 3 elemani girdik; ilk 3 unu yazdirir
                       collect(Collectors.toList());
        System.out.println(myList2);


        // 4) Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde listin icinde  veren  kodu yaziniz.

        List<Course> numOfStdSorted =
                coursesList.
                        stream().
                        sorted(Comparator.comparing(Course::getNumberOfStudent).reversed()). //buyukten kucuge sirali
                        collect(Collectors.toList());  //listin icinde  veren  kodu yaziniz.
        System.out.println(numOfStdSorted);


        //5)
        long EngCourseNum = coursesList.stream().filter(t->t.getCourseName().contains("English")).count();
        System.out.println(EngCourseNum);



        //6)Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz
        List<Course> courseList2= coursesList.stream().filter(t-> t.getNumberOfStudent()<140).collect(Collectors.toList());
        System.out.println(courseList2);






    }






}
