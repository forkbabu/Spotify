package defpackage;

import android.view.View;

/* renamed from: rq7  reason: default package */
public final /* synthetic */ class rq7 implements View.OnClickListener {
    public final /* synthetic */ pr7 a;
    public final /* synthetic */ da2 b;

    public /* synthetic */ rq7(pr7 pr7, da2 da2) {
        this.a = pr7;
        this.b = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.o(this.b, view);
    }
}
