package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment1 extends Fragment {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private Button button1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment1,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView1=getActivity().findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Fragment1",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getActivity(), detail_1.class);
                startActivity(i);
            }
        });
        textView2=getActivity().findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Fragment1",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getActivity(), detail_2.class);
                startActivity(i);
            }
        });
        textView3=getActivity().findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Fragment1",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getActivity(), video.class);
                startActivity(i);
            }
        });
        button1=getActivity().findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getActivity(),"Fragment1",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getActivity(), start_image.class);
                startActivity(i);
            }
        });


    }
}
