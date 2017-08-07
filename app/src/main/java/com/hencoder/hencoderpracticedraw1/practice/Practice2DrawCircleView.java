package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint  fillPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint strokePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint bluePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint widthStrokePaint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
          //实心圆
         fillPaint.setStyle(Paint.Style.FILL);
         canvas.drawCircle(100,100,100,fillPaint);

        //空心圆
        strokePaint.setColor(Color.RED);
        strokePaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(300,100,100,strokePaint);

        //蓝色实心圆
        bluePaint.setColor(Color.BLUE);
        bluePaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(100,300,100,bluePaint);

        //线宽为20的空心圆
        widthStrokePaint.setStyle(Paint.Style.STROKE);
        widthStrokePaint.setStrokeWidth(20);
        canvas.drawCircle(350,350,100,widthStrokePaint);

    }
}
