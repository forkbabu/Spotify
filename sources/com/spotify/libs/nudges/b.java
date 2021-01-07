package com.spotify.libs.nudges;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import kotlin.jvm.internal.h;

final class b implements View.OnTouchListener {
    final /* synthetic */ Button a;

    b(c cVar, Button button, DefaultNudge defaultNudge) {
        this.a = button;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h.d(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.setAlpha(0.7f);
            return false;
        } else if (action != 1 && action != 3 && action != 4) {
            return false;
        } else {
            this.a.setAlpha(1.0f);
            return false;
        }
    }
}
