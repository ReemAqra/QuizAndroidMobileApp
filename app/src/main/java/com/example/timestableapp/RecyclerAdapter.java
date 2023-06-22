package com.example.timestableapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] Quastion;
    private String[] Answer;

    public RecyclerAdapter(String[] quastion, String[] answer) {
        this.Quastion=quastion;
        this.Answer=answer;
    }


    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.quastion,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView textView_Q = (TextView)cardView.findViewById(R.id.textView_Q);
        TextView textView_A = (TextView)cardView.findViewById(R.id.textView_A);
        textView_Q.setText(Quastion[position]);
        textView_A.setText(Answer[position]);

    }


    @Override
    public int getItemCount() {
        return Quastion.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}
