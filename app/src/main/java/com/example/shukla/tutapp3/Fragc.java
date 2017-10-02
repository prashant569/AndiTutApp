package com.example.shukla.tutapp3;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragc extends Fragment {
    String event_handling="package com.example.myapplication;\n" +
            "\n" +
            "import android.app.ProgressDialog;\n" +
            "import android.os.Bundle;\n" +
            "import android.support.v7.app.ActionBarActivity;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class MainActivity extends ActionBarActivity {\n" +
            "   private ProgressDialog progress;\n" +
            "   Button b1,b2;\n" +
            "\n" +
            "   @Override\n" +
            "   protected void onCreate(Bundle savedInstanceState) {\n" +
            "      super.onCreate(savedInstanceState);\n" +
            "      setContentView(R.layout.activity_main);\n" +
            "      progress = new ProgressDialog(this);\n" +
            "\n" +
            "      b1=(Button)findViewById(R.id.button);\n" +
            "      b2=(Button)findViewById(R.id.button2);\n" +
            "      b1.setOnClickListener(new View.OnClickListener() {\n" +
            "         \n" +
            "         @Override\n" +
            "         public void onClick(View v) {\n" +
            "            TextView txtView = (TextView) findViewById(R.id.textView);\n" +
            "            txtView.setTextSize(25);\n" +
            "         }\n" +
            "      });\n" +
            "\n" +
            "      b2.setOnClickListener(new View.OnClickListener() {\n" +
            "         \n" +
            "         @Override\n" +
            "         public void onClick(View v) {\n" +
            "            TextView txtView = (TextView) findViewById(R.id.textView);\n" +
            "            txtView.setTextSize(55);\n" +
            "         }\n" +
            "      });\n" +
            "   }\n" +
            "}";
 String history1="it is only thoery part no coding";
   // String history1 ="(1)android is a opensource and linux based opearting system owned by google"+"\n \n"+
         //   "(2)Initially, Andy Rubin founded Android Incorporation in Palo Alto, California, United States in October, 2003."+"\n \n"+ "(3)In 17th August 2005, Google acquired android Incorporation"+"\n \n"+"(4)The code names of android ranges from A to J currently, such as Aestro(1.0), Blender(1.2), Cupcake(1.5), Donut(1.6), Eclair(2.1), Froyo(2.2), Gingerbread(2.3), Honeycomb(3.1-3.3), Ice Cream Sandwitch(4.0), Jelly Bean(4.1-4.3), KitKat(4.4) and Lollipop(5.0),marshmallow(6.0) and now nought(7.0)."+"Android programming is based on Java programming language so if you have basic understanding on Java programming then it will be a fun to learn Android application development."+"\n";
    String lifecycle ="    package com.example.activitylifecycle;  \n" +
           "    import android.os.Bundle;  \n" +
           "    import android.app.Activity;  \n" +
           "    import android.util.Log;  \n" +
           "    import android.view.Menu;  \n" +
           "    public class MainActivity extends Activity {  \n" +
           "        @Override  \n" +
           "        protected void onCreate(Bundle savedInstanceState) {  \n" +
           "            super.onCreate(savedInstanceState);  \n" +
           "            setContentView(R.layout.activity_main);  \n" +
           "            Log.d(\"lifecycle\",\"onCreate invoked\");  \n" +
           "        }  \n" +
           "        @Override  \n" +
           "        protected void onStart() {  \n" +
           "            super.onStart();  \n" +
           "             Log.d(\"lifecycle\",\"onStart invoked\");  \n" +
           "        }  \n" +
           "        @Override  \n" +
           "        protected void onResume() {  \n" +
           "            super.onResume();  \n" +
           "             Log.d(\"lifecycle\",\"onResume invoked\");  \n" +
           "        }  \n" +
           "        @Override  \n" +
           "        protected void onPause() {  \n" +
           "            super.onPause();  \n" +
           "             Log.d(\"lifecycle\",\"onPause invoked\");  \n" +
           "        }  \n" +
           "        @Override  \n" +
           "        protected void onStop() {  \n" +
           "            super.onStop();  \n" +
           "             Log.d(\"lifecycle\",\"onStop invoked\");  \n" +
           "        }  \n" +
           "           @Override  \n" +
           "        protected void onRestart() {  \n" +
           "            super.onRestart();  \n" +
           "             Log.d(\"lifecycle\",\"onRestart invoked\");  \n" +
           "        }     \n" +
           "        @Override  \n" +
           "        protected void onDestroy() {  \n" +
           "            super.onDestroy();  \n" +
           "             Log.d(\"lifecycle\",\"onDestroy invoked\");  \n" +
           "        }  \n" +
           "    }  ";
    String orientation="    package com.example.f;  \n" +
            "      \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.view.Menu;  \n" +
            "    import android.view.View;  \n" +
            "    import android.view.View.OnClickListener;  \n" +
            "    import android.widget.Button;  \n" +
            "    import android.widget.EditText;  \n" +
            "      \n" +
            "    public class MainActivity extends Activity{  \n" +
            "        EditText editText1;  \n" +
            "        Button button1;  \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "              \n" +
            "            editText1=(EditText)findViewById(R.id.editText1);  \n" +
            "            button1=(Button)findViewById(R.id.button1);  \n" +
            "        }  \n" +
            "        public void onClick(View v) {  \n" +
            "            editText1.setText(\"O android\");  \n" +
            "        }  \n" +
            "    }  ";
    String toast_class="    package com.example.toast;  \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.view.Menu;  \n" +
            "    import android.view.View;  \n" +
            "    import android.widget.Toast;  \n" +
            "      \n" +
            "    public class MainActivity extends Activity {  \n" +
            "         @Override  \n" +
            "            public void onCreate(Bundle savedInstanceState) {  \n" +
            "                super.onCreate(savedInstanceState);  \n" +
            "                setContentView(R.layout.activity_main);  \n" +
            "                  \n" +
            "            //Displaying Toast with Hello Javatpoint message  \n" +
            "                Toast.makeText(getApplicationContext(),\"Hello Javatpoint\",Toast.LENGTH_SHORT).show();  \n" +
            "            }  \n" +
            "      \n" +
            "            @Override  \n" +
            "            public boolean onCreateOptionsMenu(Menu menu) {  \n" +
            "                getMenuInflater().inflate(R.menu.activity_main, menu);  \n" +
            "                return true;  \n" +
            "            }  \n" +
            "      \n" +
            "    }  ";
    String layout_inflator="public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {\n" +
            "    LayoutInflater inflater = LayoutInflater.from(getActivity());\n" +
            "    View view = inflater.inflate(android.R.layout.list_item_recyclerView, parent, false);\n" +
            "    return new ViewHolder(view);\n" +
            "}\n";
    String dialog_box="    package com.example.alertdialog;  \n" +
            "      \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.app.AlertDialog;  \n" +
            "    import android.content.DialogInterface;  \n" +
            "    import android.view.Menu;  \n" +
            "      \n" +
            "    public class MainActivity extends Activity {  \n" +
            "      \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "              \n" +
            "            AlertDialog.Builder builder = new AlertDialog.Builder(this);  \n" +
            "            //Uncomment the below code to Set the message and title from the strings.xml file  \n" +
            "            //builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);  \n" +
            "              \n" +
            "            //Setting message manually and performing action on button click  \n" +
            "            builder.setMessage(\"Do you want to close this application ?\")  \n" +
            "                .setCancelable(false)  \n" +
            "                .setPositiveButton(\"Yes\", new DialogInterface.OnClickListener() {  \n" +
            "                    public void onClick(DialogInterface dialog, int id) {  \n" +
            "                    finish();  \n" +
            "                    }  \n" +
            "                })  \n" +
            "                .setNegativeButton(\"No\", new DialogInterface.OnClickListener() {  \n" +
            "                    public void onClick(DialogInterface dialog, int id) {  \n" +
            "                    //  Action for 'NO' Button  \n" +
            "                    dialog.cancel();  \n" +
            "                 }  \n" +
            "                });  \n" +
            "      \n" +
            "            //Creating dialog box  \n" +
            "            AlertDialog alert = builder.create();  \n" +
            "            //Setting the title manually  \n" +
            "            alert.setTitle(\"AlertDialogExample\");  \n" +
            "            alert.show();  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "        }  \n" +
            "      \n" +
            "        @Override  \n" +
            "        public boolean onCreateOptionsMenu(Menu menu) {  \n" +
            "            // Inflate the menu; this adds items to the action bar if it is present.  \n" +
            "            getMenuInflater().inflate(R.menu.activity_main, menu);  \n" +
            "            return true;  \n" +
            "        }  \n" +
            "      \n" +
            "    }  ";
    String AutoCompletetextView ="    package com.example.autocompletetextview;  \n" +
            "      \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.graphics.Color;  \n" +
            "    import android.view.Menu;  \n" +
            "    import android.widget.ArrayAdapter;  \n" +
            "    import android.widget.AutoCompleteTextView;  \n" +
            "      \n" +
            "    public class MainActivity extends Activity {  \n" +
            "        String[] language ={\"C\",\"C++\",\"Java\",\".NET\",\"iPhone\",\"Android\",\"ASP.NET\",\"PHP\"};  \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "              \n" +
            "            //Creating the instance of ArrayAdapter containing list of language names  \n" +
            "               ArrayAdapter<String> adapter = new ArrayAdapter<String>  \n" +
            "                (this,android.R.layout.select_dialog_item,language);  \n" +
            "            //Getting the instance of AutoCompleteTextView  \n" +
            "               AutoCompleteTextView actv= (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);  \n" +
            "               actv.setThreshold(1);//will start working from first character  \n" +
            "               actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView  \n" +
            "               actv.setTextColor(Color.RED);  \n" +
            "                              \n" +
            "        }  \n" +
            "      \n" +
            "        @Override  \n" +
            "        public boolean onCreateOptionsMenu(Menu menu) {  \n" +
            "            // Inflate the menu; this adds items to the action bar if it is present.  \n" +
            "            getMenuInflater().inflate(R.menu.activity_main, menu);  \n" +
            "            return true;  \n" +
            "        }  \n" +
            "      \n" +
            "    }  ";
    String ToggleButton ="    package com.example.togglebutton;  \n" +
            "      \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.view.Menu;  \n" +
            "    import android.view.View;  \n" +
            "    import android.view.View.OnClickListener;  \n" +
            "    import android.widget.Button;  \n" +
            "    import android.widget.Toast;  \n" +
            "    import android.widget.ToggleButton;  \n" +
            "      \n" +
            "    public class MainActivity extends Activity {  \n" +
            "        private ToggleButton toggleButton1, toggleButton2;  \n" +
            "        private Button buttonSubmit;  \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "              \n" +
            "            addListenerOnButtonClick();  \n" +
            "        }  \n" +
            "        public void addListenerOnButtonClick(){  \n" +
            "            //Getting the ToggleButton and Button instance from the layout xml file  \n" +
            "            toggleButton1=(ToggleButton)findViewById(R.id.toggleButton1);  \n" +
            "            toggleButton2=(ToggleButton)findViewById(R.id.toggleButton2);  \n" +
            "            buttonSubmit=(Button)findViewById(R.id.button1);  \n" +
            "      \n" +
            "            //Performing action on button click  \n" +
            "            buttonSubmit.setOnClickListener(new OnClickListener(){  \n" +
            "      \n" +
            "                @Override  \n" +
            "                public void onClick(View view) {  \n" +
            "                    StringBuilder result = new StringBuilder();  \n" +
            "                       result.append(\"ToggleButton1 : \").append(toggleButton1.getText());  \n" +
            "                       result.append(\"\\nToggleButton2 : \").append(toggleButton2.getText());  \n" +
            "                    //Displaying the message in toast  \n" +
            "                    Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();  \n" +
            "                }  \n" +
            "                  \n" +
            "            });  \n" +
            "              \n" +
            "        }  \n" +
            "        @Override  \n" +
            "        public boolean onCreateOptionsMenu(Menu menu) {  \n" +
            "            // Inflate the menu; this adds items to the action bar if it is present.  \n" +
            "            getMenuInflater().inflate(R.menu.activity_main, menu);  \n" +
            "            return true;  \n" +
            "        }  \n" +
            "      \n" +
            "    }  ";
    String  RadioGroup="package com.mkyong.android;\n" +
            "\n" +
            "import android.app.Activity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.view.View.OnClickListener;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.RadioButton;\n" +
            "import android.widget.RadioGroup;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MyAndroidAppActivity extends Activity {\n" +
            "\n" +
            "  private RadioGroup radioSexGroup;\n" +
            "  private RadioButton radioSexButton;\n" +
            "  private Button btnDisplay;\n" +
            "\n" +
            "  @Override\n" +
            "  public void onCreate(Bundle savedInstanceState) {\n" +
            "\tsuper.onCreate(savedInstanceState);\n" +
            "\tsetContentView(R.layout.main);\n" +
            "\n" +
            "\taddListenerOnButton();\n" +
            "\n" +
            "  }\n" +
            "\n" +
            "  public void addListenerOnButton() {\n" +
            "\n" +
            "\tradioSexGroup = (RadioGroup) findViewById(R.id.radioSex);\n" +
            "\tbtnDisplay = (Button) findViewById(R.id.btnDisplay);\n" +
            "\n" +
            "\tbtnDisplay.setOnClickListener(new OnClickListener() {\n" +
            "\n" +
            "\t\t@Override\n" +
            "\t\tpublic void onClick(View v) {\n" +
            "\n" +
            "\t\t        // get selected radio button from radioGroup\n" +
            "\t\t\tint selectedId = radioSexGroup.getCheckedRadioButtonId();\n" +
            "\n" +
            "\t\t\t// find the radiobutton by returned id\n" +
            "\t\t        radioSexButton = (RadioButton) findViewById(selectedId);\n" +
            "\n" +
            "\t\t\tToast.makeText(MyAndroidAppActivity.this,\n" +
            "\t\t\t\tradioSexButton.getText(), Toast.LENGTH_SHORT).show();\n" +
            "\n" +
            "\t\t}\n" +
            "\n" +
            "\t});\n" +
            "\n" +
            "  }\n" +
            "}";
    String CheckBox="    package com.example.checkbox;  \n" +
            "      \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.view.Menu;  \n" +
            "    import android.view.View;  \n" +
            "    import android.view.View.OnClickListener;  \n" +
            "    import android.widget.*;  \n" +
            "      \n" +
            "    public class MainActivity extends Activity {  \n" +
            "        CheckBox pizza,coffe,burger;  \n" +
            "        Button buttonOrder;  \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "            addListenerOnButtonClick();  \n" +
            "        }  \n" +
            "    public void addListenerOnButtonClick(){  \n" +
            "        //Getting instance of CheckBoxes and Button from the activty_main.xml file  \n" +
            "        pizza=(CheckBox)findViewById(R.id.checkBox1);  \n" +
            "        coffe=(CheckBox)findViewById(R.id.checkBox2);  \n" +
            "        burger=(CheckBox)findViewById(R.id.checkBox3);  \n" +
            "        buttonOrder=(Button)findViewById(R.id.button1);  \n" +
            "      \n" +
            "        //Applying the Listener on the Button click  \n" +
            "        buttonOrder.setOnClickListener(new OnClickListener(){  \n" +
            "      \n" +
            "            @Override  \n" +
            "            public void onClick(View view) {  \n" +
            "                int totalamount=0;  \n" +
            "                StringBuilder result=new StringBuilder();  \n" +
            "                result.append(\"Selected Items:\");  \n" +
            "                if(pizza.isChecked()){  \n" +
            "                    result.append(\"\\nPizza 100Rs\");  \n" +
            "                    totalamount+=100;  \n" +
            "                }  \n" +
            "                if(coffe.isChecked()){  \n" +
            "                    result.append(\"\\nCoffe 50Rs\");  \n" +
            "                    totalamount+=50;  \n" +
            "                }  \n" +
            "                if(burger.isChecked()){  \n" +
            "                    result.append(\"\\nBurger 120Rs\");  \n" +
            "                    totalamount+=120;  \n" +
            "                }  \n" +
            "                result.append(\"\\nTotal: \"+totalamount+\"Rs\");  \n" +
            "                //Displaying the message on the toast  \n" +
            "                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();  \n" +
            "            }  \n" +
            "              \n" +
            "        });  \n" +
            "    }  \n" +
            "        @Override  \n" +
            "        public boolean onCreateOptionsMenu(Menu menu) {  \n" +
            "            // Inflate the menu; this adds items to the action bar if it is present.  \n" +
            "            getMenuInflater().inflate(R.menu.activity_main, menu);  \n" +
            "            return true;  \n" +
            "        }  \n" +
            "      \n" +
            "    }  ";
    String Spinner ="    package com.example.spinner;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.view.Menu;  \n" +
            "    import android.view.View;  \n" +
            "    import android.widget.AdapterView;  \n" +
            "    import android.widget.ArrayAdapter;  \n" +
            "    import android.widget.Spinner;  \n" +
            "    import android.widget.TextView;  \n" +
            "    import android.widget.Toast;  \n" +
            "      \n" +
            "    public class MainActivity extends Activity implements  \n" +
            "    AdapterView.OnItemSelectedListener {  \n" +
            "      \n" +
            "        String[] country = { \"India\", \"USA\", \"China\", \"Japan\", \"Other\",  };  \n" +
            "      \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "            //Getting the instance of Spinner and applying OnItemSelectedListener on it  \n" +
            "            Spinner spin = (Spinner) findViewById(R.id.spinner1);  \n" +
            "            spin.setOnItemSelectedListener(this);  \n" +
            "              \n" +
            "            //Creating the ArrayAdapter instance having the country list  \n" +
            "            ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);  \n" +
            "            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  \n" +
            "            //Setting the ArrayAdapter data on the Spinner  \n" +
            "            spin.setAdapter(aa);  \n" +
            "        }  \n" +
            "      \n" +
            "          \n" +
            "        //Performing action onItemSelected and onNothing selected  \n" +
            "        @Override  \n" +
            "        public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {  \n" +
            "            Toast.makeText(getApplicationContext(),country[position] ,Toast.LENGTH_LONG).show();  \n" +
            "        }  \n" +
            "      \n" +
            "        @Override  \n" +
            "        public void onNothingSelected(AdapterView<?> arg0) {  \n" +
            "            // TODO Auto-generated method stub  \n" +
            "              \n" +
            "        }  \n" +
            "      \n" +
            "        @Override  \n" +
            "        public boolean onCreateOptionsMenu(Menu menu) {  \n" +
            "            // Inflate the menu; this adds items to the action bar if it is present.  \n" +
            "            getMenuInflater().inflate(R.menu.activity_main, menu);  \n" +
            "            return true;  \n" +
            "        }  \n" +
            "    }  ";
    String  ArrayAdapter="package example.abhiandriod.arrayadapterexample; //use package of your project\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.ListView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    // Array of strings...\n" +
            "    ListView simpleList;\n" +
            "    String animalList[] = {\"Lion\",\"Tiger\",\"Monkey\",\"Elephant\",\"Dog\",\"Cat\",\"Camel\"};\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        simpleList = (ListView) findViewById(R.id.simpleListView);\n" +
            "\n" +
            "        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, animalList);\n" +
            "        simpleList.setAdapter(arrayAdapter);\n" +
            "    }\n" +
            "       \n" +
            "    }\n" +
            "}";
    String intent ="  implicit intent example\n" +
            "  package org.sssit.implicitintent;  \n" +
            "    import android.net.Uri;  \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.content.Intent;  \n" +
            "    import android.view.View;  \n" +
            "    import android.view.View.OnClickListener;  \n" +
            "    import android.widget.Button;  \n" +
            "    import android.widget.EditText;  \n" +
            "    public class MainActivity extends Activity {  \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "            final EditText editText1=(EditText)findViewById(R.id.editText1);  \n" +
            "            Button button1=(Button)findViewById(R.id.button1);  \n" +
            "            button1.setOnClickListener(new OnClickListener() {  \n" +
            "                @Override  \n" +
            "                public void onClick(View arg0) {  \n" +
            "                    String url=editText1.getText().toString();  \n" +
            "                    Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url));  \n" +
            "                    startActivity(intent);  \n" +
            "                }  \n" +
            "            });  \n" +
            "        }  \n" +
            "    }  \n\n" +
            "explicit intent example\n\n" +
            "File: MainActivityOne.java\n" +
            "\n" +
            "    package com.example.explicitintent2;  \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.content.Intent;  \n" +
            "    import android.view.Menu;  \n" +
            "    import android.view.View;  \n" +
            "    import android.view.View.OnClickListener;  \n" +
            "    import android.widget.Button;  \n" +
            "    import android.widget.Toast;  \n" +
            "    public class ActivityOne extends Activity {  \n" +
            "        /** Called when the activity is first created. */  \n" +
            "          @Override  \n" +
            "          public void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "            Button button1=(Button)findViewById(R.id.Button01);  \n" +
            "              \n" +
            "            button1.setOnClickListener(new OnClickListener(){  \n" +
            "             public void onClick(View view) {  \n" +
            "              Intent i = new Intent(getApplicationContext(), ActivityTwo.class);  \n" +
            "              i.putExtra(\"Value1\", \"Android By Javatpoint\");  \n" +
            "              i.putExtra(\"Value2\", \"Simple Tutorial\");  \n" +
            "              // Set the request code to any code you like, you can identify the  \n" +
            "              // callback via this code  \n" +
            "              startActivity(i);  \n" +
            "             }  \n" +
            "             });  \n" +
            "          }  \n" +
            "        }   \n" +
            "\n" +
            "ActivityTwo class\n" +
            "File: MainActivityTwo.java\n" +
            "\n" +
            "    package com.example.explicitintent2;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.content.Intent;  \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.view.View;  \n" +
            "    import android.view.View.OnClickListener;  \n" +
            "    import android.widget.Button;  \n" +
            "    import android.widget.EditText;  \n" +
            "    import android.widget.TextView;  \n" +
            "    import android.widget.Toast;  \n" +
            "    public class ActivityTwo extends Activity {  \n" +
            "    /** Called when the activity is first created. */  \n" +
            "      @Override  \n" +
            "      public void onCreate(Bundle bundle) {  \n" +
            "        super.onCreate(bundle);  \n" +
            "        TextView tv=new TextView(this);  \n" +
            "        tv.setText(\"second activity\");  \n" +
            "        setContentView(R.layout.activity_two);  \n" +
            "        Bundle extras = getIntent().getExtras();  \n" +
            "        String value1 = extras.getString(\"Value1\");  \n" +
            "        String value2 = extras.getString(\"Value2\");  \n" +
            "        Toast.makeText(getApplicationContext(),\"Values are:\\n First value: \"+value1+  \n" +
            "             \"\\n Second Value: \"+value2,Toast.LENGTH_LONG).show();  \n" +
            "        Button button1=(Button)findViewById(R.id.Button01);  \n" +
            "        button1.setOnClickListener(new OnClickListener(){  \n" +
            "            public void onClick(View view) {  \n" +
            "                Intent i = new Intent(getApplicationContext(), ActivityOne.class);  \n" +
            "                startActivity(i);  \n" +
            "              }  \n" +
            "        });  \n" +
            "      }  \n" +
            "    }   ";
    String fragment="File: MainActivity.java\n" +
            "\n" +
            "    package com.example.fragmentexample;  \n" +
            "      \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.view.Menu;  \n" +
            "    public class MainActivity extends Activity {  \n" +
            "      \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "        }  \n" +
            "    }  \n" +
            "\n" +
            "File: Fragment1.java\n" +
            "\n" +
            "    package com.example.fragmentexample;  \n" +
            "      \n" +
            "    import android.app.Fragment;  \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.view.LayoutInflater;  \n" +
            "    import android.view.View;  \n" +
            "    import android.view.ViewGroup;  \n" +
            "      \n" +
            "    public class Fragment1 extends Fragment {  \n" +
            "        @Override  \n" +
            "        public View onCreateView(LayoutInflater inflater, ViewGroup container,  \n" +
            "                Bundle savedInstanceState) {  \n" +
            "            // TODO Auto-generated method stub  \n" +
            "            return inflater.inflate(R.layout.fragment1,container, false);  \n" +
            "        }  \n" +
            "      \n" +
            "    }  \n" +
            "\n" +
            "File: Fragment2.java\n" +
            "\n" +
            "    package com.example.fragmentexample;  \n" +
            "      \n" +
            "    import android.app.Fragment;  \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.view.LayoutInflater;  \n" +
            "    import android.view.View;  \n" +
            "    import android.view.ViewGroup;  \n" +
            "      \n" +
            "    public class Fragment2 extends Fragment {  \n" +
            "          \n" +
            "        public View onCreateView(LayoutInflater inflater, ViewGroup container,  \n" +
            "                Bundle savedInstanceState) {  \n" +
            "            // TODO Auto-generated method stub  \n" +
            "            return inflater.inflate(R.layout.fragment2,container, false);  \n" +
            "        }  \n" +
            "      \n" +
            "    }  ";
    String  FrgamentLifecyclemethods="";
    String ListViewFragMent="";
    String DialogFragMent ="";
    String splashActiVity ="";
    String viewgroup="package com.example.demo;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import android.app.Activity;\n" +
            "\n" +
            "public class MainActivity extends Activity {\n" +
            "   @Override\n" +
            "   protected void onCreate(Bundle savedInstanceState) {\n" +
            "      super.onCreate(savedInstanceState);\n" +
            "      setContentView(R.layout.activity_main);\n" +
            "   }\n" +
            "   \n" +
            "}";
    String Viewpager ="Main activity\n\n" +
            "import android.support.v4.app.Fragment;\n" +
            "import android.support.v4.app.FragmentManager;\n" +
            "import android.support.v4.app.FragmentPagerAdapter;\n" +
            "import android.support.v4.app.FragmentTransaction;\n" +
            "import android.support.v4.view.ViewPager;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "\n" +
            "import java.util.ArrayList;\n" +
            "\n" +
            "public class ClassTask5 extends AppCompatActivity {\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_class_task5);\n" +
            "\n" +
            "        MyAdapter adapter=new MyAdapter(getSupportFragmentManager());\n" +
            "        ViewPager v=(ViewPager)findViewById(R.id.v1) ;\n" +
            "        v.setAdapter(adapter);\n" +
            "\n" +
            "    }\n" +
            "}\n\n" +
            "Fragment A\n" +
            "package com.example.shukla.classtask5;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import android.support.annotation.Nullable;\n" +
            "import android.support.v4.app.Fragment;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "\n" +
            "/**\n" +
            " * Created by shukla on 7/4/2017.\n" +
            " */\n" +
            "\n" +
            "public class FragA extends Fragment {\n" +
            "    @Nullable\n" +
            "    @Override\n" +
            "    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {\n" +
            "       return  inflater.inflate(R.layout.fraga,container,false);\n" +
            "    }\n" +
            "}\n" +
            "Fragment B\n" +
            "package com.example.shukla.classtask5;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import android.support.annotation.Nullable;\n" +
            "import android.support.v4.app.Fragment;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "\n" +
            "/**\n" +
            " * Created by shukla on 7/4/2017.\n" +
            " */\n" +
            "\n" +
            "public class FragB extends Fragment {\n" +
            "    @Nullable\n" +
            "    @Override\n" +
            "    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {\n" +
            "        return  inflater.inflate(R.layout.fragb,container,false);\n" +
            "    }\n" +
            "}" +
            "Fragment C\n" +
            "package com.example.shukla.classtask5;\n" +
            "\n" +
            "import android.os.Bundle;\n" +
            "import android.support.annotation.Nullable;\n" +
            "import android.support.v4.app.Fragment;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "\n" +
            "/**\n" +
            " * Created by shukla on 7/4/2017.\n" +
            " */\n" +
            "\n" +
            "public class FragC extends Fragment {\n" +
            "    @Nullable\n" +
            "    @Override\n" +
            "    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {\n" +
            "        return  inflater.inflate(R.layout.fragc,container,false);\n" +
            "    }\n" +
            "}\n";
    String Tab ="package com.example.shukla.tutapp2;\n" +
            "\n" +
            "import android.support.design.widget.TabLayout;\n" +
            "import android.support.design.widget.FloatingActionButton;\n" +
            "import android.support.design.widget.Snackbar;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.support.v7.widget.Toolbar;\n" +
            "\n" +
            "import android.support.v4.app.Fragment;\n" +
            "import android.support.v4.app.FragmentManager;\n" +
            "import android.support.v4.app.FragmentPagerAdapter;\n" +
            "import android.support.v4.view.ViewPager;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.Menu;\n" +
            "import android.view.MenuItem;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class Main2Activity extends AppCompatActivity {\n" +
            "\n" +
            "    /**\n" +
            "     * The {@link android.support.v4.view.PagerAdapter} that will provide\n" +
            "     * fragments for each of the sections. We use a\n" +
            "     * {@link FragmentPagerAdapter} derivative, which will keep every\n" +
            "     * loaded fragment in memory. If this becomes too memory intensive, it\n" +
            "     * may be best to switch to a\n" +
            "     * {@link android.support.v4.app.FragmentStatePagerAdapter}.\n" +
            "     */\n" +
            "    private SectionsPagerAdapter mSectionsPagerAdapter;\n" +
            "\n" +
            "    /**\n" +
            "     * The {@link ViewPager} that will host the section contents.\n" +
            "     */\n" +
            "    private ViewPager mViewPager;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main2);\n" +
            "\n" +
            "        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);\n" +
            "        setSupportActionBar(toolbar);\n" +
            "        // Create the adapter that will return a fragment for each of the three\n" +
            "        // primary sections of the activity.\n" +
            "        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());\n" +
            "\n" +
            "        // Set up the ViewPager with the sections adapter.\n" +
            "        mViewPager = (ViewPager) findViewById(R.id.container);\n" +
            "        mViewPager.setAdapter(mSectionsPagerAdapter);\n" +
            "\n" +
            "        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);\n" +
            "        tabLayout.setupWithViewPager(mViewPager);\n" +
            "\n" +
            "        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);\n" +
            "        fab.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View view) {\n" +
            "                Snackbar.make(view, \"Replace with your own action\", Snackbar.LENGTH_LONG)\n" +
            "                        .setAction(\"Action\", null).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onCreateOptionsMenu(Menu menu) {\n" +
            "        // Inflate the menu; this adds items to the action bar if it is present.\n" +
            "        getMenuInflater().inflate(R.menu.menu_main2, menu);\n" +
            "        return true;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean onOptionsItemSelected(MenuItem item) {\n" +
            "        // Handle action bar item clicks here. The action bar will\n" +
            "        // automatically handle clicks on the Home/Up button, so long\n" +
            "        // as you specify a parent activity in AndroidManifest.xml.\n" +
            "        int id = item.getItemId();\n" +
            "\n" +
            "        //noinspection SimplifiableIfStatement\n" +
            "        if (id == R.id.action_settings) {\n" +
            "            return true;\n" +
            "        }\n" +
            "\n" +
            "        return super.onOptionsItemSelected(item);\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * A placeholder fragment containing a simple view.\n" +
            "     */\n" +
            "    public static class PlaceholderFragment extends Fragment {\n" +
            "        /**\n" +
            "         * The fragment argument representing the section number for this\n" +
            "         * fragment.\n" +
            "         */\n" +
            "     //  String ARG_SECTION_NUMBER = \"section_number\";\n" +
            "      //  String s=\"tutapp\";\n" +
            "\n" +
            "        public PlaceholderFragment() {\n" +
            "        }\n" +
            "\n" +
            "        /**\n" +
            "         * Returns a new instance of this fragment for the given section\n" +
            "         * number.\n" +
            "         */\n" +
            "        public static PlaceholderFragment newInstance(int sectionNumber) {\n" +
            "            PlaceholderFragment fragment = new PlaceholderFragment();\n" +
            "            Bundle args = new Bundle();\n" +
            "           // args.putInt(ARG_SECTION_NUMBER, sectionNumber);\n" +
            "            fragment.setArguments(args);\n" +
            "            return fragment;\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
            "                                 Bundle savedInstanceState) {\n" +
            "            View rootView = inflater.inflate(R.layout.fragment_main2, container, false);\n" +
            "            TextView textView = (TextView) rootView.findViewById(R.id.section_label);\n" +
            "          //  TextView textView1 = (TextView) rootView.findViewById(R.id.t2);\n" +
            "            textView.setText();\n" +
            "            //textView1.setText(s);\n" +
            "            return rootView;\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    /**\n" +
            "     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to\n" +
            "     * one of the sections/tabs/pages.\n" +
            "     */\n" +
            "    public class SectionsPagerAdapter extends FragmentPagerAdapter {\n" +
            "\n" +
            "        public SectionsPagerAdapter(FragmentManager fm) {\n" +
            "            super(fm);\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public Fragment getItem(int position) {\n" +
            "\n" +
            "\n" +
            "            switch (position){\n" +
            "                case 0:\n" +
            "                       Concept concept=new Concept();\n" +
            "                          return concept;\n" +
            "\n" +
            "                case 1:\n" +
            "                    XmlCode xmlCode=new XmlCode();\n" +
            "                    return xmlCode;\n" +
            "                case 2:\n" +
            "                   JavaCode javaCode=new JavaCode();\n" +
            "                    return javaCode;\n" +
            "\n" +
            "                default:\n" +
            "                    return null;\n" +
            "            }\n" +
            "\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public int getCount() {\n" +
            "            // Show 3 total pages.\n" +
            "            return 3;\n" +
            "        }\n" +
            "\n" +
            "        @Override\n" +
            "        public CharSequence getPageTitle(int position) {\n" +
            "            switch (position) {\n" +
            "                case 0:\n" +
            "                    return \"Concept\";\n" +
            "                case 1:\n" +
            "                    return \"XML code\";\n" +
            "                case 2:\n" +
            "                    return \"java code\";\n" +
            "            }\n" +
            "            return null;\n" +
            "        }\n" +
            "    }\n" +
            "}\n";
    String  BroadestReceiver="package com.example.tutorialspoint7.myapplication;\n" +
            "\n" +
            "import android.app.Activity;\n" +
            "import android.content.Intent;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "\n" +
            "public class MainActivity extends Activity {\n" +
            "\n" +
            "   /** Called when the activity is first created. */\n" +
            "   @Override\n" +
            "   \n" +
            "   public void onCreate(Bundle savedInstanceState) {\n" +
            "      super.onCreate(savedInstanceState);\n" +
            "      setContentView(R.layout.activity_main);\n" +
            "   }\n" +
            "\n" +
            "\n" +
            "   // broadcast a custom intent.\n" +
            "      \n" +
            "   public void broadcastIntent(View view){\n" +
            "      Intent intent = new Intent();\n" +
            "      intent.setAction(\"com.tutorialspoint.CUSTOM_INTENT\"); sendBroadcast(intent);\n" +
            "   }\n" +
            "}\n" +
            "\n" +
            "Following is the content of MyReceiver.java:\n" +
            "\n" +
            "package com.example.tutorialspoint7.myapplication;\n" +
            "\n" +
            "import android.content.BroadcastReceiver;\n" +
            "import android.content.Context;\n" +
            "import android.content.Intent;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "/**\n" +
            " * Created by TutorialsPoint7 on 8/23/2016.\n" +
            " */\n" +
            "public class MyReceiver extends BroadcastReceiver{\n" +
            "   @Override\n" +
            "   public void onReceive(Context context, Intent intent) {\n" +
            "      Toast.makeText(context, \"Intent Detected.\", Toast.LENGTH_LONG).show();\n" +
            "   }\n" +
            "}";
    String  Menus="    package com.javatpoint.optionmenu;  \n" +
            "    import android.os.Bundle;  \n" +
            "    import android.app.Activity;  \n" +
            "    import android.view.Menu;  \n" +
            "    import android.view.MenuItem;  \n" +
            "    import android.widget.Toast;  \n" +
            "    public class MainActivity extends Activity {  \n" +
            "        @Override  \n" +
            "        protected void onCreate(Bundle savedInstanceState) {  \n" +
            "            super.onCreate(savedInstanceState);  \n" +
            "            setContentView(R.layout.activity_main);  \n" +
            "        }  \n" +
            "        @Override  \n" +
            "        public boolean onCreateOptionsMenu(Menu menu) {  \n" +
            "            // Inflate the menu; this adds items to the action bar if it is present.  \n" +
            "            getMenuInflater().inflate(R.menu.main, menu);//Menu Resource, Menu  \n" +
            "            return true;  \n" +
            "        }  \n" +
            "        @Override  \n" +
            "        public boolean onOptionsItemSelected(MenuItem item) {  \n" +
            "            switch (item.getItemId()) {  \n" +
            "                case R.id.item1:  \n" +
            "                  Toast.makeText(getApplicationContext(),\"Item 1 Selected\",Toast.LENGTH_LONG).show();  \n" +
            "                return true;     \n" +
            "               case R.id.item2:  \n" +
            "                    Toast.makeText(getApplicationContext(),\"Item 2 Selected\",Toast.LENGTH_LONG).show();  \n" +
            "                  return true;     \n" +
            "                case R.id.item3:  \n" +
            "                    Toast.makeText(getApplicationContext(),\"Item 3 Selected\",Toast.LENGTH_LONG).show();  \n" +
            "                  return true;     \n" +
            "                  default:  \n" +
            "                    return super.onOptionsItemSelected(item);  \n" +
            "            }  \n" +
            "        }  \n" +
            "    }  ";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.activity_fragc,container,false);
        TextView t=(TextView)v.findViewById(R.id.tv1) ;
       // t.setText(str3);
        Intent i = getActivity().getIntent();
        Bundle b = i.getExtras();
        if (b != null) {
            int j = (Integer) b.get("key");
            switch (j) {
                case 0: t.setText(history1);
                  break;
                case 1:
                    t.setText(lifecycle);
                    break;
                case 2:
                    t.setText(orientation);
                    break;
                case 3:
                    t.setText(event_handling);
                    break;
                case 4:
                    t.setText(toast_class);
                    break;

                case 5:
                    t.setText(layout_inflator);
                    break;
                case 6:
                    t.setText(viewgroup);
                    break;

                case 7:
                    t.setText(dialog_box);
                    break;
                case 8:
                    t.setText(AutoCompletetextView);
                    break;
                case 9:
                    t.setText(ToggleButton);
                    break;
                case 10:
                    t.setText(RadioGroup);
                    break;
                case 11:
                    t.setText(CheckBox);
                    break;
                case 12:
                    t.setText(Spinner);
                    break;
                case 13:
                    t.setText(ArrayAdapter);
                    break;
                case 14:
                    t.setText(intent);
                    break;
                case 15:
                    t.setText(fragment);
                    break;
                case 16:
                    t.setText(Viewpager);
                    break;
                case 17:
                    t.setText(Tab);
                    break;
                case 18:
                    t.setText(BroadestReceiver);
                    break;
                case 19:
                    t.setText(Menus);
                    break;


            }

        }
return v;
    }
}

