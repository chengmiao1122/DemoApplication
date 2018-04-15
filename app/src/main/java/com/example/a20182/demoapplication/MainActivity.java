package com.example.a20182.demoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView tvName;
    private SessionManager session;

    private ListView mListView;
    private DemoAdapter mAdapter;
    private static List<Demo> mDemos;
    public static List<Demo> mDemoList = new ArrayList<Demo>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.user_name);

        /**
         * Only logged in users should access this activity
         */
        session = new SessionManager(getApplicationContext());
        if (!session.isLoggedIn()) {
            //logout();
        }

        /**
         * If the user just registered an account from Register.class,
         * the parcelable should be retrieved
         */
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            // Retrieve the parcelable
            Feedback feedback = bundle.getParcelable("feedback");
            // Get the from the object
            String userName = feedback.getName();
            tvName.setText(userName);
        }


        mDemoList.add(new Demo("Lifecycle"));
        mDemoList.add(new Demo("UserName"));
        mDemoList.add(new Demo("UserName_Final"));
        mDemoList.add(new Demo("Layout"));
        mDemoList.add(new Demo("Layout_Final"));
        mDemoList.add(new Demo("Button_Design"));
        mDemoList.add(new Demo("Button_Toast"));
        mDemoList.add(new Demo("Button_Intent"));
        mDemoList.add(new Demo("Button_StartActivity"));
        mDemoList.add(new Demo("Button_StartActivity_extra"));
        mDemoList.add(new Demo("ImageButton"));
        mDemoList.add(new Demo("EditText"));
        mDemoList.add(new Demo("RadioButtons_listener"));
        mDemoList.add(new Demo("RadioButtons_onclick"));
        mDemoList.add(new Demo("listView"));
        mDemoList.add(new Demo("GetColor"));
        mDemoList.add(new Demo("GradientBackground"));
        //mDemoList.add(new Demo("ImplicitIntent"));
        mDemoList.add(new Demo("AppIntentCaller"));
        mDemoList.add(new Demo("AppIntentReceiver"));
        mDemoList.add(new Demo("Weather_App_Design"));
        mDemoList.add(new Demo("ListView"));
        mDemoList.add(new Demo("ListViewCustomAdapter"));
        mDemoList.add(new Demo("AudioRecorder"));
        mDemoList.add(new Demo("DataBase"));
        mDemoList.add(new Demo("FragmentOne"));
        mDemoList.add(new Demo("Webview"));
        mDemoList.add(new Demo("ServiceDemo"));
        mDemoList.add(new Demo("Service"));
        mDemoList.add(new Demo("Fingerprint"));
        mDemoList.add(new Demo("AppPrivateDirectory"));
        mDemoList.add(new Demo("AssetsFolder"));
        mDemoList.add(new Demo("IntentExtras"));




        mListView = findViewById(R.id.lv_demo);
        mAdapter = new DemoAdapter(this, mDemoList);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getApplicationContext(), MainActivity_00.class));
                        break;
                    case 1:
                        startActivity(new Intent(getApplicationContext(), MainActivity_01.class));
                        break;
                    case 2:
                        startActivity(new Intent(getApplicationContext(), MainActivity_02.class));
                        break;
                    case 3:
                        startActivity(new Intent(getApplicationContext(), MainActivity_03.class));
                        break;
                    case 4:
                        startActivity(new Intent(getApplicationContext(), MainActivity_04.class));
                        break;
                    case 5:
                        startActivity(new Intent(getApplicationContext(), MainActivity_05.class));
                        break;
                    case 6:
                        startActivity(new Intent(getApplicationContext(), MainActivity_06.class));
                        break;
                    case 7:
                        startActivity(new Intent(getApplicationContext(), MainActivity_07.class));
                        break;
                    case 8:
                        startActivity(new Intent(getApplicationContext(), MainActivity_08.class));
                        break;
                    case 9:
                        startActivity(new Intent(getApplicationContext(), MainActivity_09.class));
                        break;
                    case 10:
                        startActivity(new Intent(getApplicationContext(), MainActivity_10.class));
                        break;
                    case 11:
                        startActivity(new Intent(getApplicationContext(), MainActivity_11.class));
                        break;
                    case 12:
                        startActivity(new Intent(getApplicationContext(), MainActivity_12.class));
                        break;
                    case 13:
                        startActivity(new Intent(getApplicationContext(), MainActivity_13.class));
                        break;
                    case 14:
                        startActivity(new Intent(getApplicationContext(), MainActivity_14.class));
                        break;
                    case 15:
                        startActivity(new Intent(getApplicationContext(), MainActivity_15.class));
                        break;
                    case 16:
                        startActivity(new Intent(getApplicationContext(), MainActivity_16.class));
                        break;
                    case 17:
                        startActivity(new Intent(getApplicationContext(), MainActivity_17.class));
                        break;
                    case 18:
                        startActivity(new Intent(getApplicationContext(), MainActivity_18.class));
                        break;
                    case 19:
                        startActivity(new Intent(getApplicationContext(), MainActivity_19.class));
                        break;
                    case 20:
                        startActivity(new Intent(getApplicationContext(), MainActivity_20.class));
                        break;
                    case 21:
                        startActivity(new Intent(getApplicationContext(), MainActivity_21.class));
                        break;
                    case 22:
                        startActivity(new Intent(getApplicationContext(), MainActivity_22.class));
                        break;
                    case 23:
                        startActivity(new Intent(getApplicationContext(), MainActivity_23.class));
                        break;
                    case 24:
                        startActivity(new Intent(getApplicationContext(), MainActivity_24.class));
                        break;
                    case 25:
                        startActivity(new Intent(getApplicationContext(), MainActivity_25.class));
                        break;
                    case 26:
                        startActivity(new Intent(getApplicationContext(), MainActivity_26.class));
                        break;
                    case 27:
                        startActivity(new Intent(getApplicationContext(), MainActivity_27.class));
                        break;
                    case 28:
                        startActivity(new Intent(getApplicationContext(), MainActivity_28.class));
                        break;
                    case 29:
                        startActivity(new Intent(getApplicationContext(), MainActivity_29.class));
                        break;
                    case 30:
                        startActivity(new Intent(getApplicationContext(), MainActivity_30.class));
                        break;
                    case 31:
                        startActivity(new Intent(getApplicationContext(), MainActivity_31.class));
                        break;

                }
            }
        });

    }

    /**
     * Logging out the user:
     * - Will set isLoggedIn flag to false in SharedPreferences
     * - Clears the user data from SqLite users table
     */

    public void btnLogout(View view) {
        logout();
    }

    public void logout() {
        // Updating the session
        session.setLogin(false);
        // Redirect the user to the login activity
        startActivity(new Intent(this, Login.class));
        finish();
    }



}