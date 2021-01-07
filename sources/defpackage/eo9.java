package defpackage;

import android.view.View;

/* renamed from: eo9  reason: default package */
public final /* synthetic */ class eo9 implements Runnable {
    public final /* synthetic */ fo9 a;
    public final /* synthetic */ s81 b;
    public final /* synthetic */ View c;

    public /* synthetic */ eo9(fo9 fo9, s81 s81, View view) {
        this.a = fo9;
        this.b = s81;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i(this.b, this.c);
    }
}
