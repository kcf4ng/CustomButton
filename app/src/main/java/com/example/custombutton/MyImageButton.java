package com.example.custombutton;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyImageButton extends LinearLayout {

    public MyImageButton(Context context,int imgId, String str1, String str2) {
        super(context);
        mButtonImage = new ImageButton(context);
        mButtonText = new TextView(context);
        mButtonText2 = new TextView(context);

        mButtonImage.setImageResource(imgId);
        mButtonImage.setPadding(0,0,0,0);


        mButtonText.setText(str1);
        mButtonText.setPadding(0,0,0,0);

        mButtonText2.setText(str2);
        mButtonText2.setPadding(0,0,0,0);

        setClickable(true);
        setFocusable(true);
        setBackgroundResource(android.R.drawable.btn_default);  //佈局才用普通按鈕的背景
        setOrientation(LinearLayout.VERTICAL);  //垂直佈局

        addView(mButtonImage);
        addView(mButtonText);
        addView(mButtonText2);
    }

    public void setImageResource(int resId) {
        mButtonImage.setImageResource(resId);
    }

    /*
     * setText方法
     */
    public void setText(int resId) {
        mButtonText.setText(resId);
    }

    public void setText(CharSequence buttonText) {
        mButtonText.setText(buttonText);
    }
    public void setText2(CharSequence buttonText) {
        mButtonText2.setText(buttonText);
    }

    /*
     * setTextColor方法
     */
    public void setTextColor(int color) {
        mButtonText.setTextColor(color);
    }

    ImageView mButtonImage;
    TextView mButtonText;
    TextView mButtonText2;

}
