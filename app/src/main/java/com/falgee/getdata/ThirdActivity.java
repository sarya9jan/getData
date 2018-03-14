package com.falgee.getdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends Activity {

    private EditText mNameEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mNameEt = (EditText) findViewById(R.id.name_et);
    }

    public void setName(View view) {
        Intent intent = new Intent();
        intent.putExtra("myname" ,mNameEt.getText().toString());
        setResult(RESULT_OK,intent);
    }
}
