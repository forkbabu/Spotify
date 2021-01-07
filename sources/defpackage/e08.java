package defpackage;

import android.view.ViewGroup;

/* renamed from: e08  reason: default package */
public final /* synthetic */ class e08 implements Runnable {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ float b;

    public /* synthetic */ e08(ViewGroup viewGroup, float f) {
        this.a = viewGroup;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setY(this.b);
    }
}
