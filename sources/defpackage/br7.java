package defpackage;

import android.view.View;

/* renamed from: br7  reason: default package */
public final /* synthetic */ class br7 implements View.OnClickListener {
    public final /* synthetic */ pr7 a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ br7(pr7 pr7, da2 da2) {
        this.a = pr7;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.n(this.b, view);
    }
}
