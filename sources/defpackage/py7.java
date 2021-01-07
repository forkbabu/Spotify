package defpackage;

import android.view.View;

/* renamed from: py7  reason: default package */
public final /* synthetic */ class py7 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;

    public /* synthetic */ py7(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        view.setPadding(0, view.getPaddingTop() + this.b, 0, 0);
    }
}
