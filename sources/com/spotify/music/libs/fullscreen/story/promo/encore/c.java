package com.spotify.music.libs.fullscreen.story.promo.encore;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.h;

final class c implements View.OnTouchListener {
    final /* synthetic */ Ref$FloatRef a;

    c(Ref$FloatRef ref$FloatRef) {
        this.a = ref$FloatRef;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h.d(motionEvent, "event");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.a.element = motionEvent.getRawX();
        return false;
    }
}
