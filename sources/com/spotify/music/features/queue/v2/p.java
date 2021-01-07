package com.spotify.music.features.queue.v2;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.h;

final class p implements View.OnTouchListener {
    final /* synthetic */ o a;
    final /* synthetic */ h90 b;

    p(o oVar, h90 h90) {
        this.a = oVar;
        this.b = h90;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h.e(view, "<anonymous parameter 0>");
        h.e(motionEvent, "event");
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.a.o.x(this.b);
        return false;
    }
}
