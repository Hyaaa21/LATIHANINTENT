package com.example.latihanintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
import android.widget.TextView;

import java.net.URI;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        Button btnPindahActivityDenganObjek = findViewById(R.id.btn_Pindah_Activity_Dengan_Objek);
        btnPindahActivityDenganObjek.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_Dial_Number);
        btnDialPhone.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, Main2Activity.class);
                moveWithDataIntent.putExtra(Main2Activity.EXTRA_NAME, "DicodingAcademy Boy");
                moveWithDataIntent.putExtra(Main2Activity.EXTRA_AGE, 5);
                startActivity(moveWithDataIntent);
                break;

            case R.id.btn_Dial_Number:
                String phoneNumber = "081210841382";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_Pindah_Activity_Dengan_Objek:
                Intent moveActivityTerimaObjek = new Intent(MainActivity.this, MoveWithDataObject.class);
                startActivity(moveActivityTerimaObjek);
                Mybiodata SatriaAmruDito = new Mybiodata("DITO", 15);
                moveActivityTerimaObjek.putExtra("biodata",SatriaAmruDito);
                startActivity(moveActivityTerimaObjek);
        }
    }
}
