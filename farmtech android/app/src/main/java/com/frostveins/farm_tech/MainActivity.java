package com.frostveins.farm_tech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mNavDrawer;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer);

        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mNavDrawer= findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.navigation_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,mNavDrawer,toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );

        mNavDrawer.addDrawerListener(toggle);

        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);



    }
    @Override
    public void onBackPressed(){
        if (mNavDrawer.isDrawerOpen(GravityCompat.START)){
            mNavDrawer.closeDrawer(GravityCompat.START);
        }else {

            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){

        switch (menuItem.getItemId()){
            case R.id.about:
                startActivity(new Intent(MainActivity.this,about.class));
                break;
            case R.id.crop:
                startActivity(new Intent(MainActivity.this,test.class));
                break;

            case R.id.soil:
                startActivity( new Intent(MainActivity.this,moisture.class));
                break;

            case R.id.temp:
                startActivity( new Intent(MainActivity.this,temp.class));
                break;

            case R.id.air:
                startActivity(new Intent(MainActivity.this,air.class));
                break;

            case R.id.light:
                startActivity( new Intent(MainActivity.this,light.class));
                break;
        }


        return true;
    }
    public void moisture(View view)
    {
        reff= FirebaseDatabase.getInstance().getReference().child("arduino");
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String  val=snapshot.child("moisture").getValue().toString();
                Intent intent=new Intent(getApplicationContext(),moisture.class);
                intent.putExtra("value",val);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        startActivity( new Intent(MainActivity.this,moisture.class));
    }
    public void temp(View view)
    {
        startActivity( new Intent(MainActivity.this,temp.class));
    }
    public void air(View view)
    {
        startActivity(new Intent(MainActivity.this,air.class));
    }
    public void light(View view)
    {
        startActivity( new Intent(MainActivity.this,light.class));
    }
    public void crop(View view)
    {
        startActivity(new Intent(MainActivity.this,test.class));
    }
}
