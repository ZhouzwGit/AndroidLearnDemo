package demo.myself.com.androidlearndemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import demo.myself.com.androidlearndemo.Activity.FollowingBollActivity;
import demo.myself.com.androidlearndemo.Activity.FrameLayoutActivity;
import demo.myself.com.androidlearndemo.Activity.TableLayoutActivity;

public class MainActivity extends AppCompatActivity {
    Button button,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.followboll_id);
        button2 = findViewById(R.id.tablelaout_id);
        button3 = findViewById(R.id.framelayout_id);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FollowingBollActivity.class);
                startActivity(intent);
            }
        });

    }
}
