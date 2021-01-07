package defpackage;

import android.view.View;

/* renamed from: gr7  reason: default package */
public final /* synthetic */ class gr7 implements View.OnClickListener {
    public final /* synthetic */ pr7 a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ gr7(pr7 pr7, da2 da2) {
        this.a = pr7;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.q(this.b, view);
    }
}
