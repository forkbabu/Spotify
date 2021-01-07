package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: sab  reason: default package */
public final /* synthetic */ class sab implements Runnable {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;

    public /* synthetic */ sab(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeView(this.b);
    }
}
