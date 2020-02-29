package com.example.imageviewproblem1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView myImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView=(ImageView)findViewById(R.id.imageView2);
    }

    public void buttonPressed(View view)
    {
        Random myRandom=new Random();
        int x=myRandom.nextInt(3);
        switch(x)
        {
            case 0:
                myImageView.setImageResource(R.drawable.londoneye);
                break;
            case 1:
                myImageView.setImageResource(R.drawable.wullie);
                break;
            case 2:
                myImageView.setImageResource(R.drawable.niagara);
                break;
        }
    }
}
