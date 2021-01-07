package defpackage;

import android.view.View;

/* renamed from: h0f  reason: default package */
public final /* synthetic */ class h0f implements View.OnClickListener {
    public final /* synthetic */ l0f a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ h0f(l0f l0f, da2 da2) {
        this.a = l0f;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.C(this.b, view);
    }
}
