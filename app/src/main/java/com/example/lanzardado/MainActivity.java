package com.example.lanzardado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView textViewResultado;
    ImageView imagenView;
    Button btnLanzar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents(){
        textViewResultado = findViewById(R.id.textViewResultado);
        imagenView = findViewById(R.id.imagenView);
        btnLanzar = findViewById(R.id.btnLanzar);

        btnLanzar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Random random = new Random();
        int VALOR = random.nextInt(7-1) +1;

        switch (VALOR){
            case 1:
                imagenView.setImageDrawable(null);
                textViewResultado.setText(String.valueOf(VALOR));
                imagenView.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                imagenView.setImageDrawable(null);
                textViewResultado.setText(String.valueOf(VALOR));
                imagenView.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                imagenView.setImageDrawable(null);
                textViewResultado.setText(String.valueOf(VALOR));
                imagenView.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                imagenView.setImageDrawable(null);
                textViewResultado.setText(String.valueOf(VALOR));
                imagenView.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                imagenView.setImageDrawable(null);
                textViewResultado.setText(String.valueOf(VALOR));
                imagenView.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                imagenView.setImageDrawable(null);
                textViewResultado.setText(String.valueOf(VALOR));
                imagenView.setImageResource(R.drawable.dice_6);
                break;
            default:
                System.out.println("Definido");
        }
    }
}