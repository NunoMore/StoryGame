package khaell.stiffrain.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

public class StoryRowActivity extends AppCompatActivity {

    private TextView mStoryTitle;
    private Button mReadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_row);

        mReadButton = findViewById(R.id.readStoryButton);
        mStoryTitle = findViewById(R.id.storyTitleRow);

        // todo: start story

        mReadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readStory();
            }
        });
    }

    private void readStory(){
        // todo: make readStory function start a specific story
        finish();
        startActivity(new Intent(StoryRowActivity.this, TwoButtonsActivity.class));

    }

    private String getStoryData(String data){

        return "";
    }
}
