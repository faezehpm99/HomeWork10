package com.example.homework10;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class doingFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private List<task>mTaskList;
    private FloatingActionButton mFbtn;

private Button done;
    public doingFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        Bundle args = new Bundle();

        doingFragment fragment = new doingFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       mTaskList=new ArrayList<>();
       mTaskList.add(new task("hi".toString(), "ytd"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_doing, container, false);
        mRecyclerView=view.findViewById(R.id.recyclerView);
        mFbtn=view.findViewById(R.id.fbtn);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(getContext(),mTaskList);
        mRecyclerView.setAdapter(recyclerViewAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        done=view.findViewById(R.id.btndone);


    }
}