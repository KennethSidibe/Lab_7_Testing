package com.example.lab_7_testing;

import static org.junit.Assert.*;

import android.widget.TextView;

import androidx.annotation.UiThread;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);
    private TextView text_Username;
    private TextView text_Password;
    private  TextView text_LastName;


    @Test
    @UiThread
    public void CheckFirstName() throws Exception{

        activityScenarioRule.getScenario().onActivity(mainActivity ->{

            assertNotNull(mainActivity.findViewById(R.id.textView1));
            text_Username = mainActivity.findViewById(R.id.username);
            text_Password = mainActivity.findViewById(R.id.password);
            text_LastName = mainActivity.findViewById(R.id.Lastname);
            text_Username.setText("user1");
            text_LastName.setText("Smith");
            text_Password.setText("Smith240286");
            String username = text_Username.getText().toString();
            String lastname = text_LastName.getText().toString();
            String password = text_Password.getText().toString();
            assertNotEquals("user", username);
            assertEquals("Smith", lastname);
            assertEquals("Smith240286", password);


        });

    }
}