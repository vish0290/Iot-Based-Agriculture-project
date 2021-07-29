package com.frostveins.farm_tech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class data_ext extends AppCompatActivity {
    TextView a,b,c,d,e,f,g,h;
    WebView web;
    ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_ext);
        a=(TextView)findViewById(R.id.name);
        Intent intent=getIntent();
        String name= intent.getStringExtra("name");
        a.setText(name);
        b=(TextView)findViewById(R.id.s_name);
        Intent intent1=getIntent();
        String s_name= intent.getStringExtra("s_name");
        b.setText(s_name);
        c=(TextView)findViewById(R.id.soil);
        Intent intent2=getIntent();
        String soil=intent.getStringExtra("soil");
        c.setText(soil);
        d=(TextView)findViewById(R.id.temperature);
        Intent intent3=getIntent();
        String temp=intent.getStringExtra("temp");
        d.setText(temp);
        e=(TextView)findViewById(R.id.flower);
        Intent intent4=getIntent();
        String flower=intent.getStringExtra("flower");
        e.setText(flower);
        f=(TextView)findViewById(R.id.pollination);
        Intent intent5=getIntent();
        String pollination=intent.getStringExtra("pollination");
        f.setText(pollination);
        g=(TextView)findViewById(R.id.agent);
        Intent intent6=getIntent();
        String agent=intent.getStringExtra("agent");
        g.setText(agent);
        h=(TextView)findViewById(R.id.time);
        Intent intent7=getIntent();
        String time=intent.getStringExtra("time");
        h.setText(time);
        //image=(ImageView)findViewById(R.id.image);
        Intent intent8=getIntent();
       /* Bundle extras =getIntent().getExtras();
        byte[] byteArray=extras.getByteArray("pictures");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray,0,byteArray.length);
        ImageView image = (ImageView)findViewById(R.id.image);
        image.setImageBitmap(bmp);
        */
       web=(WebView)findViewById(R.id.web);
       String link=intent.getStringExtra("link");
       web.loadUrl(link);

    }

    public void back3(View view)
    {
        startActivity(new Intent(data_ext.this,test.class));
    }
}
