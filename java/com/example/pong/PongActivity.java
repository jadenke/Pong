package com.example.pong;

import android.app.Activity;
import android.view.Window;
import android.graphics.Point;
import android.view.Display;
import android.os.Bundle;

public class PongActivity extends Activity {
    private PongGame mPongGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Display display = getWindowManager().getDefaultDisplay();

        Point size = new Point();

        display.getSize(size);

        mPongGame = new PongGame(this, size.x, size.y);

        setContentView(mPongGame);


        //setContentView(R.layout.activity_main);
    }
    @Override

    protected void onResume() {

        super.onResume();

        // More code here later in the chapter

    }

    @Override

    protected void onPause() {

        super.onPause();

        // More code here later in the chapter

    }
}