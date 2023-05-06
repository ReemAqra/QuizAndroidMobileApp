package com.example.timestableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.timestableapp.module.QuizDa;

import com.example.timestableapp.module.Quiz;

import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView   totalQuestiontextView,Grade, CurrentTextView;
    private TextView   QuestiontextView;
    private Button      AnsA,AnsB,AnsC,AnsD,SubmitBtn,RetakeBtn;

    private LinearLayout back;
    private LinearLayout Linear;
    private ImageView imageView;


    int FinalAnswer = 0;
    int Totol=  QuizDa.choices.length;
    int Current =0;
    String Selected_Answer="";

    QuizDa quizDa=new QuizDa();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQuestiontextView=findViewById(R.id.textView4);
        QuestiontextView=findViewById(R.id.quastion);
        AnsA=findViewById(R.id.Answer_A);
        AnsB=findViewById(R.id.Answer_B);
        AnsC=findViewById(R.id.Answer_C);
        AnsD=findViewById(R.id.Answer_D);
        SubmitBtn=findViewById(R.id.btn);
        imageView=findViewById(R.id.imageView);
        Grade=findViewById(R.id.Grade);
        RetakeBtn=findViewById(R.id.RetakeBtn);
        CurrentTextView=findViewById(R.id.CurrentTextView);


        back=findViewById(R.id.bac);
        Linear=findViewById(R.id.Linear);


        AnsA.setOnClickListener(this);
        AnsB.setOnClickListener(this);
        AnsC.setOnClickListener(this);
        AnsD.setOnClickListener(this);
        SubmitBtn.setOnClickListener(this);

        totalQuestiontextView.setText("اهلا وسهلا بك في اختبار معلومات لصف الثالث الاساسي"+"\n"+"\n" +"عدد الاسئله : " +Totol);
        CurrentTextView.setText("السؤال #"+ Current);
        LoadQuestion();
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {

        AnsA.setBackgroundColor(R.color.bd);
        AnsB.setBackgroundColor(R.color.bd);
        AnsC.setBackgroundColor(R.color.bd);
        AnsD.setBackgroundColor(R.color.bd);
        Button clickButton =(Button) view;
        if (clickButton.getId()==R.id.btn){
            Quiz A =(quizDa.getA(Current));
            if (Selected_Answer.equals(A.getAnswer().toString())){
                FinalAnswer++;
                Toast toast =Toast.makeText(MainActivity.this, "Correct",Toast.LENGTH_SHORT);
                toast.show();
            }else {
                Selected_Answer = clickButton.getText().toString();
                Toast toast =Toast.makeText(MainActivity.this, "wrong",Toast.LENGTH_SHORT);
                toast.show();
            }
            try {
                TimeUnit.SECONDS.sleep(0);
                Current++;
                CurrentTextView.setText("Question #"+ Current);

                LoadQuestion();
//                back.setBackgroundColor(Color.MAGENTA);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else
        {
                Selected_Answer = clickButton.getText().toString();
                clickButton.setBackgroundColor(Color.GRAY);
        }

    }

    void LoadQuestion(){
        if(Current == Totol){
            finishQuiz();
            return;
        }
        Quiz Q =(quizDa.getQ(Current));

        QuestiontextView.setText(Q.getQuestion().toString());
        AnsA.setText(QuizDa.choices[Current][0]);
        AnsB.setText(QuizDa.choices[Current][1]);
        AnsC.setText(QuizDa.choices[Current][2]);
        AnsD.setText(QuizDa.choices[Current][3]);

    }
    void finishQuiz(){
        int FinalGrade =0;
        Linear.setVisibility(View.GONE);
        QuestiontextView.setVisibility(View.GONE);
        totalQuestiontextView.setVisibility(View.GONE);
        CurrentTextView.setVisibility(View.GONE);
        back.setBackgroundColor(Color.WHITE);
        Grade.setVisibility(View.VISIBLE);
        RetakeBtn.setVisibility(View.VISIBLE);
        if(FinalAnswer > 5){
            FinalGrade = FinalAnswer*10;
            Grade.setText("Gongraulation"+"\n"+ FinalGrade +"%");
            CurrentTextView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.img_3);

        }else {
            FinalGrade = FinalAnswer*10;
            imageView.setVisibility(View.VISIBLE);
            CurrentTextView.setVisibility(View.VISIBLE);
            imageView.setImageResource(R.drawable.img_2);
            Grade.setText("opss!!"+"\n"+ FinalGrade +"%");

        }

        RetakeBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Current =0;
                FinalAnswer =0;
                Linear.setVisibility(View.VISIBLE);
                QuestiontextView.setVisibility(View.VISIBLE);
                totalQuestiontextView.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.GONE);
                back.setBackgroundColor(R.color.reem);
                Grade.setVisibility(View.GONE);
                RetakeBtn.setVisibility(View.GONE);
                LoadQuestion();


            }
        });

    }
}