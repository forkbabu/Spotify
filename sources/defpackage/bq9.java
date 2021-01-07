package defpackage;

import android.view.View;

/* renamed from: bq9  reason: default package */
public final /* synthetic */ class bq9 implements Runnable {
    public final /* synthetic */ cq9 a;
    public final /* synthetic */ s81 b;
    public final /* synthetic */ View c;

    public /* synthetic */ bq9(cq9 cq9, s81 s81, View view) {
        this.a = cq9;
        this.b = s81;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b, this.c);
    }
}
