package sample.com.janken;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    int gu = 0;
    int choki = 1;
    int pa = 2;

    int myHand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int id = intent.getIntExtra("My_Hand",0);

        ImageView imageView = findViewById(R.id.myHandImage);
//        Log.d("tag=======", String.valueOf(id));

        //プレイヤーが出す手
        switch(id){
            case R.id.gu:
                imageView.setImageResource(R.drawable.gu);
                myHand = 0;
                break;

            case R.id.choki:
                imageView.setImageResource(R.drawable.choki);
                myHand = 1;
                break;

            case R.id.pa:
                imageView.setImageResource(R.drawable.pa);
                myHand = 2;
                break;
        }

        //コンピューターが出す手
        ImageView imageView2 = findViewById(R.id.conHandImage);

        int conHand = (int)(Math.random() * 3);
        switch(conHand){
            case 0:
                imageView2.setImageResource(R.drawable.com_gu);
                break;

            case 1:
                imageView2.setImageResource(R.drawable.com_choki);
                break;

            case 2:
                imageView2.setImageResource(R.drawable.com_pa);
                break;
        }



        int gameResult = (conHand - myHand + 3) % 3;
        TextView textView = findViewById(R.id.resultLabel);
        switch(gameResult){
            case 0:
                textView.setText("引き分けです");
                break;
            case 1:
                textView.setText("勝ちました");
                break;
            case 2:
                textView.setText("負けました");
                break;
        }

        final Button finishButton = findViewById(R.id.backButton);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}







