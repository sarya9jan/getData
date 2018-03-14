package com.falgee.getdata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {

    private EditText mAddressEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mAddressEt = (EditText) findViewById(R.id.address_et);
    }

    public void setData(View view) {
        Intent intent = new Intent();
        intent.putExtra("myaddress", mAddressEt.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
