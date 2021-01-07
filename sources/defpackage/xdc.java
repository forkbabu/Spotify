package defpackage;

import android.view.View;

/* renamed from: xdc  reason: default package */
public final /* synthetic */ class xdc implements View.OnClickListener {
    public final /* synthetic */ aec a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ xdc(aec aec, da2 da2) {
        this.a = aec;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.k(this.b, view);
    }
}
