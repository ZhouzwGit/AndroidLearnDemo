package demo.myself.com.androidlearndemo.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.jar.Attributes;

/**
 * Created by zzw on 2018/12/3.
 */

public class FollowingBoll extends View {
    private  float currentX = 40;
    private  float currentY = 50;
    Paint paint = new Paint();
    public FollowingBoll(Context context) {
        super(context);
    }
    public FollowingBoll(Context context, AttributeSet attributes) {
        super(context,attributes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(currentX,currentY,15,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX = event.getX();
        currentY = event.getY();
        invalidate();
        return true;
    }
}