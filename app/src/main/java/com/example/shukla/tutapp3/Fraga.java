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
import android.widget.Toast;


public class Fraga extends Fragment {

    String history1 = "(1)android is a opensource and linux based opearting system owned by google" + "\n \n" +
            "(2)Initially, Andy Rubin founded Android Incorporation in Palo Alto, California, United States" +
            " in October, 2003." + "\n \n" + "(3)In 17th August 2005, Google acquired android Incorporation"
            + "\n \n" + "(4)The code names of android ranges from A to J currently, such as Aestro(1.0), " +
            "Blender(1.2), Cupcake(1.5), Donut(1.6), Eclair(2.1), Froyo(2.2), Gingerbread(2.3), " +
            "Honeycomb(3.1-3.3), Ice Cream Sandwitch(4.0), Jelly Bean(4.1-4.3), KitKat(4.4) and Lollipop(5.0)" +
            ",marshmallow(6.0) and now nought(7.0)." + "Android programming is based on Java programming " +
            "language so if you have basic understanding on Java programming then it will be a fun to learn Android application development." + "\n";
    String lifecycle = "Android Activity Lifecycle is controlled by 7 methods of android.app.Activity class.\\n\n" +
            "\n" +
            "An activity is the single screen in android. It is like window or frame of Java.\\n\n" +
            "\n" +
            "By the help of activity, you can place all your UI components or widgets in a single screen.\\n\n" +
            "\n" +
            "The 7 lifecycle method of Activity describes how activity will behave at different states\\n\\n\n" +
            "onCreate() :- \tcalled when activity is first created.\\n\n" +
            "onStart():-\t  called when activity is becoming visible to the user.\\n\n" +
            "onResume():-\t  called when activity will start interacting with the user.\\n\n" +
            "onPause():-\t  called when activity is not visible to the user.\\n\n" +
            "onStop():-\t  called when activity is no longer visible to the user.\\n\n" +
            "onRestart():-\t  called after your activity is stopped, prior to start.\\n\n" +
            "onDestroy():-\t  called before the activity is destroyed.\\n\"\n";
    String orientation = "The screenOrientation is the attribute of activity element.\\n\\n The orientation of android activity can be portrait, landscape, sensor, unspecified etc.\\n\\n\n" +
            "                  The common values for screenOrientation attribute are as follows:\n" +
            "Value\t     Description\n" +
            "unspecified:-\t         It is the default value. In such case, system chooses the orientation.\\n\\n\n" +
            "portrait:-\t         taller not wider\\n\\n\n" +
            "landscape:-\t          wider not taller\\n\\n\n" +
            "sensor:-             \torientation is determined by the device orientation sensor.\n\n";
    String event_handling = "\n " +
            "there are 2 types of event handling in android one is by xml and another is by java.\\n if we want to perform action at compile time then we use xml method and we want to perform action at run time then use onclickListner.\\n\n" +
            "                 When the user clicks a button, the Button object receives an onclick event.\\n \n" +
            "To define the click event handler for a button, add the android:onClick attribute to the <Button> element in your XML layout. The value for this attribute must be the name of the method you want to call in response to a click event. The Activity hosting the layout must then implement the corresponding method.\\n\\n\n" +
            "For example, here's a layout with a button using android:onClick:\n" +
            "\n" +
            "in xml:-\n" +
            "\n" +
            "        android:onClick=fun()\n" +
            "in java:-\n" +
            "\n" +
            "    public void fun(View view) {\n" +
            "    // Do something in response to button click\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "      Using an OnClickListener:-\\n\n" +
            "\n" +
            "You can also declare the click event handler programmatically rather than in an XML layout. This might be necessary if you instantiate the Button at runtime or you need to declare the click behavior in a Fragment subclass.\n" +
            "\n" +
            "To declare the event handler programmatically, create an View.OnClickListener object and assign it to the button by calling setOnClickListener(View.OnClickListener).\\n For example:\n" +
            "\n" +
            "Button button = (Button) findViewById(R.id.button_send);\n" +
            "button.setOnClickListener(new View.OnClickListener() {\n" +
            "    public void onClick(View v) {\n" +
            "        // Do something in response to button click\n" +
            "    }";
    String toast_class = "it is a view to broadcast any message on any specefic event.\\n\\n\n" +
            "             it uses a static method makeText()with 3 parameters first one is context second one is message and third one is duration.\\n\\n\n" +
            "               context is a abstract class which is used to convey the message in different classes\\n\\n\n" +
            "                 Toast class is independent upon Activity\\n\\n\n" +
            "                 syntax:-  Toast.makeText(this,message,Toast.LENGTH_LONG or SHORT()).show()";
    String layout_inflator = "it converts the whole xml file into java object so that we use at run time\\n  FindViewById id also used\n" +
            "             for conversion of xml into java \\n but findViewByid converts the specific view like button,textview or editText into java object while LayoutInflator converts the layout File(xml) into java object\n" +
            "           \\n syntax:\\n\n" +
            "           LayoutInflator l=getLayoutInflator();\\n\n" +
            "           we use getSystemService() in place of getLayoutInflator()at Application level.\\n\n" +
            "             View v=l.inflate(R.id.My_layout,null)";

