package com.example.miniproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EncryptActivity extends AppCompatActivity {

    EditText txtencryption;
    Button encbtn;
    ClipboardManager clipboard;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);

        txtencryption=(EditText) findViewById(R.id.txtenc);
        encbtn=(Button)findViewById(R.id.btnenc);

        // Gets a handle to the clipboard service for copy text
        clipboard=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

        //Called when the user touches the button
        encbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });
    }

}