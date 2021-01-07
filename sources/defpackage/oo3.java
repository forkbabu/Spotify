package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: oo3  reason: default package */
public final /* synthetic */ class oo3 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public /* synthetic */ oo3(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        View view2 = this.b;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view.getHitRect(rect);
        view2.getHitRect(rect2);
        rect2.bottom = rect.height();
        view.setTouchDelegate(new TouchDelegate(rect2, view2));
    }
}
