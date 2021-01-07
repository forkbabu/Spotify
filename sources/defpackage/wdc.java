package defpackage;

import android.view.View;

/* renamed from: wdc  reason: default package */
public final /* synthetic */ class wdc implements View.OnClickListener {
    public final /* synthetic */ aec a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ wdc(aec aec, da2 da2) {
        this.a = aec;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j(this.b, view);
    }
}
