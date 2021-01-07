package defpackage;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.h;

/* renamed from: dxc  reason: default package */
final class dxc implements View.OnTouchListener {
    final /* synthetic */ exc a;
    final /* synthetic */ View b;

    dxc(exc exc, View view) {
        this.a = exc;
        this.b = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        h.e(view, "<anonymous parameter 0>");
        h.e(motionEvent, "<anonymous parameter 1>");
        this.b.setOnTouchListener(null);
        this.a.m();
        return false;
    }
}
