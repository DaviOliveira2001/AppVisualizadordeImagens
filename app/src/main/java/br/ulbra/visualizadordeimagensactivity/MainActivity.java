package br.ulbra.visualizadordeimagensactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    ImageView imgfoto;
    Button btnFoto1, btnFoto2;
    TextView txtinformacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgfoto = (ImageView)findViewById(R.id.imgFoto);
        btnFoto1 = (Button) findViewById(R.id.btnFoto1);
        btnFoto2 = (Button) findViewById(R.id.btnFoto2);
        txtinformacao = (TextView) findViewById(R.id.txtInformacao);

        btnFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgfoto.setImageResource(R.drawable.img1);
                txtinformacao.setText("Foto 1");
            }
        });
        btnFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgfoto.setImageResource(R.drawable.img2);
                txtinformacao.setText("Foto 2");
            }
        });
    }
}