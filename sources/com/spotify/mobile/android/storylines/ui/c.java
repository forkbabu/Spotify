package com.spotify.mobile.android.storylines.ui;

import android.view.MotionEvent;
import android.view.View;

public final /* synthetic */ class c implements View.OnTouchListener {
    public final /* synthetic */ StorylinesView a;

    public /* synthetic */ c(StorylinesView storylinesView) {
        this.a = storylinesView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.q(view, motionEvent);
        return true;
    }
}
