package defpackage;

import android.view.View;
import defpackage.sna;
import defpackage.zhc;

/* renamed from: vhc  reason: default package */
public final /* synthetic */ class vhc implements View.OnClickListener {
    public final /* synthetic */ zhc a;
    public final /* synthetic */ sna.a b;
    public final /* synthetic */ zhc.b c;

    public /* synthetic */ vhc(zhc zhc, sna.a aVar, zhc.b bVar) {
        this.a = zhc;
        this.b = aVar;
        this.c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.f(this.b, this.c, view);
    }
}
