package msku.ceng.mysecretdiary.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import msku.ceng.mysecretdiary.R;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        button = (Button) findViewById(R.id.enterButtonMain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,NotesActivity.class);
             startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}