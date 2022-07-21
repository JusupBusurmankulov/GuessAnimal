package com.example.kotlin11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView animalImage;
    boolean isCat,isDog,isGiraffe;
    Button btnResult;
    String animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalImage = findViewById(R.id.iv_animal);
        btnResult = findViewById(R.id.btn_result);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("key", animal);
//                intent.putExtra("key1", "Cat!");
//                intent.putExtra("key2", "Giraffe!");
                startActivity(intent);


            }
        });
    }

    public void changeImage (View view){
        switch (view.getId()){
            case R.id.btn_dog:
                animalImage.setImageResource(R.drawable.dog);
                isDog = true;
                isGiraffe = false;
                isCat = false;
                animal = "dog";
                break;
            case R.id.btn_cat:
                animalImage.setImageResource(R.drawable.img_1);
                isCat = true;
                isGiraffe = false;
                isDog = false;
                animal = "cat";
                break;
            case R.id.btn_giraffe:
                animalImage.setImageResource(R.drawable.img);
                isGiraffe = true;
                isCat = false;
                isDog = false;
                animal = "giraffe";
                break;
        }
    }


    public void answer(View view){
        switch (view.getId()){
            case R.id.btn_that_dog:
                if (isDog) {
                    Toast.makeText(getApplicationContext(), "верно", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(getApplicationContext(), "не верно", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_that_cat:
                if (isCat) {
                    Toast.makeText(getApplicationContext(), "верно", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(getApplicationContext(), "не верно", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_that_giraffe:
                if (isGiraffe) {
                    Toast.makeText(getApplicationContext(), "верно", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(getApplicationContext(), "не верно", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}