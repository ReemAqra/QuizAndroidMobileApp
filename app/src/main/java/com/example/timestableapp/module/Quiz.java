package com.example.timestableapp.module;

import java.util.ArrayList;

public class Quiz {

    private String Question;
    private String Answer;

    public static final Quiz[] Quiz_1 ={
        new Quiz("أي أجزاء النبات يحدث فيه معظم عملية البناء الضوئي ؟","الأوراق"),
        new Quiz("إلى أي مجموعة ينتمي حيوان الاخطبوط ؟","الرخويات"),
        new Quiz("أي ممالك المخلوقات الحية لا تحتوي مخلوقاتها على نواة ؟" ,"البكتيريا"),
        new Quiz("أي النباتات التالية يُعد نباتاً لا بذرياً ؟","الحزازيات"),
        new Quiz("أي الكائنات التالية ينتمي لمجموعة اللاسعات ؟","قنديل البحر"),
        new Quiz("أي من العوامل التالية يُعد عاملاً حيوياً ؟" ,"حيوان الجمل"),
        new Quiz("أي المصطلحات التالية يُمثل جميع أفراد النوع الواحد التي تعيش في النظام البيئي ؟" ,"الجماعة الحيوية"),
        new Quiz("أي ممايلي يُعد من المنتجات ؟" ,"الطحالب الخضراء"),
        new Quiz("تُحافظ بعض الحيوانات على بقائها خلال الشتاء البارد عن طريق :","البيات الشتوي"),
        new Quiz("أي مما يلي يُعد من الفلزات ؟" ,"الحديد"),
    };
    public Quiz(String question ,String Answer) {
        this.Question = question;
        this.Answer=Answer;
    }

    public String getQuestion() {
        return Question;
    }
    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "Question='" + Question + '\'' +
                ", Answer='" + Answer + '\'' +
                '}';
    }
}
