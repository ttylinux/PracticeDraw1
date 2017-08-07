package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint = new Paint();


    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        //实现思路：
        //1.画竖线
        //2.画横线
        //3.横线的长度，被7等分划分
        paint.setStrokeWidth(3);
        paint.setColor(Color.GRAY);
        canvas.drawLine(100,100,100,600,paint);
        canvas.drawLine(100,600,800,600,paint);

        //画直方图，所有直方图的，初始坐标(left,top)
        paint.setColor(Color.GREEN);

        //画直方图
        canvas.drawRect(200,580,280,600,paint);

        canvas.drawRect(290,580,370,600,paint); //左右间隔10个像素;然后，宽度80个像素,290+80;高度不变

        canvas.drawRect(380,500,460,600,paint);

        canvas.drawRect(470,400,550,600,paint);

        canvas.drawRect(560,360,640,600,paint);

        canvas.drawRect(650,510,730,600,paint);


        //画文字
        paint.setTextSize(32);
        paint.setColor(Color.WHITE);
        canvas.drawText("GB", 200, 630, paint);
        canvas.drawText("ICS", 290, 630, paint);
        canvas.drawText("JB", 380, 630, paint);
        canvas.drawText("JB", 380, 630, paint);
        canvas.drawText("Kitkat", 470, 630, paint);
        canvas.drawText("L", 560, 630, paint);
        canvas.drawText("M", 650, 630, paint);

    }
}
