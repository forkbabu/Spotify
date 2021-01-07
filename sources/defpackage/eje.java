package defpackage;

import android.view.View;

/* renamed from: eje  reason: default package */
public final /* synthetic */ class eje implements View.OnClickListener {
    public final /* synthetic */ jje a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ eje(jje jje, da2 da2) {
        this.a = jje;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.h(this.b, view);
    }
}
