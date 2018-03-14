package com.falgee.getdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goNext(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivityForResult(intent, 80); // request code be any integer
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 80) { // to check whether the data is coming from 2nd activity
            if (resultCode == RESULT_OK) { // to check whether data is successful or not
                String address = data.getStringExtra("myaddress");
                Toast.makeText(this, address, Toast.LENGTH_SHORT).show();
            }
        }

        if(requestCode == 90) {
            if(resultCode == RESULT_OK) {
                String name = data.getStringExtra("myname");
                Toast.makeText(this, "name is " + name, Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void gothird(View view) {
        Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
        startActivityForResult(intent, 90);
    }
}
