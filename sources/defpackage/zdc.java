package defpackage;

import android.view.View;

/* renamed from: zdc  reason: default package */
public final /* synthetic */ class zdc implements View.OnClickListener {
    public final /* synthetic */ aec a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ zdc(aec aec, da2 da2) {
        this.a = aec;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.m(this.b, view);
    }
}
