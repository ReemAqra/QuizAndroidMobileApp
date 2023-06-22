package com.example.timestableapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.timestableapp.module.Quiz;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView recycler =(RecyclerView) findViewById(R.id.recycler_view);
        Button RetakeBtn_A =findViewById(R.id.RetakeBtn_A);

        String[] Quastion = new String[Quiz.Quiz_1.length];
        String[] Answer  = new String[Quiz.Quiz_1.length];

        for(int i = 0; i<Quastion.length;i++){
            Quastion[i] = Quiz.Quiz_1[i].getQuestion();
            Answer[i] = Quiz.Quiz_1[i].getAnswer();
        }

        recycler.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(Quastion, Answer);
        recycler.setAdapter(adapter);

        RetakeBtn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}