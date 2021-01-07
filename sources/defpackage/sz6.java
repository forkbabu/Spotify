package defpackage;

import android.widget.FrameLayout;

/* renamed from: sz6  reason: default package */
public final /* synthetic */ class sz6 implements Runnable {
    public final /* synthetic */ a07 a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ sz6(a07 a07, FrameLayout frameLayout) {
        this.a = a07;
        this.b = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.B(this.b);
    }
}
