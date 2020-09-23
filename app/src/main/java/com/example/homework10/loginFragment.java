package com.example.homework10;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link loginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class loginFragment extends Fragment {
    private EditText mEditTextUserName;
    private EditText mEditTextPassword;
    private Button mButtonLogin;
    private Button mButtonRegister;



    public loginFragment() {
        // Required empty public constructor
    }

    public static loginFragment newInstance() {
        loginFragment fragment = new loginFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_login, container, false);
        find(view);
       mButtonLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getContext(), viewPagerActivity.class);
               startActivity(intent);
           }
       });
        return view;
    }

    private void find(View view) {
        mEditTextUserName=view.findViewById(R.id.usernameTxt);
        mEditTextPassword=view.findViewById(R.id.passwordTxt);
        mButtonLogin=view.findViewById(R.id.buttonLogin);
        mButtonRegister=view.findViewById(R.id.buttonRegister);
    }
}