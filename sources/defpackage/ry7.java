package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: ry7  reason: default package */
public final /* synthetic */ class ry7 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup.LayoutParams b;

    public /* synthetic */ ry7(View view, ViewGroup.LayoutParams layoutParams) {
        this.a = view;
        this.b = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setLayoutParams(this.b);
    }
}
