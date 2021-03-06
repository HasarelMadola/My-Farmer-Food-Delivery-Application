package com.mobile.dev.hasarel.myfarmer.CustomViews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class OneByOneRelativeLayout extends RelativeLayout {

    public OneByOneRelativeLayout(Context context) {
        super(context);
    }

    public OneByOneRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OneByOneRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(heightMeasureSpec, heightMeasureSpec);
    }

}
