package defpackage;

import android.view.View;

/* renamed from: kgf  reason: default package */
public final /* synthetic */ class kgf implements View.OnClickListener {
    public final /* synthetic */ lgf a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ kgf(lgf lgf, da2 da2) {
        this.a = lgf;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.o(this.b, view);
    }
}
