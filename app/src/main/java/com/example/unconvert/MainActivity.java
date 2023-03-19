package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        edittext=findViewById(R.id.edittext);
        button.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Hi It Worked!", Toast.LENGTH_SHORT).show();
            String s=edittext.getText().toString();
            int kg=Integer.parseInt(s);
            int g=1000*kg;
            textView.setText("The corresponging value in gram is "+g+ "grams");
        });
    }
}
