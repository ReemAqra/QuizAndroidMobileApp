package com.example.timestableapp.module;

import java.util.ArrayList;

public class QuizDa {

    private ArrayList<Quiz> quiz;

    public QuizDa(){
        quiz = new ArrayList<Quiz>();
        quiz.add(new Quiz("أي أجزاء النبات يحدث فيه معظم عملية البناء الضوئي ؟","الأوراق"));
        quiz.add(new Quiz("إلى أي مجموعة ينتمي حيوان الاخطبوط ؟","الرخويات"));
        quiz.add(new Quiz("أي ممالك المخلوقات الحية لا تحتوي مخلوقاتها على نواة ؟" ,"البكتيريا"));
        quiz.add(new Quiz("أي النباتات التالية يُعد نباتاً لا بذرياً ؟","الحزازيات"));
        quiz.add(new Quiz("أي الكائنات التالية ينتمي لمجموعة اللاسعات ؟","فنديل البحر"));
        quiz.add(new Quiz("أي من العوامل التالية يُعد عاملاً حيوياً ؟" ,"حيوان الجمل"));
        quiz.add(new Quiz("أي المصطلحات التالية يُمثل جميع أفراد النوع الواحد التي تعيش في النظام البيئي ؟" ,"الجماعة الحيوية"));
        quiz.add(new Quiz("أي ممايلي يُعد من المنتجات ؟" ,"الطحالب الخضراء"));
        quiz.add(new Quiz("تُحافظ بعض الحيوانات على بقائها خلال الشتاء البارد عن طريق :","البيات الشتوي"));
        quiz.add(new Quiz("أي مما يلي يُعد من الفلزات ؟" ,"الحديد"));

    }

    public static String choices[][]={
            {"الجدور","الأوراق","الساق","الثمار"},
            {"المفصليات","الرخويات","اللاسعات","الاسفنجيات"},
            {"الطلائعيات","البكتيريا","الفطريات","الحيوانات"},
            {"التفاح","الحزازيات","العنب","الطماطم"},
            {"فنديل البحر","نجم البحر","الحلزون","الضفدع"},
            {"الهواء","ضوء الشمس","حيوان الجمل","التربة"},
            {"النظام البيئي","المجتمع الحيوي","الجماعة الحيوية","الموطن"},
            {"الانسان","الفطريات","الحيوانات","الطحالب الخضراء"},
            {"البيات الشتوي","الاحتفاظ بالماء","تغيير الجلد","نزع الفراء"},
            {"الأكسجين","البلاستيك","الفحم(الكربون)","الحديد"},

    };


    public Quiz getA(int Question){
        String ANSWER = null;

//        for (Quiz a:quiz){
//            if (a.getQuestion().equals(Question)){
//                ANSWER =a.getAnswer();
//            }
//        }
        return quiz.get(Question);
    }
    public Quiz getQ(int current){

        return quiz.get(current);
    }
}