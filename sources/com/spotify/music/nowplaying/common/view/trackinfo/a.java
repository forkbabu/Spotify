package com.spotify.music.nowplaying.common.view.trackinfo;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class a implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector a;

    public /* synthetic */ a(GestureDetector gestureDetector) {
        this.a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.a;
        int i = MarqueeTrackInfoView.o;
        if (!gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        view.performClick();
        return true;
    }
}
