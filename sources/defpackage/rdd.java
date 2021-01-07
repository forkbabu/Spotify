package defpackage;

import android.view.View;

/* renamed from: rdd  reason: default package */
public final /* synthetic */ class rdd implements View.OnClickListener {
    public final /* synthetic */ wdd a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ rdd(wdd wdd, da2 da2) {
        this.a = wdd;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(this.b, view);
    }
}
