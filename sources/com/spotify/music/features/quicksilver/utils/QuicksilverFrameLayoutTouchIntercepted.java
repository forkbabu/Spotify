package com.spotify.music.features.quicksilver.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class QuicksilverFrameLayoutTouchIntercepted extends FrameLayout {
    public QuicksilverFrameLayoutTouchIntercepted(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public QuicksilverFrameLayoutTouchIntercepted(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
