package me.unnikrishnanpatel.jokeandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Intent i =getIntent();
        TextView joke = (TextView)findViewById(R.id.jokeTextView);
        joke.setText(i.getStringExtra("joke"));
    }
}
