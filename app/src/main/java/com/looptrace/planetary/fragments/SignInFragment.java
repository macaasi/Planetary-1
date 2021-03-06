package com.looptrace.planetary.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.looptrace.planetary.R;
import com.looptrace.planetary.activities.MainActivity;

public class SignInFragment extends Fragment {

    private Button mBtnSignIn;
    private TextView mBtnCreateAcct;
    public SignInFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_in, container, false);

        mBtnSignIn = view.findViewById(R.id.sign_in_btn);
        mBtnSignIn.setOnClickListener(v -> {
            startActivity(new Intent(requireActivity(), MainActivity.class));
            requireActivity().finish();
        });

        mBtnCreateAcct = view.findViewById(R.id.create_acct);
        mBtnCreateAcct.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_signInFragment_to_signUpFragment);
            mBtnSignIn.setVisibility(View.INVISIBLE);
        });

        return view;
    }
}