    String viewgroup = "view is the parent class of all views like Button,Textview,EditText .\\n\n" +
            "                 viewGroup(Layout's) is a object which is responsible for arranging the components(views) in different manner.\n" +
            "                      View group are of different types which are giving as follows\\n\n" +
            "                       (1)Linear Layout\n" +
            "                        (2)Relative Layout\n" +
            "                         (3)Table Layout\n" +
            "                          (4)Grid Layout\n" +
            "                           (5)Frame Layout\n" +
            "                           (6)Constraint Layout\\n\n" +
            "        (1)Linear layout:-     it is a basic layout which arrange the different componentseither in vertical form or in horizontal form\\n\n" +
            "                                by default it is horizontal. Layout_weight helps to provide the space in the form of percentage\n" +
            "                                 android:layout_weight='4'.\\n\n" +
            "        (2)Relative Layout;-  it is basic layout which arrange the views with respect to its parents or its neighbours\n" +
            "                                  relative layout in java:-\n" +
            "                                   (1) create object of relative layout\n" +
            "                                   (2)Layout Params\n" +
            "                                   (3) setting LayoutParam\n" +
            "                                   (4)Additional Property\n" +
            "                                   (5)Add View\n" +
            "                                  (6)SetContentView()\\n\n" +
            "        (3)Table Layout:-    it arrange the views in the tabuler form(in the form of row and columns)\n" +
            "                              -> Table Layout is by default match parent as width and wrap content as height\n" +
            "                               -> we can add UI com ponents with the help of TABLEROW\n" +
            "                               -> in this we don't need to provide no. of columns as it automatic calculated on the behalf of no. of views\n" +
            "                                ->we use strech ,shrink ,collapse columns for streching and shrinking ems provide space between views.\\n\n" +
            "        (4)GridLayout:-   it is layout which arrange the views in the tabular form.it is similer to table layout but ";
    String dialog_box = "it is a window which is used to show some message or information or any specific action\\n\n" +
            "         (1)AlertDialog Box:-\n" +
            "                 AlertDialog ab=new AlertDialogBuilder(this);\n" +
            "                            ab.show();\n" +
            "           (2)Date Picker:-    we use calender class\n" +
            "              Calender c=Calender.getInstance();\n" +
            "              int date=c.get(DATE_OF_MONTH);\n" +
            "              int month=c.get(MONTH);\n" +
            "              int year=c.get(YEAR);\n" +
            "\n" +
            "              DatepickerDialog dp=new DatepickerDialog(context,ondateSetlistner,yy,mm,dd);\n" +
            "\n" +
            "           (3)Time picker:-\n" +
            "\n" +
            "           TimePickerdialog tp=  new TimePickerdialog(context,OnTimesetListener,hh,mm,24hours);\n" +
            "\n";
    String AutoCompletetextView = "AutoCompleteTextView completes the word based on the reserved words, so no need to write all the characters of the word.\\n\n" +
            " AutoCompleteTextView is a editable text field, it displays a list of suggestions in a drop down menu from which user can select only one suggestion or value.\\n\n" +
            " AutoCompleteTextView is the subclass of EditText class. The MultiAutoCompleteTextView is the subclass of AutoCompleteTextView class.\\n\n" +
            " we use ArrayAdapter for implementing it\\n\n" +
            "   ArrayAdapter<String>adp=new  ArrayAdapter(context,int res id,arr)";
    String ToggleButton = "Android Toggle Button can be used to display checked/unchecked (On/Off) state on the button.\\n\n" +
            "It is beneficial if user have to change the setting between two states. It can be used to On/Off Sound, Wifi, Bluetooth etc.\\n\n" +
            "Since Android 4.0, there is another type of toggle button called switch that provides slider control.\\n\n" +
            "Android ToggleButton and Switch both are the subclasses of CompoundButton class.\\n\n" +
            " XML                      Attribute\tDescription\n" +
            "\n" +
            "android:textOff  \t   The text for the button when it is not checked.\n" +
            "android:textOn\t       The text for the button when it is checked.\\n\n" +
            " void setChecked(boolean checked)\t      Changes the checked state of this button.\\n\n" +
            "\n" +
            " ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton);\n" +
            "toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {\n" +
            "    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {\n" +
            "        if (isChecked) {\n" +
            "            // The toggle is enabled\n" +
            "        } else {\n" +
            "            // The toggle is disabled\n" +
            "        }";
    String RadioGroup = "Radio buttons allow the user to select one option from a set. You should use radio buttons for optional sets that are mutually exclusive if you think that the user needs to see all available options side-by-side. If it's not necessary to show all options side-by-side, use a spinner instead.\\n\n" +
            "                 To create each radio button option, create a RadioButton in your layout. However, because radio buttons are mutually exclusive, you must group them together inside a RadioGroup. By grouping them together, the system ensures that only one radio button can be selected at a time.\\n\n" +
            "public void onRadioButtonClicked(View view) {\n" +
            "    // Is the button now checked?\n" +
            "    boolean checked = ((RadioButton) view).isChecked();\n" +
            "\n" +
            "    // Check which radio button was clicked\n" +
            "    switch(view.getId()) {\n" +
            "        case R.id.radio_pirates:\n" +
            "            if (checked)\n" +
            "                // Pirates are the best\n" +
            "            break;\n" +
            "        case R.id.radio_ninjas:\n" +
            "            if (checked)\n" +
            "                // Ninjas rule\n" +
            "            break;";
    String CheckBox = "Android CheckBox is a type of two state button either checked or unchecked.\n" +
            "\n" +
            "There can be a lot of usage of checkboxes. For example, it can be used to know the hobby of the user, activate/deactivate the specific action etc.\n" +
            "\n" +
            "Android CheckBox class is the subclass of CompoundButton class.\\n\n" +
            "   Method\t                                           Description\n" +
            "public boolean isChecked()\t  :-                   Returns true if it is checked otherwise false.\n" +
            "public void setChecked(boolean status)  :-         \tChanges the state of the CheckBox.";
    String Spinner = "Android Spinner is like the combox box of AWT or Swing. It can be used to display the multiple options to the user in which only one item can be selected by the user.\n" +
            "\n" +
            "Android spinner is like the drop down menu with multiple values from which the end user can select only one value.\\n\n" +
            "\n" +
            "   String arr[]={ram,sita,laxman};\n" +
            "Spinner spinner = (Spinner)findViewById(R.id.spinner);\\n\n" +
            "// Create an ArrayAdapter using the string array and a default spinner layout\\n\n" +
            "ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, android.R.layout.simple_spinner_item,arr);\\n\n" +
            "// Apply the adapter to the spinner \\n\"/>";
    String ArrayAdapter = "it takes data from data source and pass into adapter views(listview,gridView,Spinner).it is like an medium to pasing the data.\\n\n" +
            "        o use a basic ArrayAdapter, you just need to initialize the adapter and attach the adapter to the ListView. First, we initialize the adapter:\n" +
            "\n" +
            "ArrayAdapter String itemsAdapter =\n" +
            "    new ArrayAdapter String (this, android.R.layout.simple_list_item_1, items);\n" +
            "\n" +
            "The ArrayAdapter requires a declaration of the type of the item to be converted to a View (a String in this case) and then accepts three arguments: context (activity instance), XML item layout, and the array of data. Note that we've chosen simple_list_item_1.xml which is a simple TextView as the layout for each of the items.\n" +
            "Now, we just need to connect this adapter to a ListView to be populated:\n" +
            "\n" +
            "ListView listView = (ListView) findViewById(R.id.lvItems);\n" +
            "listView.setAdapter(itemsAdapter)";
    String intent = "it is like a messenger which carries some message and help us to move from one component to other component(Activity,service,broadcast Receiver)\\n\n" +
            "            types of intent:-\\n\n" +
            "         (1)Explicit intent (2)Implicit intent\\n\n" +
            "      (1)Explicit intent:-\n" +
            "                           it is that in which we know the destination\n" +
            "     Intent i=new Intent(source class,destination.class);\\n\n" +
            "            startActivity(i)\\n\n" +
            "       2)Implicit intent:-\n" +
            "                             it is that in which we do not know the destination\\n\n" +
            "(1)Action:-      it defines what Action to be performed.\n" +
            "          eg. ACTION_SEND,ACTION_CALL\n" +
            "(2)data :-        it defines on which data this action to be performed\n" +
            "(3)extra:-         it is used for some extra element\n" +
            " (4)flag:-          it is a constant value.\n" +
            "   (5)category:-     it defines the categorization between diffrent element\\n\n" +
            "             Intent i=new intent(ACTION)\"";
    String fragment = "it is an chunk part of an activity which is used for achieving pannel based designing to achieve reusability og GUI as well as show effective GUI\\n\n" +
            "                -> added after honeyComb 11\n" +
            "                 -> always associated with activity\n" +
            "                -> more than one fragment\n" +
            "                -> it's own layout and behaviour\n" +
            "                 -> own lifecycle\n" +
            "                 -> combine multiple fragment into single activity\n" +
            "  there are 2 types of frgamnet\n" +
            "(1)android.app.fragment\n" +
            "(2)android.support.v4.frgament\\n\n" +
            "how to create Frgament:-\n" +
            "\n" +
            "->create java class extends by fragment class\n" +
            "-> provide appearance in xml/java\n" +
            "-> override oncreateview()to link appearance\n" +
            "-> use fragment in xml/java\\n\"";
    String FrgamentLifecyclemethods = "Below are the methods of fragment lifecycle.\n" +
            "\n" +
            "    onAttach() :This method will be called first, even before onCreate(), letting us know that your fragment has been attached to an activity. You are passed the Activity that will host your fragment\n" +
            "    onCreateView() : The system calls this callback when it’s time for the fragment to draw its UI for the first time. To draw a UI for the fragment, a View component must be returned from this method which is the root of the fragment’s layout. We can return null if the fragment does not provide a UI\n" +
            "    onViewCreated() : This will be called after onCreateView(). This is particularly useful when inheriting the onCreateView() implementation but we need to configure the resulting views, such as with a ListFragment and when to set up an adapter\n" +
            "    onActivityCreated() :This will be called after onCreate() and onCreateView(), to indicate that the activity’s onCreate() has completed. If there is something that’s needed to be initialised in the fragment that depends upon the activity’s onCreate() having completed its work then onActivityCreated() can be used for that initialisation work\n" +
            "    onStart() : The onStart() method is called once the fragment gets visible\n" +
            "    onPause() : The system calls this method as the first indication that the user is leaving the fragment. This is usually where you should commit any changes that should be persisted beyond the current user session\n" +
            "    onStop() : Fragment going to be stopped by calling onStop()\n" +
            "    onDestroyView() : It’s called before onDestroy(). This is the counterpart to onCreateView() where we set up the UI. If there are things that are needed to be cleaned up specific to the UI, then that logic can be put up in onDestroyView()\n" +
            "    onDestroy() : onDestroy() called to do final clean up of the fragment’s state but Not guaranteed to be called by the Android platform.\n" +
            "    onDetach() : It’s called after onDestroy(), to notify that the fragment has been disassociated from its hosting activity";
    String ListViewFragMent = "\n" +
            "\n" +
            "    Create a class MyListFragment and extend it to ListFragment.\n" +
            "\n" +
            "    Inside the onCreateView() method , inflate the view with above defined list_fragment xml layout.\n" +
            "\n" +
            "    Inside the onActivityCreated() method , create a arrayadapter from resource ie using String array R.array.planet which you can find inside the string.xml and set this adapter to listview and also set the onItem click Listener.\n" +
            "\n" +
            "    Inside the OnItemClickListener() method , display a toast message with Item name which is being clicked.\n";
    String DialogFragMent = "\n" +
            "\n" +
            "A DialogFragment is a fragment that displays a modal window, floating on top of the current activity window. An instance of DialogFragment can be used to display an existing Dialog implementation dialog or a custom view hierarchy.\n" +
            "\n" +
            "The Dialog class is the base class for implementing a dialog. Android provides several standard dialog implementation, AlertDialog, ProgressDialog, DatePickerDialog or TimePickerDialog. Your DialogFragment can implement the onCreateDialog method and return such a dialog implementation";
    String splashActiVity = "Android splash screen are normally used to show user some kind of progress before the app loads completely. Some people uses splash screen just to show case their app / company logo for a couple of second. Unfortunately in android we don’t have any inbuilt mechanism to show splash screen compared to iOS. In this tutorial we are going to learn how to implement splash screen in your android application.";
    String Viewpager = "ViewPager is most often used in conjunction with Fragment, which is a convenient way to supply and manage the lifecycle of each page. There are standard adapters implemented for using fragments with the ViewPager, which cover the most common use cases. These are FragmentPagerAdapter and FragmentStatePagerAdapter; each of these classes have simple code showing how to build a full user interface with them.\n" +
            "\n" +
            "Views which are annotated with the ViewPager.DecorView annotation are treated as part of the view pagers 'decor'. Each decor view's position can be controlled via its android:layout_gravity attribute";
    String Tab = "My previous article explains about Android Tab Layout and it got very good ranking in search engines. But unfortunately TabHost is deprecated by android in favor of fragments. So it is suggested that use fragment to achieve tab layout.\n" +
            "\n" +
            "This article shows you how to create tab layout using fragments and viewpager. Also you can swipe between tab view as it is the functionality of viewpager which is not possible when using TabHost.";
    String BroadestReceiver = "\n" +
            "\n" +
            "A broadcast receiver (receiver) is an Android component which allows you to register for system or application events. All registered receivers for an event are notified by the Android runtime once this event happens.\n" +
            "\n" +
            "For example, applications can register for the ACTION_BOOT_COMPLETED system event which is fired once the Android system has completed the boot process.\n" +
            "1.2. Implementation\n" +
            "\n" +
            "A receiver can be registered via the AndroidManifest.xml file.\n" +
            "\n" +
            "Alternatively to this static registration, you can also register a receiver dynamically via the Context.registerReceiver() method.\n" +
            "\n" +
            "The implementing class for a receiver extends the BroadcastReceiver class.\n" +
            "\n" +
            "If the event for which the broadcast receiver has registered happens, the onReceive() method of the receiver is called by the Android system.\n" +
            "1.3. Life cycle of a broadcast receiver";
    String Menus = "Menus are a common user interface component in many types of applications. To provide a familiar and consistent user experience, you should use the Menu APIs to present user actions and other options in your activities.\n" +
            "\n" +
            "Beginning with Android 3.0 (API level 11), Android-powered devices are no longer required to provide a dedicated Menu button. With this change, Android apps should migrate away from a dependence on the traditional 6-item menu panel and instead provide an app bar to present common user actions.\n" +
            "\n" +
            "Although the design and user experience for some menu items have changed, the semantics to define a set of actions and options is still based on the Menu APIs. This guide shows how to create the three fundamental types of menus or action presentations on all versions of Android:\n" +
            "\n" +
            "Options menu and app bar\n" +
            "    The options menu is the primary collection of menu items for an activity. It's where you should place actions that have a global impact on the app, such as \"Search,\" \"Compose email,\" and \"Settings.\"\n" +
            "\n" +
            "    See the section about Creating an Options Menu.\n" +
            "Context menu and contextual action mode\n" +
            "    A context menu is a floating menu that appears when the user performs a long-click on an element. It provides actions that affect the selected content or context frame.\n" +
            "\n" +
            "    The contextual action mode displays action items that affect the selected content in a bar at the top of the screen and allows the user to select multiple items.\n" +
            "\n" +
            "    See the section about Creating Contextual Menus.\n" +
            "Popup menu\n" +
            "    A popup menu displays a list of items in a vertical list that's anchored to the view that invoked the menu. It's good for providing an overflow of actions that relate to specific content or to provide options for a second part of a command. Actions in a popup menu should not directly affect the corresponding content—that's what contextual actions are for. Rather, the popup menu is for extended actions that relate to regions of content in your activity.";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vvv = inflater.inflate(R.layout.activity_fraga, container, false);
        TextView ttt = (TextView) vvv.findViewById(R.id.tv3);
        Intent i = getActivity().getIntent();
        Bundle b = i.getExtras();
        if (b != null) {
            int j = (Integer) b.get("key");
            switch (j) {
                case 0: ttt.setText(history1);
                    break;
                case 1: ttt.setText(lifecycle);
                    break;
                case 2: ttt.setText(orientation);
                    break;
                case 3: ttt.setText(event_handling);
                    break;
                case 4: ttt.setText(toast_class);
                    break;

                case 5: ttt.setText(layout_inflator);
                    break;
                case 6: ttt.setText(viewgroup);
                    break;

                case 7: ttt.setText(dialog_box);
                    break;
                case 8: ttt.setText(AutoCompletetextView);
                    break;
                case 9: ttt.setText(ToggleButton);
                    break;
                case 10: ttt.setText(RadioGroup);
                break;
                case 11: ttt.setText(CheckBox);
                break;
                case 12: ttt.setText(Spinner);
                    break;
                case 13: ttt.setText(ArrayAdapter);
                    break;
                case 14: ttt.setText(intent);
                    break;
                case 15: ttt.setText(fragment);
                    break;
                case 16: ttt.setText(Viewpager);
                    break;
                case 17: ttt.setText(Tab);
                    break;
                case 18: ttt.setText(BroadestReceiver);
                    break;
                case 19: ttt.setText(Menus);
                    break;



            }
        }
        return vvv;
    }
}

