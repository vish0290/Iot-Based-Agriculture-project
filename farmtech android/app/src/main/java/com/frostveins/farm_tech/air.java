package com.frostveins.farm_tech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class air extends AppCompatActivity {
    TextView val,mode;
    ImageButton bt;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air);
        bt=(ImageButton)findViewById(R.id.refresh);
        val=(TextView)findViewById(R.id.val);
        mode=(TextView)findViewById(R.id.mode);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff= FirebaseDatabase.getInstance().getReference().child("arduino");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String get=snapshot.child("air").getValue().toString();
                        val.setText(get);
                        String get2=snapshot.child("green_house").getValue().toString();
                        mode.setText(get2);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }
    public void main2(View view)
    {
        startActivity( new Intent(air.this,MainActivity.class));
    }
}
