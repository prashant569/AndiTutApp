package com.example.shukla.tutapp3;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Tab extends AppCompatActivity {
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        tabLayout=(TabLayout)findViewById(R.id.tab) ;
        TabLayout.Tab firsttab=tabLayout.newTab();
        firsttab.setText("concept");
        tabLayout.addTab(firsttab);

        TabLayout.Tab secondtab=tabLayout.newTab();
        secondtab.setText("xml code");
        tabLayout.addTab(secondtab);

        TabLayout.Tab thirdtab=tabLayout.newTab();
        thirdtab.setText("java code");
        tabLayout.addTab(thirdtab);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment=null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new Fraga();
                        break;
                    case 1:
                        fragment = new Fragb();
                        break;
                    case 2:
                        fragment = new Fragc();
                        break;
                }
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction ft =fm.beginTransaction();
                ft.replace(R.id.frame,fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();


            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //  String data = item.getTitle().toString();
        if (item.getItemId()==R.id.i1)
        {
            Toast.makeText(this, "home was clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.i2)
        {
            Toast.makeText(this, "rate clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.i3)
        {
            Toast.makeText(this, "contact us clicked", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
    }

