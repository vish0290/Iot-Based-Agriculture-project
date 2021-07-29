package com.frostveins.farm_tech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.*;
import java.lang.*;


public class moisture extends AppCompatActivity {
    TextView val,mode;

    ImageButton bt;
    DatabaseReference reff;
    String g;
    int value;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moisture);

        bt= (ImageButton) findViewById(R.id.refresh);
        val=(TextView)findViewById(R.id.val);
        mode=(TextView)findViewById(R.id.mode);
        Intent intent=getIntent();
        String v =intent.getStringExtra("value");
        val.setText(v);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff= FirebaseDatabase.getInstance().getReference().child("arduino").child("moisture");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String get=snapshot.child("val").getValue().toString();
                        val.setText(get);
                        String get2=snapshot.child("mode").getValue().toString();
                        mode.setText(get2);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }

    public void back(View view)
    {
        startActivity( new Intent(moisture.this,MainActivity.class));
    }
}
