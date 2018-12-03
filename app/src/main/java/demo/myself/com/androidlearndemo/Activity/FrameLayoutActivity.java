package demo.myself.com.androidlearndemo.Activity;

import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import demo.myself.com.androidlearndemo.R;

public class FrameLayoutActivity extends AppCompatActivity {
    private int currentColor = 0;
    int[] colors = new int[]{
            Color.WHITE,
            Color.BLACK,
            Color.BLUE,
            Color.GREEN,
            Color.RED,
            Color.YELLOW
    };
    int[] names = new int[]{
            R.id.view1,
            R.id.view2,
            R.id.view3,
            R.id.view4,
            R.id.view5,
            R.id.view6
    };
    TextView[] views = new TextView[names.length];
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1234){
                for (int i = 0; i < names.length;i++){
                    views[i].setBackgroundColor(colors[(i+currentColor)%names.length]);
                }
                currentColor++;
            }
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        for (int i=0;i<names.length;i++){
            views[i]= findViewById(names[i]);
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(1234);
            }
        }, 0,200);

    }
}
