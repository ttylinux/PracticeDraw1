package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import static android.R.attr.path;

public class Practice9DrawPathView extends View {

    private  Paint paint  = new Paint();
    Path path = new Path();
    Path pathTwo = new Path();
    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100); // 画斜线
//        path.moveTo(200, 100); // 从原点(0,0)作为起点，进行移动
//        path.lineTo(200, 0); // 画竖线;然后，这个绘制的时候，使用的起点是(200,100)，因为执行了了moveTo(200,100)


//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        RectF rectf = new RectF(100, 100, 300, 300);
//        path.arcTo(rectf, -280, 280, false); // true为强制移动到弧形起点（无痕迹）；false为有痕迹，从前面的绘制起点(100,100)，拉到弧形的绘制起点,然后，开始绘制弧形


//        paint.setStyle(Paint.Style.STROKE);
//        path.moveTo(100, 100);
//        path.lineTo(200, 100);
//        path.lineTo(150, 150);
//        path.close();

        paint.setStyle(Paint.Style.STROKE); // 不填满
        RectF rectf = new RectF(200, 200, 400, 400);
        path.addArc(rectf, -225, 225);  //画一个弧形
        RectF rectfSecond = new RectF(400, 200, 600, 400);
        path.arcTo(rectfSecond, -180, 225, false); //再画一个弧形，设置为false，表示从绘制起点开始有痕迹，绘制起点是前面一个弧形的绘制终点
        path.lineTo(400, 542);
        canvas.drawPath(path, paint);


        paint.setStyle(Paint.Style.FILL); // Paint.Style.FILL，将图形填满
        RectF rectfFill = new RectF(600, 200, 800, 400);
        pathTwo.addArc(rectfFill, -225, 225);  //画一个弧形
        RectF rectfSecondFill = new RectF(800, 200, 1000, 400);
        pathTwo.arcTo(rectfSecondFill, -180, 225, false); //再画一个弧形，设置为false，表示从绘制起点开始有痕迹，绘制起点是前面一个弧形的绘制终点
        pathTwo.lineTo(800, 542);
        canvas.drawPath(pathTwo, paint);

    }
}
