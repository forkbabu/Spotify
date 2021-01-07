package defpackage;

import android.view.View;

/* renamed from: yff  reason: default package */
public final /* synthetic */ class yff implements View.OnClickListener {
    public final /* synthetic */ lgf a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ yff(lgf lgf, da2 da2) {
        this.a = lgf;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j(this.b, view);
    }
}
