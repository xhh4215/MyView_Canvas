package com.example.xiaoheihei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by xhh on 2017/10/10.
 */

public class CanvasView extends View {
    private Paint paint;

    public CanvasView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画布相关的移动的操作
        //canvas.rotate(30,0,0);
        //canvas.scale(0.5f,1);
        //canvas.translate(100,100);
        //canvas.skew(1.732f,0);
        //canvas.drawRect(100,100,500,300,paint);
        //画布的裁剪的操作
//        canvas.drawColor(Color.YELLOW);
//        canvas.clipRect(new RectF(100, 100, 200, 200));
//        canvas.drawColor(Color.RED);
        //画布的保存和恢复操作
        canvas.drawColor(Color.RED);
        canvas.save();
        canvas.clipRect(new RectF(200,200,300,300));
        canvas.restore();
        canvas.drawColor(Color.BLACK);

    }
}
