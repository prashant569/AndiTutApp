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

public class Fragb extends Fragment {
    String toast_class="\"<?xml version=\\\"1.0\\\" encoding=\\\"utf-8\\\"?>\\n\" +\n" +
            "            \"<LinearLayout xmlns:android=\\\"http://schemas.android.com/apk/res/android\\\"\\n\" +\n" +
            "            \"    android:layout_width=\\\"match_parent\\\"\\n\" +\n" +
            "            \"    android:layout_height=\\\"match_parent\\\"\\n\" +\n" +
            "            \"    android:orientation=\\\"vertical\\\" >\\n\" +\n" +
            "            \"\\n\" +\n" +
            "            \"    <Button\\n\" +\n" +
            "            \"        android:id=\\\"@+id/button1\\\"\\n\" +\n" +
            "            \"        android:layout_width=\\\"wrap_content\\\"\\n\" +\n" +
            "            \"        android:layout_height=\\\"wrap_content\\\"\\n\" +\n" +
            "            \"        android:text=\\\"Button\\\" />\\n\" +\n" +
            "            \"\\n\" ";

String history1="there is no xml bcoz it is history only theoratical";
    String lifecycle="there is no xml bcoz it is lifecycle  only theoratical and  java file";
    String orientation = "    <activity  \n" +
            "                android:name=\"com.example.screenorientation.MainActivity\"  \n" +
            "                android:label=\"@string/app_name\"   \n" +
            "                android:screenOrientation=\"landscape\"  \n" +
            "                >  ";
    String event_handling = "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <EditText  \n" +
            "            android:id=\"@+id/editText1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_centerHorizontal=\"true\"  \n" +
            "            android:layout_marginTop=\"24dp\"  \n" +
            "            android:ems=\"10\" />  \n" +
            "      \n" +
            "        <EditText  \n" +
            "            android:id=\"@+id/editText2\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignLeft=\"@+id/editText1\"  \n" +
            "            android:layout_below=\"@+id/editText1\"  \n" +
            "            android:layout_marginTop=\"34dp\"  \n" +
            "            android:ems=\"10\" >  \n" +
            "      \n" +
            "            <requestFocus />  \n" +
            "        </EditText>  \n" +
            "      \n" +
            "        <Button  \n" +
            "            android:id=\"@+id/button1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_centerHorizontal=\"true\"  \n" +
            "            android:layout_centerVertical=\"true\"  \n" +
            "            android:text=\"@string/Button\" />  \n" +
            "      \n" +
            "    </RelativeLayout>  ";
    String layout_inflator = "<RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "\" +\n" +
            "            \"        xmlns:tools=\\\"http://schemas.android.com/tools\\\"  \\n\" +\n" +
            "            \"        android:layout_width=\\\"match_parent\\\"  \\n\" +\n" +
            "            \"        android:layout_height=\\\"match_parent\\\"  \\n\" +\n" +
            "            \"        tools:context=\\\".MainActivity\\\" >  \\n\" +\n" +
            "            \"      \\n\" +\n" +
            "            \"        <EditText  \\n\" +\n" +
            "            \"            android:id=\\\"@+id/editText1\\\"  \\n\" +\n" +
            "            \"            android:layout_width=\\\"wrap_content\\\"  \\n\" +\n" +
            "            \"            android:layout_height=\\\"wrap_content\\\"  \\n\" +\n" +
            "            \"            android:layout_alignParentTop=\\\"true\\\"  \\n\" +\n" +
            "            \"            android:layout_centerHorizontal=\\\"true\\\"  \\n\" +\n" +
            "            \"            android:layout_marginTop=\\\"24dp\\\"  \\n\" +\n" +
            "            \"            android:ems=\\\"10\\\" />  \\n\" +\n" +
            "            \"      \\n\" +\n" +
            "            \"        <EditText  \\n\" +\n" +
            "            \"            android:id=\\\"@+id/editText2\\\"  \\n\" +\n" +
            "            \"            android:layout_width=\\\"wrap_content\\\"  \\n\" +\n" +
            "            \"            android:layout_height=\\\"wrap_content\\\"  \\n\" +\n" +
            "            \"            android:layout_alignLeft=\\\"@+id/editText1\\\"  \\n\" +\n" +
            "            \"            android:layout_below=\\\"@+id/editText1\\\"  \\n\" +\n" +
            "            \"            android:layout_marginTop=\\\"34dp\\\"  \\n\" +\n" +
            "            \"            android:ems=\\\"10\\\" >  \\n\"";
    String viewgroup = "\n" +
            "\n" +
            "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\" >\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/button1\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Button\" />\n" +
            "\n" +
            "    <de.vogella.android.ownview.MyDrawView\n" +
            "        android:id=\"@+id/myDrawView1\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\" />\n" +
            "\n" +
            "</LinearLayout>\n" +
            "\n";
    String dialog_box = "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <TextView  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_centerHorizontal=\"true\"  \n" +
            "            android:layout_centerVertical=\"true\"  \n" +
            "            android:text=\"@string/hello_world\" />  \n" +
            "      \n" +
            "    </RelativeLayout>  \n" +
            "\n" +
            "strings.xml\n" +
            "\n" +
            "Optionally, you can store the dialog message and title in the strings.xml file.\n" +
            "File: strings.xml\n" +
            "\n" +
            "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
            "    <resources>  \n" +
            "      \n" +
            "        <string name=\"app_name\">alertdialog</string>  \n" +
            "        <string name=\"hello_world\">Hello world!</string>  \n" +
            "        <string name=\"menu_settings\">Settings</string>  \n" +
            "        <string name=\"dialog_message\">Welcome to Alert Dialog</string>  \n" +
            "       \n" +
            "       <string name=\"dialog_title\">Javatpoint Alert Dialog</string>  \n" +
            "    </resources>  " +
            "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <TextView  \n" +
            "            android:id=\"@+id/textView1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentLeft=\"true\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_marginLeft=\"50dp\"  \n" +
            "            android:layout_marginTop=\"36dp\"  \n" +
            "            android:text=\"Current Date:\" />  \n" +
            "      \n" +
            "        <Button  \n" +
            "            android:id=\"@+id/button1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentBottom=\"true\"  \n" +
            "            android:layout_centerHorizontal=\"true\"  \n" +
            "            android:layout_marginBottom=\"140dp\"  \n" +
            "            android:text=\"Change Date\" />  \n" +
            "      \n" +
            "        <DatePicker  \n" +
            "            android:id=\"@+id/datePicker1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_above=\"@+id/button1\"  \n" +
            "            android:layout_centerHorizontal=\"true\"  \n" +
            "            android:layout_marginBottom=\"30dp\" />  \n" +
            "      \n" +
            "    </RelativeLayout>  ";
    String AutoCompletetextView = "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <TextView  \n" +
            "            android:id=\"@+id/textView1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentLeft=\"true\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_marginTop=\"15dp\"  \n" +
            "            android:text=\"@string/what_is_your_favourite_programming_language_\" />  \n" +
            "      \n" +
            "        <AutoCompleteTextView  \n" +
            "            android:id=\"@+id/autoCompleteTextView1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentLeft=\"true\"  \n" +
            "            android:layout_below=\"@+id/textView1\"  \n" +
            "            android:layout_marginLeft=\"36dp\"  \n" +
            "            android:layout_marginTop=\"17dp\"  \n" +
            "            android:ems=\"10\"  \n" +
            "            android:text=\"\">  \n" +
            "      \n" +
            "            <requestFocus />  \n" +
            "        </AutoCompleteTextView>  \n" +
            "          \n" +
            "    </RelativeLayout>  ";
    String ToggleButton = "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <ToggleButton  \n" +
            "            android:id=\"@+id/toggleButton1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentLeft=\"true\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_marginLeft=\"60dp\"  \n" +
            "            android:layout_marginTop=\"18dp\"  \n" +
            "            android:text=\"ToggleButton1\"  \n" +
            "            android:textOff=\"Off\"  \n" +
            "            android:textOn=\"On\" />  \n" +
            "      \n" +
            "        <ToggleButton  \n" +
            "            android:id=\"@+id/toggleButton2\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignBaseline=\"@+id/toggleButton1\"  \n" +
            "            android:layout_alignBottom=\"@+id/toggleButton1\"  \n" +
            "            android:layout_marginLeft=\"44dp\"  \n" +
            "            android:layout_toRightOf=\"@+id/toggleButton1\"  \n" +
            "            android:text=\"ToggleButton2\"  \n" +
            "            android:textOff=\"Off\"  \n" +
            "            android:textOn=\"On\" />  \n" +
            "      \n" +
            "        <Button  \n" +
            "            android:id=\"@+id/button1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_below=\"@+id/toggleButton2\"  \n" +
            "            android:layout_marginTop=\"82dp\"  \n" +
            "            android:layout_toRightOf=\"@+id/toggleButton1\"  \n" +
            "            android:text=\"submit\" />  \n" +
            "      \n" +
            "    </RelativeLayout>  ";
    String RadioGroup = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "   xmlns:tools=\"http://schemas.android.com/tools\" \n" +
            "   android:layout_width=\"match_parent\"\n" +
            "   android:layout_height=\"match_parent\" \n" +
            "   android:paddingLeft=\"@dimen/activity_horizontal_margin\"\n" +
            "   android:paddingRight=\"@dimen/activity_horizontal_margin\"\n" +
            "   android:paddingTop=\"@dimen/activity_vertical_margin\"\n" +
            "   android:paddingBottom=\"@dimen/activity_vertical_margin\"\n" +
            "   tools:context=\".MainActivity\">\n" +
            "   \n" +
            "   <TextView\n" +
            "      android:layout_width=\"wrap_content\"\n" +
            "      android:layout_height=\"wrap_content\"\n" +
            "      android:text=\"Radio button\"\n" +
            "      android:id=\"@+id/textView\"\n" +
            "      android:layout_alignParentTop=\"true\"\n" +
            "      android:layout_centerHorizontal=\"true\"\n" +
            "      android:textSize=\"35dp\" />\n" +
            "   \n" +
            "   <TextView\n" +
            "      android:layout_width=\"wrap_content\"\n" +
            "      android:layout_height=\"wrap_content\"\n" +
            "      android:text=\"Tutorialspoint\"\n" +
            "      android:id=\"@+id/textView2\"\n" +
            "      android:layout_below=\"@+id/textView\"\n" +
            "      android:layout_alignRight=\"@+id/textView\"\n" +
            "      android:layout_alignEnd=\"@+id/textView\"\n" +
            "      android:textSize=\"35dp\"\n" +
            "      android:textColor=\"@android:color/holo_green_dark\" />\n" +
            "   \n" +
            "   <ImageView\n" +
            "      android:layout_width=\"wrap_content\"\n" +
            "      android:layout_height=\"wrap_content\"\n" +
            "      android:id=\"@+id/imageView\"\n" +
            "      android:src=\"@drawable/abc\"\n" +
            "      android:layout_below=\"@+id/textView2\"\n" +
            "      android:layout_alignLeft=\"@+id/textView\"\n" +
            "      android:layout_alignStart=\"@+id/textView\"\n" +
            "      android:layout_alignRight=\"@+id/textView\"\n" +
            "      android:layout_alignEnd=\"@+id/textView\" />\n" +
            "   \n" +
            "   <RadioGroup\n" +
            "      android:layout_width=\"fill_parent\"\n" +
            "      android:layout_height=\"90dp\"\n" +
            "      android:layout_below=\"@+id/imageView\"\n" +
            "      android:layout_marginTop=\"58dp\"\n" +
            "      android:weightSum=\"1\"\n" +
            "      android:id=\"@+id/radioGroup\"\n" +
            "      android:layout_alignLeft=\"@+id/textView2\"\n" +
            "      android:layout_alignStart=\"@+id/textView2\"\n" +
            "      android:layout_alignRight=\"@+id/textView3\"\n" +
            "      android:layout_alignEnd=\"@+id/textView3\">\n" +
            "   \n" +
            "      <RadioButton\n" +
            "         android:layout_width=\"wrap_content\"\n" +
            "         android:layout_height=\"55dp\"\n" +
            "         android:text=\"Male\"\n" +
            "         android:id=\"@+id/radioButton\"\n" +
            "         android:layout_gravity=\"center_horizontal\"\n" +
            "         android:checked=\"false\"\n" +
            "         android:textSize=\"25dp\" />\n" +
            "\n" +
            "      <RadioButton\n" +
            "         android:layout_width=\"wrap_content\"\n" +
            "         android:layout_height=\"wrap_content\"\n" +
            "         android:text=\"Female\"\n" +
            "         android:id=\"@+id/radioButton2\"\n" +
            "         android:layout_gravity=\"center_horizontal\"\n" +
            "         android:checked=\"false\"\n" +
            "         android:textSize=\"25dp\"\n" +
            "         android:layout_weight=\"0.13\" />\n" +
            "   </RadioGroup>\n" +
            "\n" +
            "   <TextView\n" +
            "      android:layout_width=\"wrap_content\"\n" +
            "      android:layout_height=\"wrap_content\"\n" +
            "      android:text=\"    Are you?\"\n" +
            "      android:id=\"@+id/textView3\"\n" +
            "      android:textSize=\"35dp\"\n" +
            "      android:layout_below=\"@+id/imageView\"\n" +
            "      android:layout_alignRight=\"@+id/textView2\"\n" +
            "      android:layout_alignEnd=\"@+id/textView2\"\n" +
            "      android:layout_alignLeft=\"@+id/imageView\"\n" +
            "      android:layout_alignStart=\"@+id/imageView\" />\n" +
            "   \n" +
            "   <Button\n" +
            "      android:layout_width=\"wrap_content\"\n" +
            "      android:layout_height=\"wrap_content\"\n" +
            "      android:text=\"New Button\"\n" +
            "      android:id=\"@+id/button\"\n" +
            "      android:layout_gravity=\"center_horizontal\"\n" +
            "      android:layout_below=\"@+id/radioGroup\"\n" +
            "      android:layout_centerHorizontal=\"true\" />\n" +
            "\n" +
            "</RelativeLayout>";
    String CheckBox = "    <RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <CheckBox  \n" +
            "            android:id=\"@+id/checkBox1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentLeft=\"true\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:text=\"Pizza\" />  \n" +
            "      \n" +
            "        <CheckBox  \n" +
            "            android:id=\"@+id/checkBox2\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_toRightOf=\"@+id/checkBox1\"  \n" +
            "            android:text=\"Coffe\" />  \n" +
            "      \n" +
            "        <CheckBox  \n" +
            "            android:id=\"@+id/checkBox3\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_toRightOf=\"@+id/checkBox2\"  \n" +
            "            android:text=\"Burger\" />  \n" +
            "      \n" +
            "        <Button  \n" +
            "            android:id=\"@+id/button1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_below=\"@+id/checkBox2\"  \n" +
            "            android:layout_marginTop=\"32dp\"  \n" +
            "            android:layout_toLeftOf=\"@+id/checkBox3\"  \n" +
            "            android:text=\"Order\" />  \n" +
            "      \n" +
            "    </RelativeLayout>  ";
    String Spinner = "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <Spinner  \n" +
            "            android:id=\"@+id/spinner1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_centerHorizontal=\"true\"  \n" +
            "            android:layout_marginTop=\"83dp\" />  \n" +
            "      \n" +
            "    </RelativeLayout>  \n" +
            "\n";
    String ArrayAdapter = "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <TextView  \n" +
            "            android:id=\"@+id/textView1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentLeft=\"true\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_marginTop=\"15dp\"  \n" +
            "            android:text=\"@string/what_is_your_favourite_programming_language_\" />  \n" +
            "      \n" +
            "        <AutoCompleteTextView  \n" +
            "            android:id=\"@+id/autoCompleteTextView1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentLeft=\"true\"  \n" +
            "            android:layout_below=\"@+id/textView1\"  \n" +
            "            android:layout_marginLeft=\"36dp\"  \n" +
            "            android:layout_marginTop=\"17dp\"  \n" +
            "            android:ems=\"10\"  \n" +
            "            android:text=\"\">  \n" +
            "      \n" +
            "            <requestFocus />  \n" +
            "        </AutoCompleteTextView>  \n" +
            "          \n" +
            "    </RelativeLayout>  ";
    String intent = "Android Implicit Intent Example\n" +
            "\n" +
            "Let's see the simple example of implicit intent that displays a web page.\n" +
            "activity_main.xml\n" +
            "\n" +
            "File: activity_main.xml\n" +
            "\n" +
            "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "        <EditText  \n" +
            "            android:id=\"@+id/editText1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_alignParentTop=\"true\"  \n" +
            "            android:layout_centerHorizontal=\"true\"  \n" +
            "            android:layout_marginTop=\"44dp\"  \n" +
            "            android:ems=\"10\" />  \n" +
            "        <Button  \n" +
            "            android:id=\"@+id/button1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:layout_below=\"@+id/editText1\"  \n" +
            "            android:layout_centerHorizontal=\"true\"  \n" +
            "            android:layout_marginTop=\"54dp\"  \n" +
            "            android:text=\"Visit\" />  \n" +
            "    </RelativeLayout>  ";
    String fragment = "ile: activity_main.xml\n" +
            "\n" +
            "    <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        android:layout_width=\"fill_parent\"  \n" +
            "        android:layout_height=\"fill_parent\" >  \n" +
            "      \n" +
            "        <fragment  \n" +
            "            android:id=\"@+id/fragment2\"  \n" +
            "            android:name=\"com.example.fragmentexample.Fragment2\"  \n" +
            "            android:layout_width=\"0px\"  \n" +
            "            android:layout_height=\"match_parent\"   \n" +
            "            android:layout_weight=\"1\"  \n" +
            "            />  \n" +
            "      \n" +
            "        <fragment  \n" +
            "            android:id=\"@+id/fragment1\"  \n" +
            "            android:name=\"com.example.fragmentexample.Fragment1\"  \n" +
            "            android:layout_width=\"0px\"  \n" +
            "            android:layout_height=\"match_parent\"  \n" +
            "            android:layout_weight=\"1\"  \n" +
            "             />  \n" +
            "      \n" +
            "    </LinearLayout>  \n" +
            "\n" +
            "File: fragment1.xml\n" +
            "\n" +
            "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
            "    <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        android:orientation=\"vertical\"  \n" +
            "        android:background=\"#00ff00\"  \n" +
            "         >  \n" +
            "      \n" +
            "        <TextView  \n" +
            "            android:id=\"@+id/textView1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:text=\"fragment frist\"  \n" +
            "            android:textAppearance=\"?android:attr/textAppearanceLarge\" />  \n" +
            "      \n" +
            "    </LinearLayout>  \n" +
            "\n" +
            "File: fragment2.xml\n" +
            "\n" +
            "    <?xml version=\"1.0\" encoding=\"utf-8\"?>  \n" +
            "    <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        android:orientation=\"vertical\"  \n" +
            "        android:background=\"#0000ff\"  \n" +
            "         >  \n" +
            "      \n" +
            "        <TextView  \n" +
            "            android:id=\"@+id/textView1\"  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:text=\"Second Fragment\"  \n" +
            "            android:textAppearance=\"?android:attr/textAppearanceLarge\" />  \n" +
            "      \n" +
            "    </LinearLayout>  ";
    String FrgamentLifecyclemethods = "";
    String ListViewFragMent = "";
    String DialogFragMent = "\n" +
            "\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:id=\"@+id/edit_name\"\n" +
            "    android:layout_width=\"wrap_content\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:layout_gravity=\"center\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/lbl_your_name\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Enter user name\" />\n" +
            "\n" +
            "    <EditText\n" +
            "        android:id=\"@+id/username\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:imeOptions=\"actionDone\"\n" +
            "        android:inputType=\"text\" />\n" +
            "</LinearLayout>\n" +
            "\n";
    String splashActiVity = "";
    String Viewpager = "activity_main.xml\n" +
            "<android.support.v4.view.ViewPager xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:id=\"@+id/pager\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\">\n" +
            "</android.support.v4.view.ViewPager>";
    String Tab = "?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<android.support.design.widget.CoordinatorLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:id=\"@+id/main_content\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:fitsSystemWindows=\"true\"\n" +
            "    tools:context=\"com.example.shukla.tutapp2.Main2Activity\">\n" +
            "\n" +
            "    <android.support.design.widget.AppBarLayout\n" +
            "        android:id=\"@+id/appbar\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:paddingTop=\"@dimen/appbar_padding_top\"\n" +
            "        android:theme=\"@style/AppTheme.AppBarOverlay\">\n" +
            "\n" +
            "        <android.support.v7.widget.Toolbar\n" +
            "            android:id=\"@+id/toolbar\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"?attr/actionBarSize\"\n" +
            "            android:background=\"?attr/colorPrimary\"\n" +
            "            app:layout_scrollFlags=\"scroll|enterAlways\"\n" +
            "            app:popupTheme=\"@style/AppTheme.PopupOverlay\">\n" +
            "\n" +
            "        </android.support.v7.widget.Toolbar>\n" +
            "\n" +
            "        <android.support.design.widget.TabLayout\n" +
            "            android:id=\"@+id/tabs\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"wrap_content\" />\n" +
            "\n" +
            "    </android.support.design.widget.AppBarLayout>\n" +
            "\n" +
            "    <android.support.v4.view.ViewPager\n" +
            "        android:id=\"@+id/container\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        app:layout_behavior=\"@string/appbar_scrolling_view_behavior\" />\n" +
            "\n" +
            "    <android.support.design.widget.FloatingActionButton\n" +
            "        android:id=\"@+id/fab\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"end|bottom\"\n" +
            "        android:layout_margin=\"@dimen/fab_margin\"\n" +
            "        app:srcCompat=\"@android:drawable/ic_dialog_email\" />\n" +
            "\n" +
            "</android.support.design.widget.CoordinatorLayout>\n";
    String BroadestReceiver = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    package=\"de.vogella.android.ownservice.local\"\n" +
            "    android:versionCode=\"1\"\n" +
            "    android:versionName=\"1.0\" >\n" +
            "\n" +
            "    <uses-sdk android:minSdkVersion=\"10\" />\n" +
            "\n" +
            "    <uses-permission android:name=\"android.permission.RECEIVE_BOOT_COMPLETED\" />\n" +
            "\n" +
            "    <application\n" +
            "        android:icon=\"@drawable/icon\"\n" +
            "        android:label=\"@string/app_name\" >\n" +
            "        <activity\n" +
            "            android:name=\".ServiceConsumerActivity\"\n" +
            "            android:label=\"@string/app_name\" >\n" +
            "            <intent-filter>\n" +
            "                <action android:name=\"android.intent.action.MAIN\" />\n" +
            "\n" +
            "                <category android:name=\"android.intent.category.LAUNCHER\" />\n" +
            "            </intent-filter>\n" +
            "        </activity>\n" +
            "\n" +
            "        <receiver android:name=\"MyScheduleReceiver\" >\n" +
            "            <intent-filter>\n" +
            "                <action android:name=\"android.intent.action.BOOT_COMPLETED\" />\n" +
            "            </intent-filter>\n" +
            "        </receiver>\n" +
            "        <receiver android:name=\"MyStartServiceReceiver\" >\n" +
            "        </receiver>\n" +
            "    </application>\n" +
            "\n";
    String Menus = "    <RelativeLayout xmlns:androclass=\"http://schemas.android.com/apk/res/android\"  \n" +
            "        xmlns:tools=\"http://schemas.android.com/tools\"  \n" +
            "        android:layout_width=\"match_parent\"  \n" +
            "        android:layout_height=\"match_parent\"  \n" +
            "        android:paddingBottom=\"@dimen/activity_vertical_margin\"  \n" +
            "        android:paddingLeft=\"@dimen/activity_horizontal_margin\"  \n" +
            "        android:paddingRight=\"@dimen/activity_horizontal_margin\"  \n" +
            "        android:paddingTop=\"@dimen/activity_vertical_margin\"  \n" +
            "        tools:context=\".MainActivity\" >  \n" +
            "      \n" +
            "        <TextView  \n" +
            "            android:layout_width=\"wrap_content\"  \n" +
            "            android:layout_height=\"wrap_content\"  \n" +
            "            android:text=\"@string/hello_world\" />  \n" +
            "      \n" +
            "    </RelativeLayout>  \n" +
            "\n" +
            "menu_main.xml\n" +
            "\n" +
            "It contains three items as show below. It is created automatically inside the res/menu directory.\n" +
            "File: menu_main.xml\n" +
            "\n" +
            "    <menu xmlns:androclass=\"http://schemas.android.com/apk/res/android\" >  \n" +
            "        <item  android:id=\"@+id/item1\"  \n" +
            "            android:title=\"Item 1\"/>  \n" +
            "        <item  android:id=\"@+id/item2\"  \n" +
            "            android:title=\"Item 2\"/>  \n" +
            "        <item  android:id=\"@+id/item3\"  \n" +
            "            android:title=\"Item 3\"/>  \n" +
            "    </menu>  ";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vv = inflater.inflate(R.layout.activity_fragb, container, false);
        TextView tt = (TextView) vv.findViewById(R.id.tv2);
        tt.setText(event_handling);
        Intent i = getActivity().getIntent();
        Bundle b = i.getExtras();
        if (b != null) {
            int j = (Integer) b.get("key");
            switch (j) {
                case 0: tt.setText(history1);
                  break;
                  case 1: tt.setText(lifecycle);
                    break;
                case 2:
                    tt.setText(orientation);
                    break;
                case 3:
                    tt.setText(event_handling);
                    break;
                 case 4: tt.setText(toast_class);
                  break;

                case 5:
                    tt.setText(layout_inflator);
                    break;
                case 6:
                    tt.setText(viewgroup);
                    break;

                case 7:
                    tt.setText(dialog_box);
                    break;
                case 8:
                    tt.setText(AutoCompletetextView);
                    break;
                case 9:
                    tt.setText(ToggleButton);
                    break;
                case 10:
                    tt.setText(RadioGroup);
                    break;
                case 11:
                    tt.setText(CheckBox);
                    break;
                case 12:
                    tt.setText(Spinner);
                    break;
                case 13:
                    tt.setText(ArrayAdapter);
                    break;
                case 14:
                    tt.setText(intent);
                    break;
                case 15:
                    tt.setText(fragment);
                    break;
                case 16:
                    tt.setText(Viewpager);
                    break;
                case 17:
                    tt.setText(Tab);
                    break;
                case 18:
                    tt.setText(BroadestReceiver);
                    break;
                case 19:
                    tt.setText(Menus);
                    break;


            }



        }
        return vv;
    }
}

