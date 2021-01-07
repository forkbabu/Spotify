package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: rab  reason: default package */
public final /* synthetic */ class rab implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ rab(View view, boolean z, ViewGroup viewGroup) {
        this.a = view;
        this.b = z;
        this.c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        boolean z = this.b;
        ViewGroup viewGroup = this.c;
        if (view == null) {
            return;
        }
        if (z) {
            x4 a2 = q4.a(view);
            a2.d(400);
            a2.a(0.0f);
            a2.n(new sab(viewGroup, view));
            a2.j();
            return;
        }
        viewGroup.removeView(view);
    }
}
