package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

//        RectF rectf = new RectF(200,200,400,400);
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.RED);
//        canvas.drawArc(rectf,-180,135,true,paint);


        RectF rectfOther = new RectF(250,250,450,450);
        paint.setColor(Color.BLUE);
        canvas.drawArc(rectfOther,65,115,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectfOther,30,30,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(rectfOther,18,10,true,paint);

        paint.setColor(Color.MAGENTA);
        canvas.drawArc(rectfOther,0,15,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(rectfOther,-80,80,true,paint);
    }
}
