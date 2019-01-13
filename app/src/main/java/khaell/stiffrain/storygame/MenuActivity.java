package khaell.stiffrain.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import khaell.stiffrain.storygame.StoryModel.Story;
import khaell.stiffrain.storygame.StoryModel.StoryListAdapter;
import khaell.stiffrain.storygame.StoryModel.TwoButtonsActivity;

public class MenuActivity extends AppCompatActivity {

    private ListView mStoryListView;
    private Button mRandomButton;

    private DatabaseReference mDatabaseReference;
    private StoryListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mDatabaseReference = FirebaseDatabase.getInstance().getReference();

        mRandomButton = findViewById(R.id.randomStoryButton);
        mStoryListView = findViewById(R.id.storyListView);


        // todo: insert random button function
        // adapter.getCount !!

    }

    @Override
    public void onStart() {
        super.onStart();

        mAdapter = new StoryListAdapter(this, mDatabaseReference);
        mStoryListView.setAdapter(mAdapter);

        mStoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Story story = mAdapter.getItem(position);
                startActivity(new Intent(MenuActivity.this, TwoButtonsActivity.class).putExtra("story", story));

            }
        });
    }
}
