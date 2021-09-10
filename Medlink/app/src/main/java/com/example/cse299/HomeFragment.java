package com.example.cse299;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    private Button dhaka;
    private Button ctg;
    private Button khul;
    private Button syl;
    private Button bar;
    private Button raj;
    private Button ran;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View v =inflater.inflate(R.layout.fragment_home,container,false);
        dhaka = (Button) v.findViewById(R.id.button1);
        ctg = (Button) v.findViewById(R.id.button2);
        khul= (Button) v.findViewById(R.id.button3);
        syl = (Button) v.findViewById(R.id.button4);
        bar = (Button) v.findViewById(R.id.button5);
        raj = (Button) v.findViewById(R.id.button6);
        ran = (Button) v.findViewById(R.id.button7);

        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Catagory.class);
                getActivity().startActivity(intent);
            }
        });
        ctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Catagory.class);
                getActivity().startActivity(intent);
            }
        });
        khul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Catagory.class);
                getActivity().startActivity(intent);
            }
        });
        syl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Catagory.class);
                getActivity().startActivity(intent);
            }
        });
        bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Catagory.class);
                getActivity().startActivity(intent);
            }
        });
        raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Catagory.class);
                getActivity().startActivity(intent);
            }
        });
        ran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Catagory.class);
                getActivity().startActivity(intent);
            }
        });



        return v;
    }


}
