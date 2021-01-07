package defpackage;

import android.view.ViewGroup;

/* renamed from: qp0  reason: default package */
public final /* synthetic */ class qp0 implements Runnable {
    public final /* synthetic */ ViewGroup a;

    public /* synthetic */ qp0(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeAllViews();
    }
}
