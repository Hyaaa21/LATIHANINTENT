package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataObject extends AppCompatActivity {

    private  TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data_object);
        textView = findViewById(R.id.btn_Pindah_Activity_Dengan_Objek);
        Mybiodata biodata =getIntent().getParcelableExtra("biodata");
        textView.setText("Nama saya "+biodata.getName()+ "Umur Saya"+biodata.getUmur());
        textView.setText("Nama saya "+biodata.getName()+ "Umur Saya"+biodata.getUmur());
    }
}
