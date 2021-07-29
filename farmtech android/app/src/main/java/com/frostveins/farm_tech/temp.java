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

public class temp extends AppCompatActivity {
    ImageButton bt;
    TextView val1,val2;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        bt=(ImageButton)findViewById(R.id.refresh);
        val1=(TextView)findViewById(R.id.val1);
        val2=(TextView)findViewById(R.id.val2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff= FirebaseDatabase.getInstance().getReference().child("arduino");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String get=snapshot.child("temp").getValue().toString();
                        val1.setText(get);
                        String get2=snapshot.child("hum").getValue().toString();
                        val2.setText(get2);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }
    public void main(View view)
    {
        startActivity(new Intent(temp.this,MainActivity.class));
    }
}
