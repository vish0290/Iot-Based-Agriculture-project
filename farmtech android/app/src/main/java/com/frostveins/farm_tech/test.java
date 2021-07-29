package com.frostveins.farm_tech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.ByteArrayOutputStream;

public class test extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18;
    DatabaseReference reff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        bt1=(Button)findViewById(R.id.apple);
        bt2=(Button)findViewById(R.id.beans);
        bt3=(Button)findViewById(R.id.brinjal);
        bt4=(Button)findViewById(R.id.capsicum);
        bt5=(Button)findViewById(R.id.chili);
        bt6=(Button)findViewById(R.id.cotton);
        bt7=(Button)findViewById(R.id.cucumber);
        bt8=(Button)findViewById(R.id.maize);
        bt9=(Button)findViewById(R.id.okra);
        bt10=(Button)findViewById(R.id.olive);
        bt11=(Button)findViewById(R.id.onion);
        bt12=(Button)findViewById(R.id.papaya);
        bt13=(Button)findViewById(R.id.peanut);
        bt14=(Button)findViewById(R.id.peas);
        bt15=(Button)findViewById(R.id.potato);
        bt16=(Button)findViewById(R.id.rice);
        bt17=(Button)findViewById(R.id.strawberry);
        bt18=(Button)findViewById(R.id.sugar_cane);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff= FirebaseDatabase.getInstance().getReference().child("crops").child("apple");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
                    /*    Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.apple);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();

                     */

                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
                        //intent.putExtra("picture",byteArray);
                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("beans");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
                        /*Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.beans);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();

                         */

                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
                        //intent.putExtra("picture",byteArray);
                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("brinjal");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
                       /* Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.brinjal);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();

                        */

                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
                        //intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("capsicum");
                reff.addValueEventListener((new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
/*
                        Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.capsicum);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


 */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                }));
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("chili");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.chili);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("cotton");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.cotton);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();
   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
                        //intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("cucumber");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);

                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("link",link);
                        intent.putExtra("time",time);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("maize");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
    /*                    Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.maize);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


     */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("okra");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.okra);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();
   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });


        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff= FirebaseDatabase.getInstance().getReference().child("crops").child("olive");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.olive);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("onion");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.onion);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        bt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("papaya");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.papaya);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);
                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        bt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("peanut");
                reff.addValueEventListener((new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.peanut);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);

                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                }));
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("peas");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.peas);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);
                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("potato");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.potato);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);
                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("rice");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);

  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.rice);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);
                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("strawberry");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
/*
                        Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.strawberry);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


 */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);
                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
        bt18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff=FirebaseDatabase.getInstance().getReference().child("crops").child("sugar_cane");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("a_name").getValue().toString();
                        String s_name=dataSnapshot.child("b_s_name").getValue().toString();
                        String soil=dataSnapshot.child("c_soil").getValue().toString();
                        String temp=dataSnapshot.child("d_temp").getValue().toString();
                        String flower=dataSnapshot.child("e_flower").getValue().toString();
                        String pollination=dataSnapshot.child("f_pollination").getValue().toString();
                        String agent=dataSnapshot.child("g_agent").getValue().toString();
                        String time=dataSnapshot.child("time").getValue().toString();
                        String link=dataSnapshot.child("p_pic").getValue().toString();
                        Uri url = Uri.parse(link);
  /*                      Bitmap bmp= BitmapFactory.decodeResource(getResources(),R.drawable.sugar_cane);
                        ByteArrayOutputStream stream = new ByteArrayOutputStream();
                        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
                        byte[] byteArray=stream.toByteArray();


   */
                        Intent intent= new Intent(getApplicationContext(),data_ext.class);
//                        intent.putExtra("picture",byteArray);

                        intent.putExtra("name",name);
                        intent.putExtra("s_name",s_name);
                        intent.putExtra("soil",soil);
                        intent.putExtra("temp",temp);
                        intent.putExtra("flower",flower);
                        intent.putExtra("pollination",pollination);
                        intent.putExtra("agent",agent);
                        intent.putExtra("time",time);
                        intent.putExtra("link",link);
                        startActivity(intent);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
    }
    public void back5(View view){startActivity(new Intent(test.this,MainActivity.class));}
}
