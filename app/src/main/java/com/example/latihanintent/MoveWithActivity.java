package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MoveWithActivity extends AppCompatActivity {
    private TextView textView;
    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with);
        textView = findViewById(R.id.btn_Pindah_Activity_Dengan_Objek);

        TextView tvDataReceived = findViewById(R.id.tv_data_recevied);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE,0);

        String text ="Name :"+name+",nYour Age:"+ age;
       tvDataReceived.setText(text);
    }
}
