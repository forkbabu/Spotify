package defpackage;

import android.view.View;

/* renamed from: qdd  reason: default package */
public final /* synthetic */ class qdd implements View.OnClickListener {
    public final /* synthetic */ wdd a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ qdd(wdd wdd, da2 da2) {
        this.a = wdd;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.g(this.b, view);
    }
}
