package com.example.shukla.tutapp3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
   // String sam="hfdgshf";
    TextView tvw;
    private ViewFlipper vfp;
    int[]images={R.drawable.and1,R.drawable.and2,R.drawable.and3,R.drawable.and4,R.drawable.and5,R.drawable.and6,R.drawable.and7,R.drawable.and8};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvw=(TextView) findViewById(R.id.tv);
        vfp=(ViewFlipper)findViewById(R.id.vp1);
        for(int i=0;i<images.length;i++)
        {
            ImageView imageView=new ImageView(MainActivity.this);
            imageView.setImageResource(images[i]);
            vfp.addView(imageView);
        }
        vfp.setFlipInterval(2000);
        vfp.setAutoStart(true);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.his) {
            Intent j=new Intent(MainActivity.this,Tab.class);
            j.putExtra("key",0);
            startActivity(j);

            // Handle the camera action
        } else if (id == R.id.life) {
            Intent i=new Intent(MainActivity.this,Tab.class);
            i.putExtra("key",1);
            startActivity(i);

        } else if (id == R.id.ori) {
            Intent i=new Intent(MainActivity.this,Tab.class);
            i.putExtra("key",2);
            startActivity(i);


        } else if (id == R.id.hand) {
            Intent i=new Intent(MainActivity.this,Tab.class);
            i.putExtra("key",3);
            startActivity(i);


        } else if (id == R.id.tost) {
            Intent i=new Intent(MainActivity.this,Tab.class);
            i.putExtra("key",4);
            startActivity(i);

        } else if (id == R.id.inf) {
            Intent i=new Intent(MainActivity.this,Tab.class);
            i.putExtra("key",5);
            startActivity(i);

        }else if (id == R.id.vw) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",6);
            startActivity(i);

        }
     else if (id == R.id.db) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",7);
            startActivity(i);

        }
        else if (id == R.id.act) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",8);
            startActivity(i);

        }
        else if (id == R.id.tb) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",9);
            startActivity(i);

        }
        else if (id == R.id.rb) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",10);
            startActivity(i);

        }
        else if (id == R.id.cb) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",11);
            startActivity(i);

        }
        else if (id == R.id.spin) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",12);
            startActivity(i);

        }
        else if (id == R.id.aa) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",13);
            startActivity(i);

        }
        else if (id == R.id.intnt) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",14);
            startActivity(i);

        }
        else if (id == R.id.frg) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",15);
            startActivity(i);

        }
        else if (id == R.id.vp) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",16);
            startActivity(i);

        }
        else if (id == R.id.tba) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",17);
            startActivity(i);

        }
        else if (id == R.id.br) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",18);
            startActivity(i);

        }
        else if (id == R.id.mnu) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            i.putExtra("key",19);
            startActivity(i);

        }
        else if (id == R.id.cus) {
            Intent i = new Intent(MainActivity.this, Tab.class);
            startActivity(i);


           // tvw.setText(contact);


        }



            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
