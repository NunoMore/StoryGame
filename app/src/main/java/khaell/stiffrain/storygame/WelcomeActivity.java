package khaell.stiffrain.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mStartButton = findViewById(R.id.startAppButton);


        // TODO: send welcome signal and think about other stuff...



        // Start App
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startApp();
            }
        });
    }

    private void startApp(){
        finish();
        startActivity(new Intent(WelcomeActivity.this, MenuActivity.class));
    }
}
