package defpackage;

import android.view.View;

/* renamed from: egf  reason: default package */
public final /* synthetic */ class egf implements View.OnClickListener {
    public final /* synthetic */ lgf a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ egf(lgf lgf, da2 da2) {
        this.a = lgf;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.i(this.b, view);
    }
}
