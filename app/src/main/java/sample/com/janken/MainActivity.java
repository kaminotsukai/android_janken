package sample.com.janken;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton1,imageButton2,imageButton3;
        imageButton1 = findViewById(R.id.gu);
        imageButton2 = findViewById(R.id.choki);
        imageButton3 = findViewById(R.id.pa);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onJankenbuttonTapping(v);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onJankenbuttonTapping(v);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onJankenbuttonTapping(v);
            }
        });


    }

    public void onJankenbuttonTapping(View view){
        Intent intent = new Intent(this,ResultActivity.class);
        //name：追加したい情報のキー（自由）　value：追加する値
        intent.putExtra("My_Hand", view.getId());
        startActivity(intent);

    }
}
