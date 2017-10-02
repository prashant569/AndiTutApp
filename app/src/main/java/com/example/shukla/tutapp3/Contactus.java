package com.example.shukla.tutapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Contactus extends AppCompatActivity {
    String contact=" \n\n" +
            "Name-     prashant shukla\n"
            +          "Android developer\n"+
            " Gmail id- ps04007@gmail.com\n" +
            "mobile number- +918576946370\n"+
            "follow us on \n" +
            "  twitter- @ps04007\n" +
            "   facebook- ps04007@gmail.com\n" +
            "   linkedin- ps04007\n" +
            "    github-  prashant569\n"
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);
        TextView t=(TextView)findViewById(R.id.tvv);
        t.setText(contact);

    }
}
