package com.example.notepad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas c){
        /*invalidate();
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        c.drawLine(20, 50, 100, 50, p);*/
    }
}
/*
//mainActivity
package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_edit_realetive);
        DrawView v = new DrawView(this);
        setContentView(v);
    }
}
 */