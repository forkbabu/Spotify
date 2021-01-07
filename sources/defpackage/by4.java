package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: by4  reason: default package */
public final /* synthetic */ class by4 implements View.OnTouchListener {
    public final /* synthetic */ iy4 a;

    public /* synthetic */ by4(iy4 iy4) {
        this.a = iy4;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.w(view, motionEvent);
        return false;
    }
}
