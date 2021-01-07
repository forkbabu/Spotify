package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: ui5  reason: default package */
public final /* synthetic */ class ui5 implements Runnable {
    public final /* synthetic */ zi5 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ uu1 f;
    public final /* synthetic */ Runnable n;

    public /* synthetic */ ui5(zi5 zi5, View view, WeakReference weakReference, uu1 uu1, Runnable runnable) {
        this.a = zi5;
        this.b = view;
        this.c = weakReference;
        this.f = uu1;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b, this.c, this.f, this.n);
    }
}
