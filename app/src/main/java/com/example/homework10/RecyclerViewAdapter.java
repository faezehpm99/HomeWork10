package com.example.homework10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>  {
    Context mContext;
    List<task>mTasks;

    public RecyclerViewAdapter(Context context, List<task> tasks) {
        mContext = context;
        mTasks = tasks;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        MyViewHolder viewHolder=new MyViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mEditText.setText(mTasks.get(position).getTextName());
        holder.mTextView.setText(mTasks.get(position).getTextDate());

    }

    @Override
    public int getItemCount() {
      return  mTasks.size();
    }

    public  static  class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextView;
        private EditText mEditText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mEditText=itemView.findViewById(R.id.editTextRecyclerView);
            mTextView=itemView.findViewById(R.id.textViewRecyclerView);
        }
    }


}
